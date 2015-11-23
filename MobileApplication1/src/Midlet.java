/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.Connector;
import java.util.*;
import java.io.*;

/**
 * @author FRANKCHUKY
 */
public class Midlet extends MIDlet{
    private TextField t1,t2; String file="textfile";
   Timer timer=null;
   painter tt=null; Alert alert; FileConnection fc; Command save;
    can c=null;
    Form f;
   static Midlet m;
    Display d= Display.getDisplay(this);
    public void startApp() {
         c=new can(this);
       
          m=this;
        timer=new Timer();
        tt=new painter();
        timer.schedule(tt, 0, 2);
       d.setCurrent(c);
     save=new Command("save",Command.SCREEN,1);
         }
         public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
        
    }
    
    public void kill(){
    this.destroyApp(true);
    this.notifyDestroyed();
    }
    public void commandaction(Command c,Displayable d){
     
        }
    
    private class painter extends TimerTask{
    public void run(){
   if(c!=null){
    c.repaint();
   }}
    }
   
}
