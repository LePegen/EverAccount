 package model.wrapped;

import database.AccountOverviewDataObject;
import database.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AccountOverviewModel;
import view.AccountOverviewView;
import view.View;

/**
 *
 * @author Lezned
 */
public class WrappedOverviewModel extends WrappedModel {

    private int userID;
    private AccountOverviewModel models;
    private AccountOverviewDataObject dataObj;

    public WrappedOverviewModel(DBConnection connection) {
        super(connection);
        dataObj = new AccountOverviewDataObject(this.connection);
        models = new AccountOverviewModel();
    }

    @Override
    public void updateModelView(View currentView) {

    }

    @Override
    public void updateViewModel(View currentView) {
        AccountOverviewView view = (AccountOverviewView) currentView;

        ArrayList<Integer> accountID = new ArrayList<>();

        ArrayList<String> accountNames = new ArrayList<>();

        for (int i = 0; i < models.getModels().size(); i++) {
            accountID.add(models.getModels().get(i).getAccountID());
            accountNames.add(models.getModels().get(i).getUniqueName());
        }
        view.setAccountList(accountID, accountNames);
    }

    @Override
    public void updateDBModel() {
    }

    @Override
    public void addDBModel() {
    }

    @Override
    public void updateModelDB() {
        try {
            //models = dataObj.getAccount(userID);
            models.setModels( dataObj.getAccount(userID) );
        } catch (SQLException ex) {
            Logger.getLogger(WrappedOverviewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

}
