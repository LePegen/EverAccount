/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrapped;

import database.DBConnection;
import database.LoginDataObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoginModel;
import view.LoginAccountView;
import view.View;

/**
 *
 * @author Gene Garcia
 */
public class WrappedLoginAccountModel extends WrappedModel {

    private LoginModel model;
    private LoginDataObject dataObj;

    public WrappedLoginAccountModel(DBConnection connection) {
        super(connection);
        dataObj = new LoginDataObject(connection);
        model = new LoginModel();
    }

    public LoginModel getModel() {
        return model;
    }

    @Override
    public void updateModelView(View currentView) {
        LoginAccountView view = (LoginAccountView) currentView;
        
        model.setUsername( view.getTfUsername().getText());
        model.setPassword( view.getPwfAccountPassword().getText() );
        
    }

    @Override
    public void updateViewModel(View currentView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDBModel() {
        try {
            dataObj.changePassword(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void addDBModel() {
        try {
            dataObj.addAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public void updateModelDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
