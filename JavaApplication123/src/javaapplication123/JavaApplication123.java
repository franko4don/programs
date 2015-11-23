/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication123;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class JavaApplication123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        BigInteger calc1=series(N);
        BigInteger calc2=new BigInteger("1");
        BigInteger calc3=new BigInteger(Long.toString(N));
        BigInteger two=new BigInteger("2");
        BigInteger ans=(calc3).multiply((calc2.add(calc1)).divide(two));
        BigInteger get=new BigInteger("1000000007");
        v.addElement(ans.mod(get));
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
    public static BigInteger series(long n){
    BigInteger b=new BigInteger(Long.toString(n));
    BigInteger c=new BigInteger("1");
    BigInteger op1=(b.pow(2));
    BigInteger op2=(b.subtract(c)).pow(2);
    BigInteger d=op1.subtract(op2);
    return d;
    }
}
