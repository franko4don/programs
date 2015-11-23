/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largesum;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largesum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        BigInteger b1=new BigInteger("0");
        for(int i=0; i<N; i++){
        String values=sc.next();
        BigInteger b2=new BigInteger(values);
        b1=b1.add(b2);
        }
        System.out.println(b1.toString().substring(0,10));
    }
}
