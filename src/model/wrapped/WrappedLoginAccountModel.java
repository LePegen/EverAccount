package model.wrapped;

import database.DBConnection;
import database.LoginDataObject;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoginModel;
import view.LoginAccountView;
import view.View;

/**
 *
 * @author Lezned
 */
public class WrappedLoginAccountModel extends WrappedModel {

    private LoginModel model;
    private LoginDataObject dataObj;
    MessageDigest messageDigest;
    public WrappedLoginAccountModel(DBConnection connection) {
        super(connection);
        try {
            this.messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(WrappedLoginAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataObj = new LoginDataObject(connection);
        model = new LoginModel();
    }

    public LoginModel getModel() {
        return model;
    }
    
   
    public boolean checkPassword() {

        try {
            byte[] viewByte = model.getPassword();
            dataObj.getHash(model); //password from the database is stored to the model  //password from the model from the database
            byte[] storeByte = model.getPassword();
            System.out.println(viewByte);
            System.out.println(storeByte);
            if (Arrays.equals(viewByte,storeByte)) {
                return true; //match input password and password from database
            }
        } catch (SQLException ex) {
            Logger.getLogger(WrappedLoginAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public void updateModelView(View currentView) {
        LoginAccountView view = (LoginAccountView) currentView;
        model.setUsername(view.getTfUsername().getText());
        model.setPassword(messageDigest.digest(view.getPwfNewPassword().getText().getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    public void updateViewModel(View currentView) {
    }

    @Override
    public void updateDBModel() {
        try {
            dataObj.changePassword(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void addDBModel() {
        try {
            dataObj.addAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateModelDB() {
    }
    
  

}
