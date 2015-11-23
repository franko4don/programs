/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR VALUE");
        String input=sc.next();
        String number=null;
        if(input.charAt(input.length()-1)=='!'){
        number=input.substring(0,input.length()-1);
        }else{
        System.out.println("SORRY YOU CAN ONLY CALCULATE FACTORIALS");
        System.exit(0);
        }
        long value=Long.parseLong(number);
        BigInteger b1=new BigInteger(number);
        BigInteger b2=new BigInteger("1");
        for(int i=0; i<value; i++){
        BigInteger now=new BigInteger(Integer.toString(i));
        b2=b2.multiply(b1.subtract(now));
        }
        
        System.out.println(b2);
    }
}
