package model.wrapped;

import database.AccountDataObject;
import model.*;
import view.View;
import controller.*;
import database.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.AccountView;

/**
 *
 * @author Gene Garcia
 */
public class WrappedAccountModel extends WrappedModel {
    private AccountDataObject dataObj;
    private AccountModel accountModel;
    //has-a rel with encrpyion

    private String uniqueName;
    private int accountID;

    public WrappedAccountModel(DBConnection connection) {
        super(connection);
        accountModel = new AccountModel();
        dataObj = new AccountDataObject(this.connection);
    }

    public AccountModel getAccountModel() {
        return accountModel;
    }

    public void setAccountModel(AccountModel accountModel) {
        this.accountModel = accountModel;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    
    
    @Override
    public void updateModelView(View currentView) {
        AccountView view = (AccountView) currentView;
        
        accountModel.setProvider( view.getTxtProvider().getText() );
        accountModel.setUniqueName( view.getTxtUniqueName().getText() ); 
        
        accountModel.setEmail( view.getTxtEmail().getText() );
        accountModel.setUsername( view.getTxtUsername().getText() );
        accountModel.setPassword( view.getPwfPassword().getText() );
        accountModel.setAdditionalInformation( view.getTxtAdditionalInformation().getText() );

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

        view.setTxtProvider( accountModel.getProvider() );
        view.setTxtUniqueName( accountModel.getUniqueName() );
        view.setTxtEmail( accountModel.getEmail() );
        view.setTxtUsername( accountModel.getUsername() );
        view.setPwfPassword( accountModel.getPassword() );
        view.setTxtAdditionalInformation( accountModel.getAdditionalInformation() );

    }

    @Override
    public void updateDBModel() {

        try {
            dataObj.upateAccount(accountModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void addDBModel() {
        try {
            dataObj.addAccount(accountModel);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateModelDB() {
        try {
            accountModel = dataObj.getAccount(accountID);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
