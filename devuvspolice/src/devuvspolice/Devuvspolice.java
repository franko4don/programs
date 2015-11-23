/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devuvspolice;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Devuvspolice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       long n1=sc.nextLong();
       long k1=sc.nextLong();
       long n2=sc.nextLong();
       long k2=sc.nextLong();
       long mod=sc.nextLong();
       long first=modpower(n1,k1,mod);
       long third=modpower(n2,k2,mod);
       System.out.println(first+" "+third);
       System.out.println(modpower(first,third,mod));
       }
    }
     public static long modpower(long number,long pow, long mod){
       long temp=1;
       String get=Long.toBinaryString(pow);
       char[]op=get.toCharArray();      
       Vector<Long> v=new Vector<Long>();
       long times=number;
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
}
