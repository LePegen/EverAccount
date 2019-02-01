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
            models=accOverviewDataOjb.getAccount(accountID);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedOverviewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
