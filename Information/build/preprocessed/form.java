/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author FRANKCHUKY
 */
public class form extends Canvas implements CommandListener {
Info i; int w=getWidth(); int h=getHeight(); int px,py=0;
Image pointer=null; TextBox tb; int start=4;
    /**
     * constructor
     */
    public form(Info i){
                this.i=i;
                        setFullScreenMode(true);
        try {
            pointer=Image.createImage("/pointer.png");
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
        int pos=h/20;
        g.setColor(0xfcacaa);
        g.fillRect(0,0,w,h);
       g.setColor(0,130,0);
       g.drawRect(start,pos,w-w/20,30);
        g.drawRect(start,pos+pos+30,w-w/20,30);
        g.drawRect(start,3*pos+60,w-w/20,30);
        g.drawRect(start,4*pos+90,w-w/20,30);
        g.drawRect(start,5*pos+120,w-w/20,30);
        g.drawRect(start,6*pos+150,w-w/20,30);
        g.drawImage(pointer,px+3,py+4,Graphics.TOP | Graphics.LEFT);
        g.drawString("", 0, 0, Graphics.TOP | Graphics.LEFT);
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
            case UP:{if(py>4){py-=10;}}
            break;
            case DOWN:{if(py<=h+h/13){py+=10;}}
            break;
            case RIGHT:{if(px<w-w/30){px+=10;}}
            break;
            case LEFT:{if(px>3){px-=10;}}
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
        String label=command.getLabel();
        if(label.equals("Exit")){i.kill();
        
        }
    }
    public void textbox(){
    tb=new TextBox("values","",2000,TextField.ANY);
    }
}
