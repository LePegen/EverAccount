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
        String command = String.format("SELECT PasswordHash, UserID FROM LOGIN WHERE USERNAME='%s'", model.getUsername());
        connection.openConnection();
        connection.executeCommand(command);
        ResultSet set = connection.getData();
        set.next();
        String hash = set.getString("PasswordHash");
        int uID = set.getInt("UserID");
        System.out.println(uID);
        connection.closeConnection();
        model.setUserID(uID);
        model.setHash(hash);
    }

}
