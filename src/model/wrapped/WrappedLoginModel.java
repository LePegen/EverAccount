/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.wrapped;

import database.LoginDataObject;
import java.sql.SQLException;
import model.LoginModel;
import view.View;

/**
 *
 * @author lipat
 */

public class WrappedLoginModel extends WrappedModel{
    LoginModel model;
    LoginDataObject dataObject;
    
    public WrappedLoginModel() {
        model=new LoginModel();
    }
    
    public boolean checkPassword() throws SQLException{
        String userInput=model.getPassword();
        String server=dataObject.getPassword(model);
        if(userInput.equals(server)){
            return true;
        }
        return false;
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
    public void updateModelView(View currentView) {
    }

    @Override
    public void updateModelDB() {
    }
    
}
