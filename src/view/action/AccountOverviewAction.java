package view.action;

import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author Gene Garcia
 */
public class AccountOverviewAction extends ActionHandler {

    //refresh account highlights and from Jlist
    public int selectedAccount(Object item, HashMap<Object, Integer> itemValues) {
        return itemValues.get(item);
    }

    //decide if there will be another action handler for the buttons inside the accounts higlights
    //find or search then will be added to list
}
