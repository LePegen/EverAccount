package model.wrapped;

import database.DBConnection;
import database.LoginDataObject;
import java.sql.SQLException;
import model.LoginModel;
import view.LoginView;
import view.View;

/**
 *
 * @author lipat
 */
public class WrappedLoginModel extends WrappedModel {

    private LoginModel model;
    private LoginDataObject dataObj;

    public WrappedLoginModel(DBConnection connection) {
        super(connection);
        dataObj = new LoginDataObject(connection);
        model = new LoginModel();
    }

    public LoginModel getModel() {
        return model;
    }

    /**
     *
     * @return @throws SQLException
     */
    public boolean checkPassword() throws SQLException {
        String userInput = model.getPassword(); //user input

        dataObj.getHash(model); //hashed password from database, this will modify the 'model' object to get the stored hashed password

        String server = model.getPassword(); //model now has new password

        if (userInput.equals(server)) {
            return true;
        }
        return false;
    }

    @Override
    public void updateViewModel(View currentView) {
    }

    @Override
    public void updateDBModel() {
    }

    @Override
    public void addDBModel() {
    }

    @Override
    public void updateModelView(View currentView) {
        LoginView tempView = (LoginView) currentView;

        model.setUsername(tempView.getTfUsername().getText());
        model.setPassword(tempView.getPwfAccountPassword().getText());
    }

    @Override
    public void updateModelDB() {

    }

}
