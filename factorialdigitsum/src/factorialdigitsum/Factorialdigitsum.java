/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialdigitsum;
import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author FRANKCHUKY
 */
public class Factorialdigitsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        String number=sc.next();    
        long value=Long.parseLong(number);
        BigInteger b1=new BigInteger(number);
        BigInteger b2=new BigInteger("1");
        for(int j=0; j<value; j++){
        BigInteger now=new BigInteger(Integer.toString(j));
        b2=b2.multiply(b1.subtract(now));
        }
        String compute=b2.toString();
        int sum=0;
        for(int k=0; k<compute.length(); k++){
        sum+=Integer.parseInt(String.valueOf(compute.charAt(k)));
        }
        v.addElement(sum);
        }
        for(int l=0; l<v.size(); l++){
        System.out.println(v.elementAt(l));
        }
    }
}
