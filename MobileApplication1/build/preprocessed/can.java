/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;
import java.io.*;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.Connector;
/**
 * @author FRANKCHUKY
 */
public class can extends Canvas implements CommandListener {
    String a= "am coming home very soon";
   int x=0; int h=0; int w=0; Form f;  int y=0;  TextField t1,t2;
   int j=0; int green=0; int red=0; int blue=0;
   int k=0; int dy=49; int dx=29; int size=0; int face=0; int style=0; 
   int px=0; int py=0; Alert messageAlert;
   boolean stop=true; int b=07037; FileConnection fc;
   boolean isGoingForward=true;boolean returncanvas=true,putImage=false;
   Midlet n; String messagecontent="Thanks for registering with us";
    Image picture = null;
Image mum=null;
Image start=null; 
Image Continue=null;
//Image background=null;
Image mouse=null;
 Command exit,ok,quit;
int bx=0,by=20;

    /**
     * constructor
     */
    
    public can(Midlet n) {
       this.n=n;
        setFullScreenMode(true);
        h=getHeight(); w=getWidth();
        f=new Form("Information");
       t1=new TextField("Username","",80,TextField.ANY);
           t2=new TextField("Password","",68,TextField.PASSWORD); 
            quit=new Command("Exit",Command.EXIT,1);
            exit=new Command("Exit",Command.EXIT,2);
        ok=new Command("Ok",Command.OK,0);
       
        //destroy=new Command("kill",Command.CANCEL,0);
        f.addCommand(ok);
        f.addCommand(exit);
       //f.addCommand(destroy);
            f.append(t1);
            f.append(t2); 
           f.setCommandListener(this);
        //  this.addCommand(quit);
         // this.setCommandListener(this);
          try {
            
            picture=Image.createImage("/picture.frank");
            //mum=Image.createImage("/mum.jpg");
            start=Image.createImage("/start.jpg");
            Continue=Image.createImage("/continue.jpg");
            mouse=Image.createImage("/mouse.jpg");
        } catch (Exception e) {
            e.printStackTrace();            
        }      
    }  
    /**
     * paint
     */
    public void paint(Graphics g) {

       animation();
       g.setColor(red,green,blue);
     g.fillRect(0,0,w, h);
      // g.setColor(40,67,89);
        //g.fillRect(0,0,w/2,20+h/2);
          //  g.setColor(255,0,0);
            //g.fillRect(w/2,0,w,(h/2)+5);
            //g.setColor(0,255,0);
            //g.fillRect(0,h-(h/2)+5,w-w/2,h);
            //g.setColor(0,0,255);
            //g.fillRect(w-w/2,h-(h/2)+5,w,h);
    
   
     //g.setColor(0,0,0);
      g.drawString(a, 17, 17, 0);
      
      // g.drawRect(j,10,70,20);
       //g.drawRect(y,40,70,20);
     
       if(putImage){
           n.d.setCurrent(f);
        } 
      g.drawImage(picture,(w/2)-(w-w/2-17),y-170, Graphics.TOP | Graphics.LEFT);
  g.drawImage(start,bx,by, Graphics.TOP | Graphics.LEFT);  
           g.drawImage(Continue,(w/2)-10,y-70, Graphics.TOP | Graphics.LEFT);
            g.drawImage(mouse,px,py, Graphics.TOP|Graphics.LEFT);
   }
  
   /* Called when a key is pressed.
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
            
            case FIRE:{
              if(px>bx&&px<bx+start.getWidth()&&py>by&&py<by+start.getHeight()){ 
                  if(putImage){
              putImage=false;
                  }
                  else{
                  putImage=true;
                  }
              }
            }
                break;
            case LEFT:{
                px-=15;}
                break;
            case RIGHT:{
                px+=15;}
                break;
            case DOWN:{py+=10;}
                break;
            case UP: {py-=10;}
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
    public  void commandAction(Command c, Displayable displayable) {
       
        if(c==exit){
         Midlet.m.kill();}
        else{if(c==ok){
          openfile(); alert();//n.startApp();
        }
        
        
        
        }
    }
    public void animation(){
       
    
    
       
        
       if(isGoingForward){
       if(bx<w){
       bx+=4; green+=1;
       }else{
        isGoingForward=false;
       }
       }else{
          
       if(bx>(w/2)){
          bx-=2; y+=2; 
       red+=2; blue+=2;
}else{
       bx=w/2;
       }
       }
      
 
     
 
       }
   public void openfile(){
 try{saveFile();
 }
 catch(Exception e){e.printStackTrace();
   }}
   private void saveFile()throws IOException{
       String folder=System.getProperty("fileconn.dir.photos")+"chuky/";
       fc=(FileConnection)Connector.open(folder,Connector.READ_WRITE);
       try{
           if(fc.exists()){
               System.out.println("exists");}
           else{System.out.println("not exist"); fc.mkdir();}
           }
       finally{
           fc.close();
       }
       fc=(FileConnection)Connector.open(folder+"franky.txt",Connector.READ_WRITE);
       try{
           if(!fc.exists()){fc.create();}
           OutputStream out=fc.openOutputStream();
           try{
               String userText=t1.getString();
               String password=t2.getString();
               out.write(userText.getBytes());
               out.write(password.getBytes());
           }finally{out.close();}
       }
       finally{fc.close();}
   }
    public void alert(){
         messageAlert=new Alert("registration complete");
         messageAlert.setType(AlertType.CONFIRMATION);
         messageAlert.setString(messagecontent);
         messageAlert.setTimeout(3000);
         n.d.setCurrent(messageAlert);
      
    }  
}  
        
           
         
        
        

        
       
          
       
        
        
        
        
       
       
    
  