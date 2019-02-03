package view.action;

import controller.Controller;
import java.util.HashMap;
import model.wrapped.WrappedAccountModel;

/**
 *
 * @author Gene Garcia
 */
public class AccountOverviewAction extends ActionHandler {

    public AccountOverviewAction(Controller cont) {
        super(cont);
    }

    //refresh account highlights and from Jlist
    public int selectedAccount(Object item, HashMap<Object, Integer> itemValues) {

        System.out.println(itemValues.get(item) + "YYY");

        passAccount(itemValues.get(item));

        return itemValues.get(item);
    }

    public void passAccount(int accountID) {
        controller.selectAccount();
        ((WrappedAccountModel) controller.getCurrentModel()).getAccountModel().setAccountID(accountID);
        ((WrappedAccountModel) controller.getCurrentModel()).setAccountID(accountID);
        this.controller.update(); //updates model and view
        controller.getCurrentView().setVisible(true);
    }

}
