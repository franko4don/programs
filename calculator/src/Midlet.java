/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
/**
 * @author FRANKCHUKY
 */
public class Midlet extends MIDlet{
    static Midlet m; 
    TextField t1,t2; 
    int a,b,e; 
    Command confirm,exit;
Display d; 
calvas c=new calvas(this);

public Midlet(){
    m=this;
d=Display.getDisplay(this); 
}
    public void startApp() {
    d.setCurrent(c);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {

    }
    public void kill(){
         this.destroyApp(true);
       this.notifyDestroyed();        
    }
    public void display(){
        d.setCurrent(c);
    }
}
