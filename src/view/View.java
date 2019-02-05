package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import view.action.ActionHandler;

import javax.swing.JFrame;

/**
 *
 * @author prg08p-a67-08
 */
public abstract class View extends JFrame {

    //error cannot declare ActionHandler Variable
    public abstract void setHandler(ActionHandler action);

    public void setPositionOnScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
    }
}
