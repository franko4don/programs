/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.*;
import java.io.*;
/**
 * @author FRANKCHUKY
 */
public class circledrawn extends MIDlet {
static circledrawn m;
        Display d=Display.getDisplay(this);
circlecan c=new circlecan(this);

    public void startApp() {
       
m=this;
        d.setCurrent(c);
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    public void run(){
       if(c!=null){ c.repaint();}
    }
        
      
        
        
  
}
