/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;
import java.util.*;

/**
 * @author FRANKCHUKY
 */
public class arrange extends Canvas implements CommandListener {
    int py; int w; int h;
String about="This prog was written by a 300 level unizik student in nnamdi azikiwe department of electronic "
        + "and computer engineering,he has also written so many other programs and is doing well academically"
        + "and has written well over 200 other programs. He started his journey while still in secondary school"
        + "he had the passion and the drive to learn programming and become the best of all, that dream is almost coming true"
        +"On Christ the solid rock i stand, all other ground is sinking sand, all other ground is sinking sand. just like a"
        + "man, who builds upon sand, i set my house on a solid foundation, christ is my life the root of ma soul's recreation     "
        ;
String[]author=new String[16];;
Midlet n; StringBuffer br; Font ft;
    /**
     * constructor
     */
    public arrange(Midlet n) {
            this.n=n;
            w=getWidth(); h=getHeight();
            this.setFullScreenMode(true);
        try {
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
        g.setColor(0xabcdef);
        g.fillRect(0,0,w,h);
        g.setColor(34,60,0);
     //  g.drawString(Integer.toString(about.length()),0,py,Graphics.TOP|Graphics.LEFT);
       for(int i=0; i<author.length; i++){
        author[i]=about.substring(i*40,(i+1)*40);
             g.drawString(author[i],0,i*15,Graphics.TOP|Graphics.LEFT); }
       repaint();
    
    }
    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
     int action=this.getGameAction(keyCode);     
     switch(action){
         case FIRE:{}
             break;
         case UP:{py+=8;}
             break;
         case DOWN:{py-=8;}
             break;
         case LEFT:{}
             break;
         case RIGHT:{}
             break;         
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