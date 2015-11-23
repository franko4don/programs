/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superpowersof2;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Superpowersof2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int mod=sc.nextInt();
       long first=modpower(2,a,mod);
       System.out.println(first);
       System.out.println(modpower(2,first,mod));
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
