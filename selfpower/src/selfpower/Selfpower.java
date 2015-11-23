/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selfpower;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Selfpower {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       BigInteger add=BigInteger.ZERO;
       int N=sc.nextInt();
       for(long i=1; i<=N; i++){
       add=add.add(modpower(new BigInteger(""+i),i,new BigInteger("10000000000")));
       add.mod(new BigInteger("10000000000"));
       }
       System.out.println(add.mod(new BigInteger("10000000000")));
    }
    
    public static BigInteger modpower(BigInteger number,long pow, BigInteger mod){
       BigInteger temp=BigInteger.ONE;
       String get=Long.toBinaryString(pow);
       char[]op=get.toCharArray();      
       Vector<BigInteger> v=new Vector<BigInteger>();
       BigInteger times=number;
       v.addElement(times);
       for(int j=0; j<op.length-1; j++){       
       times=times.multiply(times);
       times=times.mod(mod);
       v.addElement(times);
       }
       for(int k=0; k<op.length; k++){
       if(op[k]=='1'){      
       temp=temp.multiply(v.elementAt(v.size()-1-k));
       temp=temp.mod(mod);
       }
       }
       return temp.mod(mod);
       }
}
