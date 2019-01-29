package model.wrapped;

import view.View;

/**
 * The wrapped model's responsibilities: -mediate the database(the data objects)
 * and the model -mediate the model and the view -handle application logic
 *
 * @author lipat
 */
public abstract class WrappedModel {

    //naming convention: verb,target,source
    public abstract void updateModelView(View currentView);
   
    public abstract void updateViewModel(View currentView);

    public abstract void updateDBModel();

    public abstract void addDBModel();
    
    public abstract void updateModelDB();
}
