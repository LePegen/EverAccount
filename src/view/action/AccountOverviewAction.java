package view.action;

import controller.Controller;
import java.util.HashMap;
import model.wrapped.WrappedAccountModel;
import model.wrapped.WrappedLoginModel;
import view.AccountView;

/**
 *
 * @author Gene Garcia
 */
public class AccountOverviewAction extends ActionHandler {

    public AccountOverviewAction(Controller cont) {
        super(cont);
    }

    //returns selected account from jlist
    public int selectedAccount(Object item, HashMap<Object, Integer> itemValues) {
        return itemValues.get(item);
    }

    public void passSelectedAccount(int accountID) {
        controller.getCurrentView().setVisible(false);

        controller.selectAccount();

        ((WrappedAccountModel) controller.getCurrentModel()).getModel().setAccountID(accountID);
        ((WrappedAccountModel) controller.getCurrentModel()).setAccountID(accountID);

        ((AccountView) controller.getCurrentView()).getBtnAdd().setEnabled(false);
        ((AccountView) controller.getCurrentView()).getBtnSave().setEnabled(true);

        this.controller.update(); //updates model and view
        controller.getCurrentView().setVisible(true);
    }

    public void createAccount() {
        controller.getCurrentView().setVisible(false);

        //this is implemented because userID in accountModel is not set because it was not passed. The create button does not set userID
        controller.selectLogin();
        int userID = ((WrappedLoginModel) controller.getCurrentModel()).getModel().getUserID();

        controller.selectAccount();
        ((WrappedAccountModel) controller.getCurrentModel()).getModel().setUserID(userID);

        ((AccountView) controller.getCurrentView()).getBtnAdd().setEnabled(true);
        ((AccountView) controller.getCurrentView()).getBtnSave().setEnabled(false);

        controller.getCurrentView().setVisible(true);
    }
}
