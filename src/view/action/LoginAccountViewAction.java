package view.action;

import controller.Controller;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.wrapped.WrappedLoginAccountModel;
import view.LoginAccountView;
import view.LoginView;

/**
 *
 * @author Gene Garcia
 */
public class LoginAccountViewAction extends ActionHandler {

    public LoginAccountViewAction(Controller cont) {
        super(cont);
    }

    public void btnAction(int view) {
        controller.getCurrentModel().updateModelView(controller.getCurrentView());

        switch (view) {
            case ADD_ACCOUNT:

                String newPassword = ((LoginAccountView) controller.getCurrentView()).getPwfNewPassword().getText();
                String verifyPassword = ((LoginAccountView) controller.getCurrentView()).getPwfVerificationPassword().getText();

                if (newPassword.equals(verifyPassword)) {
                    controller.getCurrentModel().updateModelView(controller.getCurrentView());
                    controller.getCurrentModel().addDBModel();
                    defaultText();
                    returnAction("login");
                } else {
                    JOptionPane.showMessageDialog(null, "New password does not match.", "Everaccount", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case CHANGE_PASSWORD:
                checkPassword();
                break;
        }
    }

    public void checkPassword() {

        String oldPassword = ((LoginAccountView) controller.getCurrentView()).getPwfOldAccountPassword().getText();
        String newPassword = ((LoginAccountView) controller.getCurrentView()).getPwfNewPassword().getText();
        String verifyPassword = ((LoginAccountView) controller.getCurrentView()).getPwfVerificationPassword().getText();

        controller.getCurrentModel().updateModelView(controller.getCurrentView());
         //this overrides the password that was set in the model because the updateModelView saves the new password.
        ((WrappedLoginAccountModel) controller.getCurrentModel()).getModel().setPassword(oldPassword);
       
        
        boolean doesPasswordMatch = ((WrappedLoginAccountModel) controller.getCurrentModel()).checkPassword();

        if (doesPasswordMatch && newPassword.equals(verifyPassword)) {

            ((WrappedLoginAccountModel) controller.getCurrentModel()).getModel().setPassword(newPassword);
            ((WrappedLoginAccountModel) controller.getCurrentModel()).updateDBModel(); //new password

            defaultText();
            returnAction("login");

        } else {

            if (!doesPasswordMatch) {
                JOptionPane.showMessageDialog(null, "Incorrect old password.", "Everaccount", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "New password does not match.", "Everaccount", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public boolean checkFieldText() {

        String tfUsername = ((LoginAccountView) controller.getCurrentView()).getTfUsername().getText();
        String oldPassword = ((LoginAccountView) controller.getCurrentView()).getPwfOldAccountPassword().getText();
        String newPassword = ((LoginAccountView) controller.getCurrentView()).getPwfNewPassword().getText();
        String verifyPassword = ((LoginAccountView) controller.getCurrentView()).getPwfNewPassword().getText();

        if (tfUsername.equals("") && newPassword.equals("") && oldPassword.equals("") && verifyPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please properly fill up all fields.", "Everaccount", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    public void defaultText() {
        ((LoginAccountView) controller.getCurrentView()).setTfUsername("Enter username");
        ((LoginAccountView) controller.getCurrentView()).getTfUsername().setForeground(Color.LIGHT_GRAY);
    }
}
