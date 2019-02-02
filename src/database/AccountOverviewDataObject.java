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
public class AccountOverviewDataObject extends DataObject {

    public AccountOverviewDataObject(DBConnection connection) {
        super(connection);
    }

    //changed to WHERE USERID FROM ACCOUNTID
    public ArrayList<AccountModel> getAccount(int userID) throws SQLException {
        String query = String.format("SELECT * FROM ACCOUNT WHERE USERID  = %d", userID);
        System.out.println(query);
        this.connection.executeCommand(query);
        ResultSet set = this.connection.getData();
        ArrayList<AccountModel> model = new ArrayList<>();
        while (set.next()) {
            AccountModel tempModel = new AccountModel();
            tempModel.setAccountID(set.getInt("ACCOUNTID"));
            tempModel.setUniqueName(set.getString("UNIQUENAME"));
            System.out.println(set.getString("UNIQUENAME") + "XXX");
            tempModel.setEmail(set.getString("EMAIL"));
            tempModel.setUsername(set.getString("USERNAME"));
            tempModel.setPassword(set.getString("ACCOUNTPASSWORD"));
            tempModel.setAdditionalInformation(set.getString("ADDITIONALINFORMATION"));

            model.add(tempModel);
        }

        return model;

    }

}
