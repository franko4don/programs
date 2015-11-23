/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gugasfunction;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Gugasfunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=3; i<33; i++){
        String get=Integer.toBinaryString(i);
        if(get.contains("101")||get.contains("1001")){
        if(get.charAt(get.length()-1)=='1'){
        System.out.println(i+"  "+get);
        }
        }
        }
    }
    public static String add(int a,int b){
    int sum=a+b;
     return ""+a+"+"+b+"="+sum;
    }
    
     public static String add(int a,int b,int c){
     int sum=a+b+c;
     return ""+a+"+"+b+"+"+c+"="+sum;
    }
     
      public static String add(int a,int b,int c,int d,int e){
     int sum=a+b+c+d+e;
     return ""+a+"+"+b+"+"+c+"+"+d+"+"+e+"="+sum;
    }
      
     public static String add(int a,int b,int c,int d,int e,int f){
     int sum=a+b+c+d+e+f;
     return ""+a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+sum;
    }
}
