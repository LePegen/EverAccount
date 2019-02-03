package view.action;

import controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.wrapped.WrappedLoginModel;
import model.wrapped.WrappedOverviewModel;
import view.LoginAccountView;

/**
 *
 * @author Gene Garcia
 */
public class LoginViewAction extends ActionHandler {

    public final int ADD_ACCOUNT = 0;
    public final int CHANGE_PASSWORD = 1;

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
            int id = ((WrappedLoginModel) controller.getCurrentModel()).getModel().getUserID();

            System.out.println(id + " in loginPressAction()");

            controller.selectOverview();

            ((WrappedOverviewModel) controller.getCurrentModel()).setAccountID(id);

            controller.update(); //updates model and view
            controller.getCurrentView().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
    
    public void changeView(int view) {
        controller.getCurrentView().setVisible(false);
        
        controller.selectLoginAccount();
        
        switch (view) {
            case ADD_ACCOUNT:
                ((LoginAccountView) controller.getCurrentView()).getBtnCreateAccount().setEnabled(true);
                controller.getCurrentView().setVisible(true);
                break;
            case CHANGE_PASSWORD:
                ((LoginAccountView) controller.getCurrentView()).getBtnChangePass().setEnabled(true);
                controller.getCurrentView().setVisible(true);
                break;
        }
    }
    
    public void btnAction(int view){
        controller.getCurrentModel().updateModelView(controller.getCurrentView());

        switch (view) {
            case ADD_ACCOUNT:
                controller.getCurrentModel().addDBModel();
                break;
            case CHANGE_PASSWORD:
                controller.getCurrentModel().updateDBModel();
                break;
        }
    }

}
