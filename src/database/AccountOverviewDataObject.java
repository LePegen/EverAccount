package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.AccountModel;

/**
 *
 * @author Lezned
 */
public class AccountOverviewDataObject extends DataObject {

    public AccountOverviewDataObject(DBConnection connection) {
        super(connection);
    }

    //changed to WHERE USERID FROM ACCOUNTID
    public ArrayList<AccountModel> getAccount(int userID) throws SQLException {
        String command = String.format("SELECT * FROM ACCOUNT WHERE USERID  = %d", userID);

        System.out.println(command + " getAccount AccountOverviewDataObject");

        this.connection.executeCommand(command, false);

        ResultSet set = this.connection.getData();

        ArrayList<AccountModel> model = new ArrayList<>();

        while (set.next()) {
            AccountModel tempModel = new AccountModel();
            
            tempModel.setAccountID(set.getInt("ACCOUNTID"));
            tempModel.setUserID(set.getInt("USERID"));
            tempModel.setProvider(set.getString("PROVIDER"));
            tempModel.setUniqueName(set.getString("UNIQUENAME"));
            tempModel.setEmail(set.getString("EMAIL"));
            tempModel.setUsername(set.getString("USERNAME"));
            tempModel.setPassword(set.getString("ACCOUNTPASSWORD"));
            tempModel.setAdditionalInformation(set.getString("ADDITIONALINFORMATION"));

            model.add(tempModel);
        }

        return model;

    }

}
