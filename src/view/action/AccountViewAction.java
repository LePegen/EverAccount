package view.action;

/**
 *
 * @author Gene Garcia
 */
public class AccountViewAction extends ActionHandler {
    
    
    
    //to do: (modules)
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
