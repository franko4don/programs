/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;
import java.util.*;

/**
 * @author FRANKCHUKY
 */
public class Control extends Canvas implements CommandListener {
Image frank=null;
int R,G,B;
int h; 
int w;
int frankx;
int franky;
int direction=1;
int hor;
int imwidth;
int imheight;
Timer t;
TimerTask tt;
    /**
     * constructor
     */
    public Control() {
        try {
             frank=Image.createImage("/frank.jpg");
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
 w=getWidth(); h=getHeight();
 setFullScreenMode(true);
 String o="worst"; 
       g.setColor(0xcaffb);
       g.fillRect(0,0,w, h);
       resize();
       g.drawImage(frank,frankx,franky,Graphics.TOP|Graphics.LEFT);
       g.setColor(0,0,0);
       g.drawString("Width= "+Integer.toString(imwidth),w/2, h/2,Graphics.TOP|Graphics.LEFT);
       g.drawString("Height= "+Integer.toString(imheight),(w/2),(h/2)+40,Graphics.TOP|Graphics.LEFT);
       time();
       repaint();
    }
    
    public void navigate(){
  switch(direction){
      case 1:{frankx++; 
          if(frankx==w-frank.getWidth()){ 
              direction=2;
           }
      };break;
      case 2:{if(direction==2&&franky<=h-frank.getHeight()){
      franky++;}
      if(franky==h-frank.getHeight()){
      direction=3;
      }}break;
      case 3:{if(direction==3&&frankx>0){
      frankx--;}
      if(frankx==0){
      direction=4;
      }
      }break;
      case 4: {if(direction==4&&franky>=0){
      --franky;
      }
      if(franky==0){
      direction=1;
      }
      }
      break;
      
      
         
  }
  }
     /* Called when a key is pressed.
     */
    public void time(){
       t=new Timer();
            tt=new TimerTask(){
            public void run(){
           navigate();
    }
    };
    t.schedule(tt,50);}
   public void resize(){
        imwidth=frank.getWidth();
        imheight=frank.getHeight();
   Graphics resi=frank.getGraphics();
    int ratio=(imwidth<<16)/w;
    int pos=ratio/2;
    for(int x=0; x<w; x++){
    resi.setClip(x,0,1, imheight);
    resi.drawImage(frank,x-(pos>>16),0,Graphics.LEFT|Graphics.TOP);
    pos+=ratio;
    }
    }
            
    protected void keyPressed(int keyCode) {
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
