/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrapped;

import database.AccountOverviewDataObject;
import database.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AccountModel;
import view.AccountOverviewView;
import view.View;

/**
 *
 * @author lipat
 */
public class WrappedOverviewModel extends WrappedModel{
    private int accountID;
    private ArrayList<AccountModel> models;
    private AccountOverviewDataObject accOverviewDataOjb;

    public WrappedOverviewModel(DBConnection connection) {
        super(connection);
        accOverviewDataOjb = new AccountOverviewDataObject(this.connection);
        models = new ArrayList<>();
    }
    
    
    @Override
    public void updateModelView(View currentView) {
        
    }
    
    @Override
    public void updateViewModel(View currentView) {
        AccountOverviewView view=(AccountOverviewView) currentView;
        ArrayList<Integer> accountID=new ArrayList<>();
        ArrayList<String> accountNames=new ArrayList<>();
        for (int i = 0; i <models.size(); i++) {
            accountID.add(models.get(i).getAccountID());
            accountNames.add(models.get(i).getUniqueName());
        }
        view.setAccountList(accountID, accountNames);
    }

    @Override
    public void updateDBModel() {
    }

    @Override
    public void addDBModel() {
    }

    @Override
    public void updateModelDB() {
        try {
            System.out.println(accountID+"Hello world");
            models=accOverviewDataOjb.getAccount(accountID);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedOverviewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    
    
    
}
