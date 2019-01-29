package model.wrapped;

import model.*;
import view.View;
import controller.*;
import java.sql.SQLException;
import view.AccountView;

/**
 *
 * @author Gene Garcia
 */
public class WrappedAccModel extends WrappedModel{
    
    private AccountDataObject dataObj;
    private AccountModel accountModel;
    //has-a rel with encrpyion
    
    private String uniqueName;
    
    public WrappedAccModel(String name){
        accountModel = new AccountModel();
        this.uniqueName = name;
    }
    
    public void saveModel(View currentView){
        AccountView view=(AccountView) currentView;
        
        
        accountModel.setProvider( view.getLblProvider().getText() );
        //create text field for unique name accountModel.setUniqueName( view.getLblUniqueName().getText ); 
        accountModel.setEmail(view.getLblEmail().getText() );
        accountModel.setUsername(view.getLblUsername().getText() );
        accountModel.setPassword(view.getLblPassword().getText() );
        accountModel.setAdditionalInformation(view.getLblAdditionalInformation().getText() );

    }

    /**
     * model should be updated with the information from database. bagong update galing dapat sa database
     * @param currentView 
     */
    @Override
    public void updateView(View currentView) {
        AccountView view=(AccountView) currentView;
        
        view.setLblProvider( accountModel.getProvider() );
        //create text field for unique name view.setLblUniqueName( accountModel.getUniqueName() );
        view.setLblEmail(accountModel.getEmail());
        view.setLblUsername(accountModel.getUsername());
        view.setLblPassword(accountModel.getPassword());
        view.setLblAdditionalInformation(accountModel.getAdditionalInformation());

        
    }

    @Override
    public void updateAccount() {
        
        try {
            dataObj.upateAccount(accountModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void addAccount() {
        dataObj.addAccount(accountModel);
    }
    
    public void change(String uniqueName) throws SQLException{
        accountModel = dataObj.getAccount(uniqueName);
    }

    
}
