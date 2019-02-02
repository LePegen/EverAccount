package view.action;

import controller.Controller;

/**
 *
 * @author Gene Garcia
 */
public class AccountViewAction extends ActionHandler {

    private int uniqueID;
    
    public AccountViewAction(Controller cont) {
        super(cont);
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
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
