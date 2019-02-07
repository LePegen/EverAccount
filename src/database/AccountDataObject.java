package database;

import database.DBConnection;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.AccountModel;

/**
 *
 * @author Lezned
 */
public class AccountDataObject extends DataObject {

    public AccountDataObject(DBConnection connection) {
        super(connection);
    }

    /**
     * before calling this method, model should be updated. From model to
     * updateAccount to Database.
     *
     * @param accountKey
     * @param model
     * @throws SQLException
     */
    public void upateAccount(AccountModel model) throws SQLException {

        String command = "UPDATE ACCOUNT "
                + "SET PROVIDER = (?) "
                + ",UNIQUENAME = (?) "
                + ",EMAIL = (?) "
                + ",USERNAME = (?) "
                + ",ACCOUNTPASSWORD = (?) "
                + ",ADDITIONALINFORMATION = (?)"
                + ",ENCRYPTIONKEY = (?) "
                + "WHERE ACCOUNTID = (?) ";

        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setString(1, model.getProvider());
        pStatement.setString(2, model.getUniqueName());
        pStatement.setString(3, model.getEmail());
        pStatement.setString(4, model.getUsername());
        pStatement.setString(5, model.getPassword());
        pStatement.setString(6, model.getAdditionalInformation());
        pStatement.setBytes(7, model.getEncryptionKey());
        pStatement.setInt(8, model.getAccountID());

        this.connection.executeCommand(pStatement, true);
    }

    public void addAccount(AccountModel model) throws SQLException {

        String command = "INSERT INTO ACCOUNT("
                + "USERID,"
                + "PROVIDER,"
                + "UNIQUENAME,"
                + "EMAIL,"
                + "USERNAME,"
                + "ACCOUNTPASSWORD,"
                + "ADDITIONALINFORMATION,"
                + "ENCRYPTIONKEY)"
                + " VALUES ( (?), (?), (?), (?), (?), (?), (?), (?) )";

        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setInt(1, model.getUserID());
        pStatement.setString(2, model.getProvider());
        pStatement.setString(3, model.getUniqueName());
        pStatement.setString(4, model.getEmail());
        pStatement.setString(5, model.getUsername());
        pStatement.setString(6, model.getPassword());
        pStatement.setString(7, model.getAdditionalInformation());
        pStatement.setBinaryStream (8, new ByteArrayInputStream(model.getEncryptionKey()), model.getEncryptionKey().length);

        this.connection.executeCommand(pStatement, true);
    }

    public void deleteAccount(AccountModel model) throws SQLException {
        String commands = "DELETE FROM ACCOUNT WHERE UNIQUENAME = (?)";

        PreparedStatement pStatement = this.connection.prepareStatement(commands);

        pStatement.setString(1, model.getUniqueName());

        this.connection.executeCommand(pStatement, true);
    }

    public AccountModel getAccount(int accID) throws SQLException {
        String command = "SELECT * FROM ACCOUNT WHERE ACCOUNTID = (?)";

        PreparedStatement pStatement = this.connection.prepareStatement(command);

        pStatement.setInt(1, accID);

        this.connection.executeCommand(pStatement, false);

        ResultSet set = this.connection.getData();
        AccountModel model = new AccountModel();
        set.next();

        model.setAccountID(set.getInt("ACCOUNTID"));
        model.setUserID(set.getInt("USERID"));
        model.setProvider(set.getString("PROVIDER"));
        model.setUniqueName(set.getString("UNIQUENAME"));
        model.setEmail(set.getString("EMAIL"));
        model.setUsername(set.getString("USERNAME"));
        model.setPassword(set.getString("ACCOUNTPASSWORD"));
        model.setAdditionalInformation(set.getString("ADDITIONALINFORMATION"));
        Blob encrpytionKeyBlob = set.getBlob("ENCRYPTIONKEY");

        byte[] keyBytes = encrpytionKeyBlob.getBytes(1, (int) encrpytionKeyBlob.length());
        encrpytionKeyBlob.free();

        model.setEncryptionKey(keyBytes);

        return model;

    }
}
