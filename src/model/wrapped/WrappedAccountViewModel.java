/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrapped;

import database.AccountDataObject;
import database.DBConnection;
import model.AccountModel;
import view.View;

/**
 *
 * @author Gene Garcia
 */
public class WrappedAccountViewModel extends WrappedModel {
    private AccountDataObject dataObj;
    private AccountModel accountModel;

    public WrappedAccountViewModel(DBConnection con) {
        super(con);
    }

    @Override
    public void updateModelView(View currentView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateViewModel(View currentView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDBModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addDBModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateModelDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
