/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author FRANKCHUKY
 */
public class Info extends MIDlet implements CommandListener {
Display d; 
static Info m; 
TextField t1,t2,t3,t4,t5,t6;  
Image passport=null;
Command display,back,Exit; 
    public Info(){
    d=Display.getDisplay(this);
    m=this; 
    try{passport=Image.createImage("/passport.jpg");
    }
    catch(Exception e){
        e.printStackTrace();
    }}
    public void startApp() {
       Firstform();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    public void commandAction(Command command,Displayable displayable){
        if(t1.getString().equals("")||t2.getString().equals("")||t3.getString().equals("")||
                t4.getString().equals("")||t5.getString().equals("")||t6.getString().equals("")&&command==display){
            alert();
        }else{
        if(command==display){
            Secondform();
        }}
        if(command==back){
        Firstform();        }
    }
    public void Firstform(){
        Form f=new Form("STUDENTS DETAILS");
        t1=new TextField("NAME","",100,TextField.ANY);
        t2=new TextField("REG NUMBER","",10,TextField.NUMERIC);
        t3=new TextField("DEPARTMENT","",100,TextField.ANY);
        t4=new TextField("FACULTY","",100,TextField.ANY);
        t5=new TextField("SCHOOL","",100,TextField.ANY);
        t6=new TextField("PHONE NUMBER","",11,TextField.NUMERIC);
        display=new Command("Display",Command.OK,0);
        back=new Command("Back",Command.BACK,1);
        f.append(t1);
        f.append(t2);
        f.append(t3);
        f.append(t4);
        f.append(t5);
        f.append(t6);
        f.addCommand(display);
        f.addCommand(back);
        f.setCommandListener(this);
    d.setCurrent(f);
    }
    public void Secondform(){
    Form fm=new Form("STUDENTS PROFILE");
    String name=t1.getString().toUpperCase();
    String RegNumber=t2.getString();
    String department=t3.getString();
    String faculty=t4.getString();
    String school=t5.getString();
    String phonenumber=t6.getString();
    back=new Command("Back",Command.BACK,1);
    if(name.equals("FRANKLIN")){
    fm.append(passport);}
    fm.append("NAME: "+name);
    fm.append("REG NUMBER: "+RegNumber);
    fm.append("DEPARTMENT: "+department);
    fm.append("FACULTY: "+faculty);
    fm.append("SCHOOL: "+school);
    fm.append("PHONE NUMBER: "+phonenumber);
    fm.addCommand(back);
    fm.setCommandListener(this);
    d.setCurrent(fm);
    }
    public void alert(){
    
    Alert at=new Alert("baaannnnngg!!!");
    at.setString("Please fill all the spaces");
    at.setType(AlertType.ALARM);
    at.setTimeout(3000);
    d.setCurrent(at);
    }
    public void can(){
         form frm=new form(this);
    d.setCurrent(frm);
    }
    public void kill(){
        this.destroyApp(true);
        this.notifyDestroyed();
    
    }
}
