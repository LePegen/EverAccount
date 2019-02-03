package database;

import database.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.AccountModel;

/**
 *
 * @author Gene Garcia
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

        String query = String.format(
                "UPDATE ACCOUNT "
                + "SET PROVIDER = '%s' "
                + ",UNIQUENAME = '%s' "
                + ",EMAIL = '%s' "
                + ",USERNAME = '%s' "
                + ",ACCOUNTPASSWORD = '%s' "
                + ",ADDITIONALINFORMATION = '%s' "
                + " WHERE ACCOUNTID = %d ",
                model.getProvider(),
                model.getUniqueName(),
                model.getEmail(),
                model.getUsername(),
                model.getPassword(),
                model.getAdditionalInformation(),
                model.getAccountID());
        
        System.out.println(query);
        
        this.connection.executeCommand(query, true);

    }

    public void addAccount(AccountModel model) throws SQLException {

        String query = String.format(
                "INSERT INTO ACCOUNT("
                + "USERID,"
                + "PROVIDER,"
                + "EMAIL,"
                + "USERNAME,"
                + "ACCOUNTPASSWORD,"
                + "UNIQUENAME,"
                + "ADDITIONALINFORMATION)"
                + " VALUES("
                + "%d ,"
                + "'%s' ,"
                + "'%s' ,"
                + "'%s' ,"
                + "'%s' ,"
                + "'%s' ,"
                + "'%s' "
                + ")",
                model.getUserID(),
                model.getProvider(),
                model.getEmail(),
                model.getUsername(),
                model.getPassword(),
                model.getUniqueName(),
                model.getAdditionalInformation());

        System.out.println(query);

        this.connection.executeCommand(query, true);
    }

    public AccountModel getAccount(int accID) throws SQLException {

        String query = String.format("SELECT * FROM ACCOUNT WHERE ACCOUNTID  = %d", accID);

        this.connection.executeCommand(query, false);

        ResultSet set = this.connection.getData();
        AccountModel model = new AccountModel();
        set.next();

        //Todo: implement this feature
        model.setAccountID(set.getInt("ACCOUNTID"));
        model.setUserID(set.getInt("USERID"));
        model.setUniqueName(set.getString("UNIQUENAME"));
        model.setProvider(set.getString("PROVIDER"));
        model.setEmail(set.getString("EMAIL"));
        model.setUsername(set.getString("USERNAME"));
        model.setPassword(set.getString("ACCOUNTPASSWORD"));
        model.setAdditionalInformation(set.getString("ADDITIONALINFORMATION"));

        return model;

    }
}
