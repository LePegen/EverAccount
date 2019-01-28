package controller;

import wrapped_model.WrappedAccountModel;
import model.*;
import view.*;

/**
 *
 * @author prg08p-a67-08
 */
public abstract class Controller {
    
    View currentView;
    WrappedAccountModel currentModel;
    
    //handlers
    private ILoginView loginViewAction;
    private IAccountOverviewView overviewViewAction;
    private IAccountView accountViewAction;
    
    //views
    View loginView;
    View accView;
    View accOverviewView;
    
    /**
     * LoginView cannot be a View. Problems in implementation
     */
    public void initViews(){
        
//        loginView = new LoginView();
//        accView = new AccountView();
//        accOverviewView = new AccountOverviewView();
        
    }
    
    /**
     *  includes setters for views handler
     */
    public void initHandlers(){
        
    }
    
    public void selectUser(){
        
    }
    
    public void updateView(View currentView){
        
    }
    
    /**
     * can also call the pushToDB(View) method in WrappedModel class
     */
    public void updateModel(){
        this.currentModel.pushToDB(this.currentView);
    }
    
}
