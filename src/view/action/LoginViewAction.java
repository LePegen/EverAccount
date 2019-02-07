package view.action;

import controller.Controller;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.wrapped.WrappedLoginModel;
import model.wrapped.WrappedOverviewModel;
import view.LoginAccountView;
import view.LoginView;

/**
 *
 * @author Lezned
 */
public class LoginViewAction extends ActionHandler {

    public LoginViewAction(Controller cont) {
        super(cont);
    }

    /**
     * LoginView will pass the text from password field
     *
     * @param password
     * @return true if account matched
     */
    public boolean checkAccount() {

        try {
            ((WrappedLoginModel) controller.getCurrentModel()).updateModelView(controller.getCurrentView()); //will get the username and password from view and set it to the model

            if (((WrappedLoginModel) controller.getCurrentModel()).checkPassword()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginViewAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public void loginPressAction() {
        if (checkAccount()) {
            WrappedLoginModel currentModel=(WrappedLoginModel) controller.getCurrentModel();
            int userID = ((WrappedLoginModel) controller.getCurrentModel()).getModel().getUserID();
            controller.getCurrentView().setVisible(false);
            controller.selectOverview();
            ((WrappedOverviewModel) controller.getCurrentModel()).setUserID(userID);
            controller.update(); //updates model and view
            controller.getSession().setUserKey(currentModel.getHashed16Password());
            controller.getCurrentView().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");

        }
    }

    public void changeView(int view) {
        controller.getCurrentView().setVisible(false); //hides login view

        controller.selectLoginAccount();

        switch (view) {
            case ADD_ACCOUNT:
                ((LoginAccountView) controller.getCurrentView()).getBtnChangePass().setVisible(false);
                ((LoginAccountView) controller.getCurrentView()).getBtnCreateAccount().setVisible(true);
                ((LoginAccountView) controller.getCurrentView()).getPwfOldAccountPassword().setEnabled(false);
                controller.getCurrentView().setVisible(true);
                break;
            case CHANGE_PASSWORD:
                ((LoginAccountView) controller.getCurrentView()).getBtnCreateAccount().setVisible(false);
                ((LoginAccountView) controller.getCurrentView()).getBtnChangePass().setVisible(true);

                controller.getCurrentView().setVisible(true);
                break;
        }
    }

    public boolean checkFieldText() {

        String tfUsername = ((LoginView) controller.getCurrentView()).getTfUsername().getText();
        String pwfPassword = ((LoginView) controller.getCurrentView()).getPwfAccountPassword().getText();

        if ((tfUsername.equals("") || tfUsername.equals("Enter username")) && (pwfPassword.equals("") || pwfPassword.equals("admin"))) {
            ((LoginView) controller.getCurrentView()).getLblError().setForeground(new java.awt.Color(255, 0, 0));
            ((LoginView) controller.getCurrentView()).getLblError1().setForeground(new java.awt.Color(255, 0, 0));
            return false;
        }

        return true;
    }

    public void defaultText() {
        ((LoginView) controller.getCurrentView()).setTfUsername("Enter username");
        ((LoginView) controller.getCurrentView()).getTfUsername().setForeground(Color.LIGHT_GRAY);
        ((LoginView) controller.getCurrentView()).setPwfAccountPassword("");
        ((LoginView) controller.getCurrentView()).getLblError().setForeground(new java.awt.Color(255,255,255));
        ((LoginView) controller.getCurrentView()).getLblError1().setForeground(new java.awt.Color(255,255,255));
    }
}
