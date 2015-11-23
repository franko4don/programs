/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flippingbits;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Flippingbits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       long N=sc.nextLong();
       String control=Long.toBinaryString(N);
       int length=control.length();
       String check=repeat("0",32-length)+control;
       String main="";
       for(int j=0; j<check.length(); j++){
       if(Character.getNumericValue(check.charAt(j))==1){
       main+="0";
       }else{
       main+="1";
       }
       }    
       System.out.println(Long.parseLong(main, 2));
       }
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
