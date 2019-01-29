package controller;

import database.DBConnection;
import java.util.logging.Logger;
import model.wrapped.*;
import view.AccountOverviewView;
import view.AccountView;
import view.LoginView;
import view.View;


/**
 *
 * @author prg08p-a67-08
 */
public class Controller {

    View currentView;
    WrappedModel currentModel;

    //views
    private View loginView;
    private View accountView;
    private View accountOverviewView;

    //wrapped models
    WrappedAccountModel accountModel;

    /**
     * LoginView cannot be a View. Problems in implementation
     */
    
    
    public Controller() {
        initViews();
        selectLogin();
    }

    public void initViews() {
        DBConnection connection=new DBConnection();
        loginView = new LoginView();
        accountView = new AccountView();
        accountOverviewView = new AccountOverviewView();
        
    }

    public void initHandlers() {

    }
    
    public void selectLogin(){
        currentView=loginView;
        currentView.setVisible(true);
    }
    
    public void selectOverview(){
        currentView=accountOverviewView;
        accountOverviewView.setVisible(true);
    }
    
    public void selectAccount() {
        currentView = accountView;
        currentModel = accountModel;
        updateView();
    }

    public void updateView() {
        currentModel.updateViewModel(currentView);
    }

}
