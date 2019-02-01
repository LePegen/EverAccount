/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.AccountModel;

/**
 *
 * @author lipat
 */
public class AccountOverviewDataObject extends DataObject{

    public AccountOverviewDataObject(DBConnection connection) {
        super(connection);
    }

    public ArrayList<AccountModel> getAccount(int userID) throws SQLException {

        String query = String.format("SELECT * FROM ACCOUNTS() WHERE ACCOUNT_NAME  = '%d'", userID);
        this.connection.executeCommand(query);
        ResultSet set = this.connection.getData();
        ArrayList<AccountModel> model = new ArrayList<>();
        
        while (set.next()) {
            AccountModel tempModel = new AccountModel();
            
            tempModel.setAccountID( set.getInt("ACCOUNT_ID") );
            tempModel.setUniqueName(set.getString("UNIQUE_NAME") );
            tempModel.setEmail(set.getString("EMAIL") );
            tempModel.setUsername(set.getString("USERNAME") );
            tempModel.setPassword(set.getString("PASSWORD") );
            tempModel.setAdditionalInformation(set.getString("ADDITIONAL_INFORMATION") );
            
            model.add(tempModel);
        }

        return model;

    }

}
