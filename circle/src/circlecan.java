/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;
import java.io.*;
/**
 * @author FRANKCHUKY
 */
public class circlecan extends Canvas implements CommandListener {
int radius,center=0; circledrawn n; 

String[]row={".",".",".","."};
     
     
        Image pointer=null;
        int px=0,py=0,w=0,h=0; 
    /**
     * constructor
     */
    public circlecan(circledrawn n) {
       this.n=n;
        setFullScreenMode(true);
        w=getWidth(); h=getHeight();
       
        try {
            pointer=Image.createImage("/pointer.jpg");
            // Set up this canvas to listen to command events
          setCommandListener(this);
            // Add the Exit command
           addCommand(new Command("Exit", Command.EXIT, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
       
        g.setColor(255,0,0);
        g.fillRect(px,py,w,h);
        circledrawn.m.run();
        g.setColor(0,0,245);
        g.drawString("jfyfd",0 ,0, Graphics.TOP | Graphics.LEFT);
        g.drawImage(pointer,px,py,Graphics.TOP | Graphics.LEFT);
        circledrawn.m.run();
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
          int action=this.getGameAction(keyCode);
        action=this.getGameAction(keyCode);
    
        int SOFTKEY1=8;
        int SOFTKEY2=2;
        int SOFTKEY3=4;
        int SOFTKEY4=6;
        
        try{
            if(getGameAction(6)==DOWN){
              
                SOFTKEY1=8;
                SOFTKEY3=4;}
            
        }
                catch(IllegalArgumentException ex){
                    if(keyCode==SOFTKEY2){
                        
        }
        if(keyCode==SOFTKEY4)
           
        {}
                
                }
        switch(action){
            case FIRE:{}
                break;
            case LEFT:{px-=10;}
            break;
            case RIGHT:{px+=10;}
                break;
            case UP:{py-=10;}
                break;
            case DOWN:{py+=10;}
                break;}
      
    }

    /**
     * Called when a key is released.
     */
    protected void keyReleased(int keyCode) {
    }

    /**
     * Called when a key is repeated (held down).
     */
    protected void keyRepeated(int keyCode) {
      
        }
        
                
        
    

    /**
     * Called when the pointer is dragged.
     */
    protected void pointerDragged(int x, int y) {
       
    }

    /**
     * Called when the pointer is pressed.
     */
    protected void pointerPressed(int x, int y) {
    }

    /**
     * Called when the pointer is released.
     */
    protected void pointerReleased(int x, int y) {
    }

    /**
     * Called when action should be handled
     */
    public void commandAction(Command command, Displayable displayable) {
    }
   
}
