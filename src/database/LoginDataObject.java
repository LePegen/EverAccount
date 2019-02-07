package database;

import java.sql.PreparedStatement;
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
        String command = "SELECT PASSWORDHASH, USERID FROM LOGIN WHERE USERNAME = (?)";

        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setString(1, model.getUsername());

        this.connection.executeCommand(pStatement, false);

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
        String command = "INSERT INTO LOGIN"
                + "(USERNAME, PASSWORDHASH)"
                + "VALUES (?, ?)";

        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setString(1, model.getUsername());
        pStatement.setString(2, model.getPassword());

        this.connection.executeCommand(pStatement, true);

        JOptionPane.showMessageDialog(null, "Account sucessfully created", "Everaccount", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * LOGIN MODEL MUST BE UPDATE FIRST. VALUES WILL BE FROM TEXTFIELD FOR
     * USERNAME AND PASSWORDFIELD FOR PASSWORD
     *
     * @param model
     */
    public void changePassword(LoginModel model) throws SQLException {
        String command = "UPDATE LOGIN"
                + " SET PASSWORDHASH = (?)"
                + " WHERE USERNAME = (?)";
        
        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setString(1, model.getPassword());
        pStatement.setString(2, model.getUsername());

        this.connection.executeCommand(pStatement, true);

        JOptionPane.showMessageDialog(null, model.getUsername() + "'s password was succesfully updated!", "Everaccount", JOptionPane.INFORMATION_MESSAGE);
    }

}
