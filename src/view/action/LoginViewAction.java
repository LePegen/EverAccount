package view.action;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.wrapped.WrappedLoginModel;

/**
 *
 * @author Gene Garcia
 */
public class LoginViewAction extends ActionHandler{

    public LoginViewAction() {
        
    }
    
    /**
     * LoginView will pass the text from password field
     * @param password
     * @return true if account matched
     */
    public boolean checkAccount(){
        
        try {
            ((WrappedLoginModel)controller.getCurrentModel()).updateModelView(controller.getCurrentView()); //will get the username and password from view and set it to the model
            if(((WrappedLoginModel) controller.getCurrentModel()).checkPassword()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginViewAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public void loginPressAction(){
        if(checkAccount()){
           controller.selectOverview();
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
    
    
}
