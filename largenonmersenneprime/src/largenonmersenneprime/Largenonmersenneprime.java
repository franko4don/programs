/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largenonmersenneprime;

import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largenonmersenneprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //    long T=sc.nextLong();
    //    for(long i=0; i<T; i++){
      //  long A=sc.nextLong();
       // long B=sc.nextLong();
    /**    long C=sc.nextLong();
        long D=sc.nextLong();
        long mod=1000000000000L;
        long pow=modpower(B,C,1000000000000L);
        long sum=(((pow*A)%mod)+D)%mod;
        int length=Long.toString(sum).length();*/
      //  System.out.println(repeat("0",12-length)+sum);
         System.out.println(log(8,8));
 //   }
    }
    
     public static long modpower(long number,long pow, long mod){
       long temp=1;
       String get=Long.toBinaryString(pow);
       char[]op=get.toCharArray();      
       Vector<Long> v=new Vector<Long>();
       long times=number%mod;
       v.addElement(times);
       for(int j=0; j<op.length-1; j++){ 
       times*=times;
       times%=mod;
       v.addElement(times);
       }
       for(int k=0; k<op.length; k++){
       if(op[k]=='1'){      
       temp*=v.elementAt(v.size()-1-k);
       temp%=mod;
       }
       }
       return temp%mod;
       }
    
     public static double log(long B, long C){
     double ans=C*Math.log10(B);
     double bd=ans%1;
     double calc=Math.pow(10, bd);
     
      return calc;
     }
     
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
