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
    Display d; static Midlet m;
    arrange a=new arrange(this);
public Midlet(){
d=Display.getDisplay(this);
m=this;
}
    public void startApp() {
        d.setCurrent(a);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
