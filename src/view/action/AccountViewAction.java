package view.action;

import controller.Controller;
import model.wrapped.WrappedAccountModel;

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
    public void saveAction() {
        //controller.selectAccount();?????????????????????
        controller.selectAccount();
        
        controller.getCurrentModel().updateModelView(controller.getCurrentView()); //updates model from the information from view
        
        //does AccountModel in wrapped model needs to be updated?
        
        controller.getCurrentModel().updateDBModel();
    }

    //add
    public void addAction() {
        controller.selectAccount();
        controller.getCurrentModel().updateModelView(controller.getCurrentView()); //updates model from the information from view 
        controller.getCurrentModel().addDBModel();
    }

    //logout
    public void logoutAction() {
        controller.selectOverview();
    }

    //update to model and database
}
