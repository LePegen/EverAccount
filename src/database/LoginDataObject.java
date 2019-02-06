package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.LoginModel;

/**
 *
 * @author Lezned
 */
public class LoginDataObject extends DataObject {

    public LoginDataObject(DBConnection connection) {
        super(connection);
    }

    public void getHash(LoginModel model) throws SQLException {
        String command = String.format("SELECT PASSWORDHASH, USERID FROM LOGIN WHERE USERNAME='%s'", model.getUsername());

        System.out.println(command);

        this.connection.executeCommand(command, false);

        ResultSet set = this.connection.getData();

        set.next();

        int userID = 0;
        String hash = null;

        try {
            hash = set.getString("PASSWORDHASH");
            userID = set.getInt("USERID");
        } catch (Exception e) {

        }

        model.setUserID(userID);
        model.setPassword(hash);
    }

    public void addAccount(LoginModel model) throws SQLException {
        String command = String.format("INSERT INTO LOGIN (USERNAME, PASSWORDHASH) VALUES ('%s', '%s')", model.getUsername(), model.getPassword());

        System.out.println(command);

        connection.executeCommand(command, true);

        JOptionPane.showMessageDialog(null, "Account sucessfully created", "Everaccount", JOptionPane.INFORMATION_MESSAGE);

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

        JOptionPane.showMessageDialog(null, model.getUsername() + "'s password was succesfully updated!", "Everaccount", JOptionPane.INFORMATION_MESSAGE);
    }

}
