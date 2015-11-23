/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powercalculation;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Powercalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int j=0; j<T; j++){
       
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
       return temp;
       }
}
