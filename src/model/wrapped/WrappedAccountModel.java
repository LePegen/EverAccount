package model.wrapped;

import database.AccountDataObject;
import model.*;
import view.View;
import controller.*;
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

    public WrappedAccountModel(String name) {
        accountModel = new AccountModel();
        this.uniqueName = name;
    }

    @Override
    public void updateModelView(View currentView) {
        AccountView view = (AccountView) currentView;
        accountModel.setProvider(view.getLblProvider().getText());
        //create text field for unique name accountModel.setUniqueName( view.getLblUniqueName().getText ); 
        accountModel.setEmail(view.getLblEmail().getText());
        accountModel.setUsername(view.getLblUsername().getText());
        accountModel.setPassword(view.getLblPassword().getText());
        accountModel.setAdditionalInformation(view.getLblAdditionalInformation().getText());

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

        view.setLblProvider(accountModel.getProvider());
        //create text field for unique name view.setLblUniqueName( accountModel.getUniqueName() );
        view.setLblEmail(accountModel.getEmail());
        view.setLblUsername(accountModel.getUsername());
        view.setLblPassword(accountModel.getPassword());
        view.setLblAdditionalInformation(accountModel.getAdditionalInformation());

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
        dataObj.addAccount(accountModel);
    }

    @Override
    public void updateModelDB(String uniqueName) {
        try {
            accountModel = dataObj.getAccount(uniqueName);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccountModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
