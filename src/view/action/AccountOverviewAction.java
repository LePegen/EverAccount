package view.action;

import controller.Controller;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComponent;

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
        return itemValues.get(item);
    }
    
    

}
