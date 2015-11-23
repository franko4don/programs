/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poweroflargenumbers;
import java.util.*;
import java.math.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Poweroflargenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // int T=sc.nextInt();
       // for(int i=0; i<T; i++){
        BigInteger third=new BigInteger("1000000007");
        BigInteger third1=new BigInteger("1000000006");
      //  long first=new BigInteger(sc.next()).mod(third).longValue();        
      //  long second=new BigInteger(sc.next()).mod(third1).longValue();
        System.out.println(modpower(3,50000008007L,7));
  //  }
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
