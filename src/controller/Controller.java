package controller;

import model.wrapped.*;
import view.AccountOverviewView;
import view.AccountView;
import view.LoginView;
import view.View;


/**
 *
 * @author prg08p-a67-08
 */
public abstract class Controller {

    View currentView;
    WrappedModel currentModel;

    //views
    private View loginView;
    private View accountView;
    private View accountOverviewView;

    //wrapped models
    WrappedAccModel accountModel;

    /**
     * LoginView cannot be a View. Problems in implementation
     */
    public void initViews() {

        loginView = new LoginView();
        accountView = new AccountView();
        accountOverviewView = new AccountOverviewView();

    }

    /**
     * includes setters for views handler
     */
    public void initHandlers() {

    }

    public void selectAccount() {
        currentView = accountView;
        currentModel = accountModel;
        updateView();
    }

    public void updateView() {
        currentModel.updateView(currentView);
    }

}
