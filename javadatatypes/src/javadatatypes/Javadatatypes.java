/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatatypes;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Javadatatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){       
        String check1="";
        String check2="";
        String check3="";
        String check4="";
        String check5="";
        String input=sc.next();
        try{
        long b=Long.parseLong(input);
        }catch(Exception e){
         check1="error";
        }
        if(check1.equals("error")){
        System.out.println(input+" can't be fitted anywhere.");
        continue;
        }
        System.out.println(input+" cant be fitted in:");
        try{
        byte b=Byte.parseByte(input);
        }catch(Exception e){
        check2="error";
        }
        
        try{
        short b=Short.parseShort(input);
        }catch(Exception e){
        check3="error";
        }
        
        try{
        int b=Integer.parseInt(input);
        }catch(Exception e){
        check4="error";
        }
        
        try{
        long b=Long.parseLong(input);
        }catch(Exception e){
        check5="error";
        }
        if(!check2.equals("error")){
        System.out.println("* byte");
        }
        
        if(!check3.equals("error")){
        System.out.println("* short");
        }
        
        if(!check4.equals("error")){
        System.out.println("* int");
        }
        
        if(!check5.equals("error")){
        System.out.println("* long");
        }
        
    }
    }
}
