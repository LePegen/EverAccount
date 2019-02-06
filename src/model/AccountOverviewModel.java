package model;

import java.util.ArrayList;

/**
 *
 * @author Lezned
 */
public class AccountOverviewModel extends Model {

    private ArrayList<AccountModel> models;

    public AccountOverviewModel() {

        models = new ArrayList<>();

    }

    public ArrayList<AccountModel> getModels() {
        return models;
    }

    public void setModels(ArrayList<AccountModel> models) {
        this.models = models;
    }
    
    

}
