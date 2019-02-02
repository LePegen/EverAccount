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
     *  before calling this method, model should be updated. From model to updateAccount to Database.
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
                        + ",PASSWORD = '%s' "
                        + ",ADDITIONALINFORMATION = '%s' "
                        + " WHERE ACCOUNTID = %d ", 
                model.getProvider(), 
                model.getUniqueName(),
                model.getEmail(), 
                model.getUsername(), 
                model.getPassword(), 
                model.getAdditionalInformation(),
                model.getAccountID());
        this.connection.executeCommand(query,true);

    }
    
    public void addAccount(AccountModel model) throws SQLException{
        
        connection.startNewConnection();
        
        String query = String.format(
                "INSERT INTO ACCOUNTS ("
                    + "ACCOUNTID,"
                    + "PROVIDER,"
                    + "EMAIL,"
                    + "USERNAME,"
                    + "PASSWORD,"
                     + "UNIQUENAME,"
                    + "ADDITIONAL_INFORMATION)"
                + " VALUES("
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' "
                + ")", 
                model.getAccountID(),
                model.getProvider(), 
                model.getEmail(), 
                model.getUsername(), 
                model.getPassword(), 
                model.getUniqueName(),
                model.getAdditionalInformation());
        
        //needs new method, because inserting row in sql needs new methods 'moveToInsertRow'
         this.connection.executeCommand(query);       
    }
    
    //shouldn't this be accountId? not unique name
//    public AccountModel getAccount(String name) throws SQLException {
//
//        String query = String.format("SELECT * FROM ACCOUNTS() WHERE UNIQUENAME  = '%s'", name);
//        this.connection.executeCommand(query);
//        ResultSet set=this.connection.getData();
//        AccountModel model=new AccountModel();
//        set.next();
//        Todo: implement this feature
//        model.setAccountID(set.getInt(""));
//        model.setAccountID(set.getInt(""));
//        model.setAccountID(set.getInt(""));
//        model.setAccountID(set.getInt(""));
//        model.setAccountID(set.getInt(""));
//
//                
//        return model;
//
//    }
    
    public AccountModel getAccount(int accID) throws SQLException {

        String query = String.format("SELECT * FROM ACCOUNT WHERE ACCOUNTID  = %d", accID);
        this.connection.executeCommand(query);
        ResultSet set=this.connection.getData();
        AccountModel model=new AccountModel();
        set.next();
        //Todo: implement this feature
        model.setAccountID(set.getInt("ACCOUNTID"));
        model.setUniqueName(set.getString("UNIQUENAME"));
        model.setProvider(set.getString("PROVIDER"));
        model.setEmail(set.getString("EMAIL"));
        model.setUsername(set.getString("USERNAME"));
        model.setPassword(set.getString("ACCOUNTPASSWORD"));
        model.setAdditionalInformation(set.getString("ADDITIONALINFORMATION"));
                
        return model;

    }
}
