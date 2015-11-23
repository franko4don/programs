/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author FRANKCHUKY
 */
public class Last extends Canvas {
int w=getWidth(); int h=getHeight();
    /**
     * constructor
     */
    String result;
    Canvas c;
    public Last(Canvas c,String result) {
        this.setFullScreenMode(true);
       this.result=result;
       this.c=c;
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        g.setColor(0xabcdef);
        g.fillRect(0,0,w,h);
        g.setColor(0,200,0);
        g.drawString("Ans= "+result, 0, 0, Graphics.TOP | Graphics.LEFT);
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
         int action;
        action=this.getGameAction(keyCode);
        int KEY_SOFTKEY1=-6;
        int KEY_SOFTKEY2=-7;
        try{
        if(getGameAction(-6)==DOWN){
          KEY_SOFTKEY1=-26;
        KEY_SOFTKEY2=-27;
        }
        }catch(IllegalArgumentException e){}
        
        if(keyCode==KEY_SOFTKEY2){
         Midlet.m.d.setCurrent(c);
        }
        
        
        
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
