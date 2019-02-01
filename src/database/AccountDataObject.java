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
                "UPDATE ACCOUNTS "
                        + "SET PROVIDER = '%s' "
                        + "SET EMAIL = '%s"
                        + "SET USERNAME = '%s' "
                        + "SET PASSWORD = '%s' "
                        + "SET ADDITIONAL_INFORMATION = '%s'"
                        + "WHERE id ='%d' ", 
                model.getProvider(), 
                model.getEmail(), 
                model.getUsername(), 
                model.getPassword(), 
                model.getAdditionalInformation(),
                model.getAccountID());
        this.connection.executeCommand(query);

    }
    
    public void addAccount(AccountModel model) throws SQLException{
        
        String query = String.format(
                "INSERT INTO ACCOUNTS ("
                    + "PROVIDER,"
                    + "EMAIL,"
                    + "USERNAME,"
                    + "PASSWORD,"
                    + "ADDITIONAL_INFORMATION)"
                + " VALUES("
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' ,"
                    + "'%s' "
                + ")", 
                model.getProvider(), 
                model.getEmail(), 
                model.getUsername(), 
                model.getPassword(), 
                model.getAdditionalInformation());
        
        //needs new method, because inserting row in sql needs new methods 'moveToInsertRow'
         this.connection.executeCommand(query);       
    }
    
    public AccountModel getAccount(String name) throws SQLException {

        String query = String.format("SELECT * FROM ACCOUNTS() WHERE UNIQUENAME  = '%s'", name);
        this.connection.executeCommand(query);
        ResultSet set=this.connection.getData();
        AccountModel model=new AccountModel();
        set.next();
        //Todo: implement this feature
        model.setAccountID(set.getInt(""));
        model.setAccountID(set.getInt(""));
        model.setAccountID(set.getInt(""));
        model.setAccountID(set.getInt(""));
        model.setAccountID(set.getInt(""));

                
        return model;

    }
}
