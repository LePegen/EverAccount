package view.action;

import controller.Controller;

public abstract class ActionHandler {

    protected Controller controller;

    //to do: Controller must be initialized
    public ActionHandler(Controller cont){
        this.controller = cont;
    }
    
    public Controller getController() {
        return controller;
    }
}
