package view;

import view.action.ActionHandler;

import javax.swing.JFrame;

/**
 *
 * @author prg08p-a67-08
 */
public abstract class View extends JFrame{

    //error cannot declare ActionHandler Variable
    
    public abstract void setHandler(ActionHandler action);
}
