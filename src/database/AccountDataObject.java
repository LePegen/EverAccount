package database;

import database.DBConnection;
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

        String command = String.format(
                "UPDATE ACCOUNT "
                + "SET PROVIDER = '%s' "
                + ",UNIQUENAME = '%s' "
                + ",EMAIL = '%s' "
                + ",USERNAME = '%s' "
                + ",ACCOUNTPASSWORD = '%s' "
                + ",ADDITIONALINFORMATION = '%s'"
                + ", ENCRYPTIONKEY = %d "
                + " WHERE ACCOUNTID = %d ",
                model.getProvider(),
                model.getUniqueName(),
                model.getEmail(),
                model.getUsername(),
                model.getPassword(),
                model.getAdditionalInformation(),
                model.getEncryptionKey(),
                model.getAccountID());

        System.out.println(command);

        this.connection.executeCommand(command, true);

    }

    public void addAccount(AccountModel model) throws SQLException {

        String command = String.format(
                "INSERT INTO ACCOUNT("
                + "USERID,"
                + "PROVIDER,"
                + "UNIQUENAME,"
                + "EMAIL,"
                + "USERNAME,"
                + "ACCOUNTPASSWORD,"
                + "ADDITIONALINFORMATION,"
                + "ENCRYPTIONKEY)"
                + " VALUES( %d, '%s', '%s', '%s', '%s', '%s', '%s' , %d)",
                model.getUserID(),
                model.getProvider(),
                model.getUniqueName(),
                model.getUsername(),
                model.getPassword(),
                model.getEmail(),
                model.getAdditionalInformation(),
                model.getEncryptionKey());

        System.out.println(command);

        this.connection.executeCommand(command, true);
    }

    public void deleteAccount(AccountModel model) throws SQLException {
        String command = String.format("DELETE FROM ACCOUNT WHERE UNIQUENAME = '%s'", model.getUniqueName());

        System.out.println(command);

        this.connection.executeCommand(command, true);
    }

    public AccountModel getAccount(int accID) throws SQLException {

        String command = String.format("SELECT * FROM ACCOUNT WHERE ACCOUNTID  = %d", accID);

        System.out.println(command);

        this.connection.executeCommand(command, false);

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
        model.setEncryptionKey( set.getBytes("ENCRYPTIONKEY") );

        return model;

    }
}
