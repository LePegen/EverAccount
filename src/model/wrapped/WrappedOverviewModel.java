/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrapped;

import database.AccountOverviewDataObject;
import java.util.ArrayList;
import model.AccountModel;
import view.View;

/**
 *
 * @author lipat
 */
public class WrappedOverviewModel extends WrappedModel{
    private int accountID;
    private ArrayList<AccountModel> models;
    private AccountOverviewDataObject accountOverviewDataObject;
    
    
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
    }
    
}
