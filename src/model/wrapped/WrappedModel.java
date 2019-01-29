package model.wrapped;

import view.View;

/**
 *
 * @author Gene Garcia
 */
public abstract class WrappedModel {
    
    public abstract void updateView(View currentView);

    public abstract void updateAccount();
    
    public abstract void addAccount();
}
