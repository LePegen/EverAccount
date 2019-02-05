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

    public boolean checkPassword() {

        try {
            String viewPassword = model.getPassword(); //old password from view

            dataObj.getHash(model); //password from the database is stored to the model

            String storedPassword = model.getPassword(); //password from the model from the database

            if (viewPassword.equals(storedPassword)) {
                return true; //match input password and password from database
            }
        } catch (SQLException ex) {
            Logger.getLogger(WrappedLoginAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public void updateModelView(View currentView) {
        LoginAccountView view = (LoginAccountView) currentView;

        model.setUsername(view.getTfUsername().getText());
        model.setPassword(view.getPwfNewPassword().getText());
    }

    @Override
    public void updateViewModel(View currentView) {
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
    }

}
