/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common.anode;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class CommonAnode {
static String input; static int output;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       getdisplay();
       /** String show;  String first="a"; int a=1000010; String b="101010"; String second="b"; int action=0; String third="c";
        String display; 
        Scanner sc=new Scanner(System.in);
        
        //System.out.println("enter the number ");
     // show=sc.next();    
     //if(show.equals(first)){
       //  JOptionPane.showMessageDialog(null,"please enter your value","commonanode",JOptionPane.PLAIN_MESSAGE);
        input=JOptionPane.showInputDialog(null,"please enter your value","commonanode",JOptionPane.PLAIN_MESSAGE);
    if(input.equals(second)){
    JOptionPane.showMessageDialog(null,b,"thats the equivalent",JOptionPane.PLAIN_MESSAGE);
    
        }else{JOptionPane.showMessageDialog(null,"ERROR","Try again",JOptionPane.ERROR_MESSAGE);}
    
    }                 
// if(show.equals(second)){          
  //         System.out.println(b);
 //          sc.notify();
 //}}
 
/**case 3:{}
          break;
 case 4:{}
          break;
case 5:{}
          break;
case 6:{}
          break;
 case 7:{}
          break;
case 8:{}
          break;
case 9:{}
          break;
 case 10:{}
          break;*/
    }
    public static void getdisplay(){
         String exit="exit";  String first,second,third,fourth,fifth,sixth,seventh,eighth,nineth,tenth,eleventh,twelveth,thirteenth,fourteenth,fifteenth,
sixteenth,seventeenth,eighteenth,nineteenth,twentieth,twentyfirst,twentysecond,twentythird,twentyfourth,twentyfifth,twentysixth;
first="a"; second="b"; third="c"; fourth="d"; fifth="e"; sixth="f"; seventh="g"; eighth="h"; nineth="i"; tenth="j"; eleventh="k"; 
twelveth="l"; thirteenth="m"; fourteenth="n"; fifteenth="o"; sixteenth="p"; seventeenth="q"; eighteenth="r"; nineteenth="s"; twentieth="t";
twentyfirst="u"; twentysecond="v"; twentythird="w"; twentyfourth="x"; twentyfifth="y"; twentysixth="z";
String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z; String yes="yes"; String no="no";
a="10100000";
b="10000011";
c="11000110";
d="10000100";
e="10000100";
f="10001110";
g="10010000";
h="10001011";
i="11111001";
j="11110001";
k="1-------";
l="11000111";
m="1-------";
n="11001000";
o="11000000";
p="10001100";
q="10011000";
r="11001110";
s="10010010";
t="10000111";
u="11000001";
v="1-------";
w="1-------";
x="1-------";
y="10010001";
z="1-------";

        String display; boolean discover=true; int ryt=4556;
        Scanner sc=new Scanner(System.in);
        for(int inc=0; inc<=26; inc++){
         input=JOptionPane.showInputDialog(null,"Enter your alphabet value in lowercase "+"(Type exit to exit)","commonanode",JOptionPane.PLAIN_MESSAGE);
         if(inc<26){
             if(input.equals(first)){
        JOptionPane.showMessageDialog(null,a,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(second)){
    JOptionPane.showMessageDialog(null,b,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE); }
    if(input.equals(third)){
        JOptionPane.showMessageDialog(null,c,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(fourth)){JOptionPane.showMessageDialog(null,d,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(fifth)){JOptionPane.showMessageDialog(null,e,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(sixth)){JOptionPane.showMessageDialog(null,f,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(seventh)){JOptionPane.showMessageDialog(null,g,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(eighth)){JOptionPane.showMessageDialog(null,h,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(nineth)){JOptionPane.showMessageDialog(null,i,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(tenth)){JOptionPane.showMessageDialog(null,j,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(eleventh)){JOptionPane.showMessageDialog(null,k,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twelveth)){JOptionPane.showMessageDialog(null,l,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(thirteenth)){JOptionPane.showMessageDialog(null,m,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(fourteenth)){JOptionPane.showMessageDialog(null,n,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(fifteenth)){JOptionPane.showMessageDialog(null,o,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(sixteenth)){JOptionPane.showMessageDialog(null,p,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(seventeenth)){JOptionPane.showMessageDialog(null,q,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(eighteenth)){JOptionPane.showMessageDialog(null,r,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(nineteenth)){JOptionPane.showMessageDialog(null,s,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentieth)){JOptionPane.showMessageDialog(null,t,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentyfirst)){JOptionPane.showMessageDialog(null,u,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentysecond)){JOptionPane.showMessageDialog(null,v,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentythird)){JOptionPane.showMessageDialog(null,w,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentyfourth)){JOptionPane.showMessageDialog(null,x,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentyfifth)){JOptionPane.showMessageDialog(null,y,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(twentysixth)){JOptionPane.showMessageDialog(null,z,"This is the equivalent",JOptionPane.INFORMATION_MESSAGE);}
    if(input.equals(exit)){JOptionPane.showMessageDialog(null,"Are you sure you want to exit?(if yes,type Yes and if No type no)","Confirmation",JOptionPane.INFORMATION_MESSAGE); input=JOptionPane.showInputDialog(null,"Type yes or no","Confirmation",JOptionPane.PLAIN_MESSAGE);
    if(input.equals(yes)){
    JOptionPane.showMessageDialog(null,"Email: franko4don@yahoo.com ::: Phone Number: 07037219055","Contact us now",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);}}
    else{if(input.equals(no)){input=JOptionPane.showInputDialog(null,"Type yes or no","Confirmation",JOptionPane.PLAIN_MESSAGE);
    
    
    }}}
         else{JOptionPane.showMessageDialog(null,"ERROR: You have exceeded the limit","Re-enter your value",JOptionPane.ERROR_MESSAGE);
         System.exit(0);
         } 
     /** FileOutputStream fr=null;   FileWriter fw; FileInputStream fis=null;
     try{
         if(input.equals(third)){
             fis=new FileInputStream("C:\\Users\\FRANKCHUKY\\Desktop\\java progs\\common anode\\src\\example.txt");
         fr=new FileOutputStream("C:\\Users\\FRANKCHUKY\\Desktop\\java progs\\common anode\\src\\example.txt");
         fw=new FileWriter("C:\\Users\\FRANKCHUKY\\Desktop\\java progs\\common anode\\src\\example.txt");
           fw.write(a);
           
          
         }
    // fr=new FileReader("C:\\Users\\FRANKCHUKY\\Desktop\\java progs\\common anode\\src\\example.txt");
     
     
         
     
     }
     catch(IOException error){
         JOptionPane.showMessageDialog(null,error,"here",JOptionPane.PLAIN_MESSAGE);
         }*/}}
    
     
      
      public static void fileinput(){
}   
    }

 
            
    
       
        
        
    

