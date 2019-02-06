package model.wrapped;

import database.AccountDataObject;
import model.*;
import view.View;
import database.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.AccountView;

/**
 *
 * @author Lezned
 */
public class WrappedAccModel extends WrappedModel {
    private AccountDataObject dataObj;
    private AccountModel model;
    //has-a rel with encrpyion

    private int accountID;

    public WrappedAccModel(DBConnection connection) {
        super(connection);
        model = new AccountModel();
        dataObj = new AccountDataObject(this.connection);
    }

    public AccountModel getModel() {
        return model;
    }

    public void setModel(AccountModel accountModel) {
        this.model = accountModel;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void deleteCurrentAccount(){
        try {
            dataObj.deleteAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void updateModelView(View currentView) {
        AccountView view = (AccountView) currentView;
        
        model.setProvider( view.getTxtProvider().getText() );
        model.setUniqueName( view.getTxtUniqueName().getText() ); 
        
        model.setEmail( view.getTxtEmail().getText() );
        model.setUsername( view.getTxtUsername().getText() );
        model.setPassword( view.getPwfPassword().getText() );
        model.setAdditionalInformation( view.getTxtAdditionalInformation().getText() );

    }

    /**
     * model should be updated with the information from database. bagong update
     * galing dapat sa database
     *
     * @param currentView
     */
    @Override
    public void updateViewModel(View currentView) {
        AccountView view = (AccountView) currentView;

        view.setTxtProvider(model.getProvider() );
        view.setTxtUniqueName(model.getUniqueName() );
        view.setTxtEmail(model.getEmail() );
        view.setTxtUsername(model.getUsername() );
        view.setPwfPassword(model.getPassword() );
        view.setTxtAdditionalInformation(model.getAdditionalInformation() );

    }

    @Override
    public void updateDBModel() {

        try {
            dataObj.upateAccount(model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void addDBModel() {
        try {
            dataObj.addAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateModelDB() {
        try {
            model = dataObj.getAccount(accountID);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
