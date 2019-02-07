package controller;

import database.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.*;
import model.wrapped.*;
import view.action.*;
/**
 *
 * @author Lezned
 */
public class Controller {

    private View currentView;
    private WrappedModel currentModel;

    //views
    private View loginView;
    private View accountView;
    private View overviewView;
    private View loginAccountView;

    //wrapped models
    private WrappedAccModel accountModel;
    private WrappedLoginModel loginModel;
    private WrappedOverviewModel overviewModel;
    private WrappedLoginAccountModel loginAccountModel;

    //Connection
    private DBConnection connection;

    //action handlers
    private AccountOverviewAction overviewAction;
    private AccountAction accountViewAction;
    private LoginViewAction loginAction;
    private LoginAccountAction loginAccountAction;
 
    public Controller() {
        initConnection();
        initViews();
        initAndSetHandlers();
        initWrapped();
        
        selectLogin();
        //starts the controller
        getCurrentView().setVisible(true);
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
        loginAccountView = new LoginAccountView();

    }

    public void initAndSetHandlers() {

        overviewAction = new AccountOverviewAction(this);
        accountViewAction = new AccountAction(this);
        loginAction = new LoginViewAction(this);
        loginAccountAction = new LoginAccountAction(this);

        loginView.setHandler(loginAction);
        accountView.setHandler(accountViewAction);
        overviewView.setHandler(overviewAction);
        loginAccountView.setHandler(loginAccountAction);

    }

    public void initWrapped() {
        accountModel = new WrappedAccModel(connection);
        loginModel = new WrappedLoginModel(connection);
        overviewModel = new WrappedOverviewModel(connection);
        loginAccountModel = new WrappedLoginAccountModel(connection);
    }

    public void selectLogin() {
        currentView = loginView;
        currentModel = loginModel;
        //currentView.setVisible(true);
    }

    public void selectLoginAccount() {
        currentView = loginAccountView;
        currentModel = loginAccountModel;
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
