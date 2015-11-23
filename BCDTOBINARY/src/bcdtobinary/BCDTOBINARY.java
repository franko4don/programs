/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcdtobinary;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class BCDTOBINARY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.println(Converter(55));
      System.out.println(Integer.toBinaryString(Converter(55)));
    }
    
    public static int Converter(int a){
   int r,t;
   t=a & 0x0F;
   r=t;
   a=0xF0 & a;
   t=a>>4;
   t=0x0F & t;
   r=t*10+r;
   
   return r;
    }
    
       public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
