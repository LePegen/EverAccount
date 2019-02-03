/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.LoginModel;

/**
 *
 * @author lipat
 */
public class LoginDataObject extends DataObject {

    public LoginDataObject(DBConnection connection) {
        super(connection);
    }

    public void getHash(LoginModel model) throws SQLException {
        String command = String.format("SELECT PASSWORDHASH, USERID FROM LOGIN WHERE USERNAME='%s'", model.getUsername());

        connection.openConnection(); //NOT YET CONFIGURED
        connection.executeCommand(command, false);

        ResultSet set = connection.getData();
        set.next();

        String hash = set.getString("PASSWORDHASH");
        int userID = set.getInt("USERID");

        System.out.println("user id " + userID);

        connection.closeConnection(); //NOT YET CONFIGURED

        model.setUserID(userID);
        model.setPassword(hash);
    }

    public void addAccount(LoginModel model) throws SQLException {
        String command = String.format("INSERT INTO LOGIN (USERNAME, PASSWORDHASH) VALUES ('%s', '%s')", model.getUsername(), model.getPassword());
        
        connection.executeCommand(command, true);
    }

    /**
     * LOGIN MODEL MUST BE UPDATE FIRST. VALUES WILL BE FROM TEXTFIELD FOR
     * USERNAME AND PASSWORDFIELD FOR PASSWORD
     *
     * @param model
     */
    public void changePassword(LoginModel model) throws SQLException {
        String command = String.format("UPDATE LOGIN SET PASSWORDHASH = '%s' WHERE USERNAME = '%s'", model.getPassword(), model.getUsername());

        System.out.println(command);
        
        connection.executeCommand(command, true);
    }

}
