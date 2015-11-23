/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccimodified;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fibonaccimodified {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<BigInteger>v=new Vector<BigInteger>();
        int A=sc.nextInt();
        int B=sc.nextInt();
        BigInteger one=new BigInteger(Integer.toString(A));
        BigInteger two=new BigInteger(Integer.toString(B));
        v.addElement(one);
        v.addElement(two);
        int N=sc.nextInt();
        for(int i=0; i<N-2; i++){
        BigInteger ans=v.elementAt(i).add(v.elementAt(i+1).pow(2));
        v.addElement(ans);
        }
        System.out.println(v.elementAt(v.size()-1));
    }
}
