package view.action;

import controller.Controller;

public abstract class ActionHandler {

    protected Controller controller;

    public final int ADD_ACCOUNT = 0;
    public final int CHANGE_PASSWORD = 1;

    //to do: Controller must be initialized
    public ActionHandler(Controller cont) {
        this.controller = cont;
    }

    public Controller getController() {
        return controller;
    }
    
    public void returnAction(String selectType){
        this.controller.getCurrentView().setVisible(false);
        
        switch(selectType){
            case "login":
                this.controller.selectLogin();
                break;
                
            case "loginaccount":
                 this.controller.selectLoginAccount();
                break;
                
            case "overview":
                 this.controller.selectOverview();
                break;
                
            case "account":
                 this.controller.selectAccount();
                break;
        }
        
        controller.getCurrentView().setVisible(true);
    }
}
