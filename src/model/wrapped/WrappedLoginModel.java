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
import view.LoginView;
import view.View;

/**
 *
 * @author Lezned
 */
public class WrappedLoginModel extends WrappedModel {

    private LoginModel model;
    private LoginDataObject dataObj;
    MessageDigest messageDigest;

    public WrappedLoginModel(DBConnection connection) {
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

    /**
     *
     * @return @throws SQLException
     */
    public boolean checkPassword() throws SQLException {
        byte[] viewByte = model.getPassword();
        dataObj.getHash(model); //password from the database is stored to the model  //password from the model from the database
        byte[] storeByte = model.getPassword();
        System.out.println(Arrays.toString(viewByte));
        System.out.println(Arrays.toString(storeByte));
        if (Arrays.equals(viewByte, storeByte)) {
            return true; //match input password and password from database
        }
        return false;
    }
    
    public byte[] getHashed16Password(){
        byte[] storeByte = model.getPassword();
        byte[] tempByte= new byte[16];
        for (int i = 0; i < tempByte.length; i++) {
            tempByte[i]=storeByte[i];
        }
        byte[] digestedBytes= messageDigest.digest(tempByte);
        byte[] newBytes=new byte[256];
        for (int i = 0; i < newBytes.length; i++) {
            if(i<digestedBytes.length){
                newBytes[i]=digestedBytes[i];
            }else{
                newBytes[i]=(byte)0;
            }
        }
        
        return newBytes;
    }

    @Override
    public void updateViewModel(View currentView) {
    }

    @Override
    public void updateDBModel() {
    }

    @Override
    public void addDBModel() {
    }

    @Override
    public void updateModelView(View currentView) {
        LoginView tempView = (LoginView) currentView;

        model.setUsername(tempView.getTfUsername().getText());
        model.setPassword(messageDigest.digest(tempView.getPwfAccountPassword().getText().getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    public void updateModelDB() {

    }

}
