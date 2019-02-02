package controller;

import database.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.wrapped.WrappedLoginModel;
import model.wrapped.WrappedModel;
import model.wrapped.WrappedAccountModel;
import model.wrapped.WrappedOverviewModel;
import view.action.*;
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
    private View overviewView;

    //wrapped models
    WrappedAccountModel accountModel;
    WrappedLoginModel loginModel;
    WrappedOverviewModel overviewModel;

    //Connection
    DBConnection connection;

    //action handlers
    AccountOverviewAction overviewAction;
    AccountViewAction accountViewAction;
    LoginViewAction loginAction;

    /**
     * LoginView cannot be a View. Problems in implementation
     */
    public Controller() {
        initConnection();
        initViews();
        initAndSetHandlers();
        initWrapped();
        selectLogin(); //starts the controller
    }

    public void initConnection() {
        try {
            connection = new DBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initViews() {
        loginView = new LoginView();
        accountView = new AccountView();
        overviewView = new AccountOverviewView();

    }

    public void initAndSetHandlers() {

        overviewAction = new AccountOverviewAction(this);
        accountViewAction = new AccountViewAction(this);
        loginAction = new LoginViewAction(this);

        loginView.setHandler(loginAction);
        accountView.setHandler(accountViewAction);
        overviewView.setHandler(overviewAction);

    }

    public void initWrapped() {
        accountModel = new WrappedAccountModel(connection);
        loginModel = new WrappedLoginModel(connection);
        overviewModel = new WrappedOverviewModel(connection);
    }

    public void selectLogin() {
        currentView = loginView;
        currentModel = loginModel;
        currentView.setVisible(true);
    }

    public void selectOverview() {
        currentView = overviewView;
        currentModel = overviewModel;
        this.update();
        //overviewView.setVisible(true);
    }

    public void selectAccount() {
        currentView = accountView;
        currentModel = accountModel;
        updateView();
    }

    public void update() {
        this.getCurrentModel().updateModelDB();
        this.getCurrentModel().updateViewModel(this.getCurrentView());
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
