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

    WrappedLoginModel loginModel;
    WrappedOverviewModel overviewModel;

    //Connection
    DBConnection connection;

    /**
     * LoginView cannot be a View. Problems in implementation
     */
    public Controller() {
        initConnection();
        initViews();
        initHandlers();
        initWrapped();
        selectLogin();
    }

    public void initConnection() {
        connection = new DBConnection();
    }

    public void initViews() {
        loginView = new LoginView();
        accountView = new AccountView();
        accountOverviewView = new AccountOverviewView();

    }

    public void initHandlers() {

    }

    public void initWrapped() {
        accountModel = new WrappedAccountModel(connection);
        loginModel = new WrappedLoginModel(connection);
        overviewModel = new WrappedOverviewModel(connection);
    }

    public void selectLogin() {
        currentView = loginView;
        currentView.setVisible(true);
    }

    public void selectOverview() {
        currentView = accountOverviewView;
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

    public WrappedModel getCurrentModel() {
        return currentModel;
    }

    public View getCurrentView() {
        return currentView;
    }


    
    
    
    

}
