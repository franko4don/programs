/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author FRANKCHUKY
 */
public class Midlet extends MIDlet {
    Display d=Display.getDisplay(this);
    public void startApp() {
        can c=new can();
        d.setCurrent(c);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
