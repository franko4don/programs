/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
/**
 * @author FRANKCHUKY
 */
public class calc extends MIDlet implements CommandListener{
    calvas c=new calvas();
    Display d; private TextField t1,t2; Command exit,confirm,back;
    public void startApp() {
        d=Display.getDisplay(this);
        Form f=new Form("input your values");
            t1=new TextField("first number","",40,TextField.DECIMAL);
    t2=new TextField("second number","",40,TextField.DECIMAL);
    exit=new Command("exit",Command.EXIT,2);
    confirm=new Command("confirm",Command.OK,1);
    f.append(t1);
    f.append(t2);
    f.addCommand(exit);
    f.addCommand(confirm);
    f.setCommandListener(this);
            d.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    public void form(){
        Form fin=new Form("answer"); String a,b;
        back=new Command("back",Command.BACK,2);
        a=t1.getString();
        b=t2.getString();
        double firstnumber=Double.parseDouble(a);
        double secondnumber=Double.parseDouble(b);
        double e=firstnumber*secondnumber;
    String answer=Double.toString(e);
    fin.append(answer);
    fin.addCommand(back);
    fin.setCommandListener(this);
    d.setCurrent(fin);
    }
        public void commandAction(Command c, Displayable displayable) {
            String label=c.getLabel();
            if(label.equals("confirm")){
                form();}
            if(c==back){
                startApp();
            }
            if(c==exit){kill();}
    }
        public void kill(){
         this.notifyDestroyed();
        this.destroyApp(true);
        }
        
}
