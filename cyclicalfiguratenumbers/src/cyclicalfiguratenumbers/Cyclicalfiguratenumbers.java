/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicalfiguratenumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Cyclicalfiguratenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector triangle=new Vector();
       Vector square=new Vector();
       Vector pentagon=new Vector();
       Vector hexagon=new Vector();
       Vector heptagon=new Vector();
       Vector octagon=new Vector();
       for(int i=1; i<1000; i++){
       int number=(i*(i+1))/2;
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       triangle.addElement(number);
       }
       }
       for(int i=1; i<1000; i++){
       int number=i*i;
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       square.addElement(number);
       }
       }
       for(int i=1; i<1000; i++){
       int number=(i*((3*i)-1))/2;
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       pentagon.addElement(number);
       }
       }
       for(int i=1; i<1000; i++){
       int number=i*((2*i)-1);
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       hexagon.addElement(number);
       }
       }
       for(int i=1; i<1000; i++){
       int number=(i*((5*i)-3))/2;
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       heptagon.addElement(number);
       }
       }
       for(int i=1; i<1000; i++){
       int number=i*((3*i)-2);
       if(Integer.toString(number).length()>4){
       break;
       }
       if(Integer.toString(number).length()==4){
       octagon.addElement(number);
       }
       }
       
    }
}
