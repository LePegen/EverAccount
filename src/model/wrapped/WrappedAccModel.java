package model.wrapped;

import controller.UserSession;
import cryptolib.lib.strategy.MDCryptoState.MDCryptoKey;
import cryptolib.lib.strategy.MDCryptoState.MDCryptoState;
import cryptolib.lib.strategy.MDCryptoState.MDFactory.MDKeyFactory;
import database.AccountDataObject;
import model.*;
import view.View;
import database.DBConnection;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.Arrays;
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
    UserSession session;
    public WrappedAccModel(DBConnection connection,UserSession session) {
        super(connection);
        model = new AccountModel();
        dataObj = new AccountDataObject(this.connection);
        this.session=session;
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

    public void deleteCurrentAccount() {
        try {
            dataObj.deleteAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateModelView(View currentView) {
        AccountView view = (AccountView) currentView;

        model.setProvider(view.getTxtProvider().getText());
        model.setUniqueName(view.getTxtUniqueName().getText());

        model.setEmail(view.getTxtEmail().getText());
        model.setUsername(view.getTxtUsername().getText());
        model.setPassword(view.getPwfPassword().getText());
        model.setAdditionalInformation(view.getTxtAdditionalInformation().getText());

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

        view.setTxtProvider(model.getProvider());
        view.setTxtUniqueName(model.getUniqueName());
        view.setTxtEmail(model.getEmail());
        view.setTxtUsername(model.getUsername());
        view.setPwfPassword(model.getPassword());
        view.setTxtAdditionalInformation(model.getAdditionalInformation());

    }

    @Override
    public void updateDBModel() {
        try {
            encryptModel();
            dataObj.upateAccount(model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void addDBModel() {
        try {
            encryptModel();
            dataObj.addAccount(model);
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateModelDB() {
        try {
            model = dataObj.getAccount(accountID);
            decryptModel();
        } catch (SQLException ex) {
            Logger.getLogger(WrappedAccModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void decryptModel() {
        MDKeyFactory mdKey=new MDKeyFactory();
        byte[] tempKey=model.getEncryptionKey();
        System.out.println("DECYPT"+Arrays.toString(tempKey));
//byte[] tempKey=session.getTools().decrypt(model.getEncryptionKey(), mdKey.createKey(session.getUserKey()));
        model.setAdditionalInformation(session.decryptString(model.getAdditionalInformation().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setEmail(session.decryptString(model.getEmail().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setPassword(session.decryptString(model.getPassword().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setProvider(session.decryptString(model.getProvider().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setUniqueName(session.decryptString(model.getUniqueName().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setUsername(session.decryptString(model.getUsername().getBytes(StandardCharsets.UTF_8), tempKey));
    }
    
    public void encryptModel(){
        MDKeyFactory mdKey = new MDKeyFactory();
        byte[] tempKey=MDCryptoState.getData(((MDCryptoKey)mdKey.generateKey()).getKey());
        System.out.println("ENCYOPT" + Arrays.toString(tempKey));

        //byte[] encryptedKey=session.getTools().encrypt(tempKey, mdKey.createKey(session.getUserKey()));
        model.setEncryptionKey(tempKey);
        model.setAdditionalInformation(session.encryptString(model.getAdditionalInformation().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setEmail(session.encryptString(model.getEmail().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setPassword(session.encryptString(model.getPassword().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setProvider(session.encryptString(model.getProvider().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setUniqueName(session.encryptString(model.getUniqueName().getBytes(StandardCharsets.UTF_8), tempKey));
        model.setUsername(session.encryptString(model.getUsername().getBytes(StandardCharsets.UTF_8), tempKey));
    }

}
