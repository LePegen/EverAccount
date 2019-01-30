package view.action;

import controller.Controller;

public abstract class ActionHandler {
    protected Controller controller;
    
    
    //Masterclass

    public Controller getController() {
        return controller;
    }
}
