package view.action;

import controller.Controller;
import model.wrapped.WrappedAccModel;
import view.AccountView;

/**
 *
 * @author Lezned
 */
public class AccountAction extends ActionHandler {

    private int uniqueID;

    public AccountAction(Controller cont) {
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
        controller.getCurrentModel().updateModelView(controller.getCurrentView()); //updates model from the information from view

        controller.getCurrentModel().updateDBModel();

        returnAction("overview");
    }

    //add
    public void addAction() {
        controller.getCurrentModel().updateModelView(controller.getCurrentView()); //updates model from the information from view 

        controller.getCurrentModel().addDBModel();

        returnAction("overview");
    }

    //delete
    public void deleteAction() {
        ((WrappedAccModel) controller.getCurrentModel()).deleteCurrentAccount(); //deletes current account

        returnAction("overview");
    }

    //return
    public void returnAction() {
        returnAction("overview");
    }

    public boolean checkFields() {
        String uniqueName = ((AccountView) controller.getCurrentView()).getTxtUniqueName().getText();

        if (uniqueName.equals("")) {
            return false;
        }

        return true;
    }
}
