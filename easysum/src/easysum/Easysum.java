/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package easysum;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Easysum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        long M=sc.nextLong();
        long number=N/M;
        long remain=N%M;
        BigInteger lastterm=new BigInteger(Long.toString(M-1));
        BigInteger multiplier=new BigInteger(Long.toString(number));
        BigInteger firstterm=new BigInteger("1");
        BigInteger divider=new BigInteger("2");
        BigInteger sum=(lastterm.multiply(firstterm.add(lastterm))).divide(divider);
        BigInteger ans1=multiplier.multiply(sum);
        BigInteger multiplier2=new BigInteger(Long.toString(remain));
        BigInteger ans2=(multiplier2.multiply(firstterm.add(multiplier2))).divide(divider);
        v.addElement(ans1.add(ans2));
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
    
}
