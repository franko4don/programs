/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author FRANKCHUKY
 */
public class Midlet extends MIDlet {
static Midlet m;
Display d;
Control c;
public Midlet(){
m=this;
}
    public void startApp() {
        c=new Control();
        d=Display.getDisplay(this);
        d.setCurrent(c);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
