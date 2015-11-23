/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloarithmeticoflargenumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Moduloarithmeticoflargenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println(mod("12345","10000"));
       System.out.println(12345%10000);
    }
    
    public static long mod(String text,String trunc){
    long value=0;
    long mod1=(long)Math.pow(10, trunc.length()-2);
    long mod=Long.parseLong(trunc);
    int len=trunc.length()-2;
    if(text.length()%2==0){
    text="0"+repeat("0",len)+text;
    for(int i=0; i<text.length()-1-len; i++){
    long times=Long.parseLong(text.substring(i, i+len));
    value=((times*mod1)+Character.getNumericValue(text.charAt(i+len-1)))%mod;
    System.out.println(times);
    }
    }else{
    text="00"+repeat("0",len)+text;
    for(int i=0; i<text.length()-2-len; i++){
    long times=Long.parseLong(text.substring(i, i+len));
    value=((times*mod1)+Character.getNumericValue(text.charAt(i+len)))%mod;
    System.out.println(times);
    }
    }

    return value;
    }
        public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
