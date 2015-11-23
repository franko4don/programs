/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;
import java.util.*;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.lcdui.*;
/**
 * @author FRANKCHUKY
 */
public class calvas extends Canvas implements CommandListener{
Midlet n;  TextField t1,t2,t3;
int w;int nx=0; 
boolean keyheld=false;
int px=3; int py=3; int h;int ny=0;
Form f;
Timer t;
TimerTask tt;
double value1,value2,solution;
Command exit,Calc,back;
Alert empty;
FileConnection fc;
Vector v=new Vector();
Image next=null; Image gow=null; Image about=null; 
Image help=null; Image pointer=null;
String first,second,answer,sign;
String EmptyString="";
String AboutAuthor="This program was written by Nwanze Franklin Chuka,a student of Nnamdi Azikiwe University Awka. Department \nof"
        + "Electronic and Computer Engineering, 300 level. \nHE has written so many other programs and has a website which houses all "
        + "of them,so you can as well go to his site and download some good apps for the benefit of solving problems";
          
    /**
     * constructor
     */
    public calvas(Midlet n) {
        setFullScreenMode(true);
       h=getHeight(); w=getWidth();
       this.n=n;
        try {
            //sets the path of the image
            gow=Image.createImage("/gow.jpg");
            next=Image.createImage("/next.jpg"); 
            about=Image.createImage("/about.jpg");
            help=Image.createImage("/help.jpg");
            pointer=Image.createImage("/pointer.png");
         
           //setCommandListener(this);
        } catch (Exception e) {
        }
    }
//paint
    public void paint(Graphics g) {
     //   nx=w/8; ny=h/8;
        g.setColor(0xffacaa);
        g.fillRect(0,0,w, h);
        g.drawImage(next,nx,ny,Graphics.TOP|Graphics.LEFT);
        g.drawImage(pointer,px,py,Graphics.TOP|Graphics.LEFT);
        g.setColor(0,0,0);
        g.drawString("Answer= "+answer,52,54, nx);
        repaint();
    }
    //Called when a key is pressed.
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
        }catch(java.lang.IllegalArgumentException e){}
        
        if(keyCode==KEY_SOFTKEY2){
            Midlet.m.d.setCurrent(new Last(this,answer));
        }
        if(keyCode==KEY_SOFTKEY1){n.kill();}
           
        switch(action){
          
            case FIRE:{if(px>=nx&&px<nx+next.getWidth()&&py>ny&&py<ny+next.getHeight()){
                this.form();
            }
            }
            break;
            case RIGHT:{if(px<=w-(w/8)){
                px+=8;
            }
            }
            break;
            case UP:{if(py>4){
            py-=8;
            }
                
            }
            break;
            case LEFT:{if(px>=1){
            px-=8;
            }}
            break;
            case DOWN:{
      py+=8;
            }
         break;}}
    
 
    
 //Called when a key is released.
    protected void keyReleased(int keyCode) {
      
    }
     // Called when a key is repeated (held down).
    protected void keyRepeated(int keyCode) {  
        
    }
     // Called when the pointer is dragged.
    protected void pointerDragged(int x, int y) {
    }
     // Called when the pointer is pressed.
    protected void pointerPressed(int x, int y) {
    }
    // Called when the pointer is released.
    protected void pointerReleased(int x, int y) {
    }
    //assigns operations to the commands
    public void commandAction(Command command, Displayable displayable){
        String label=command.getLabel();
        if(t1.getString().equals(EmptyString)||t2.getString().equals(EmptyString)||t3.getString().equals(EmptyString)&&
            label.equals("Calc")){AlertEmpty();}
        else{
       operation();SaveFile(); n.display();
    }
        if(command==back){n.display();
        }
        if(label.equals("Exit")){n.kill();}
    }
    public void form(){
     f=new Form("Enter your number values");
     t1=new TextField("First number","",40,TextField.DECIMAL);
     t2=new TextField("Second number","",40,TextField.DECIMAL);
     t3=new TextField("Sign","",1,TextField.NON_PREDICTIVE);
     Calc=new Command("Calc",Command.OK,1);
     back=new Command("Back",Command.BACK,2);
     f.append(t1);
     f.append(t3);
     f.append(t2);
     f.addCommand(back);
     f.addCommand(Calc);
     f.setCommandListener(this);
     n.d.setCurrent(f);
    }
    //Gets the values from form and performs the required operation
    public void operation(){
        String add="+"; String subtract="-"; String multiply="*"; String divide="/";
     first=t1.getString();
     second=t2.getString();
     sign=t3.getString();
     value1=Double.parseDouble(first);
     value2=Double.parseDouble(second);
    if(sign.equals(multiply)){
     solution=value1*value2;
     answer=Double.toString(solution);}
    if(sign.equals(add)){
        solution=value1+value2;
        answer=Double.toString(solution);
    }
    if(sign.equals(subtract)){
        solution=value1-value2;
        answer=Double.toString(solution);
    }
    if(sign.equals(divide)){
        solution=value1/value2;
        answer=Double.toString(solution);
    }
    }
    //called when an alert is needed to notify the operator
    public void AlertEmpty(){
    empty=new Alert("baaam");
    empty.setType(AlertType.WARNING);
    empty.setString("Please enter the required numbers and sign");
       empty.setTimeout(2000);
       n.d.setCurrent(empty);
    }
    //called when a String is to be written to a file
    public void OpenFile() throws IOException{
       String folder=System.getProperty("fileconn.dir.photos")+"frank/";
       fc=(FileConnection)Connector.open(folder,Connector.READ_WRITE);
       try{
       if(fc.exists()){
           System.out.print("carry on");
       }else{
           System.out.print("not found"); fc.mkdir();
       }
       }
        finally{fc.close();}
        fc=(FileConnection)Connector.open(folder+"chuky.txt",Connector.READ_WRITE);
        try{
        if(!fc.exists()){fc.create();} 
        OutputStream out=fc.openOutputStream();
        try{
        out.write(answer.getBytes());
        }finally{fc.close();}
        }
        finally{fc.close();}
    }
    public void SaveFile(){
        try{OpenFile();}
        catch(Exception e){}
    }
    public void stringControl(){
        
    }
}