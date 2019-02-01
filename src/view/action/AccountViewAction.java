package view.action;

import controller.Controller;

/**
 *
 * @author Gene Garcia
 */
public class AccountViewAction extends ActionHandler {

    public AccountViewAction(Controller cont) {
        super(cont);
    }
    
    //save
    public void saveAction(){
        controller.getCurrentModel().updateDBModel();
    }
    //add
    public void addAction(){
        controller.getCurrentModel().addDBModel();
    }
    
    //logout
    public void logoutAction(){
        controller.selectOverview();
    }
    
    //update to model and database
    
}
