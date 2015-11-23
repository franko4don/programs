/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samandsubstrings;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Samandsubstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String take=sc.next();
        BigInteger sum=BigInteger.ZERO;
        StringBuilder sb=new StringBuilder().append(take);
        for(int i=0; i<take.length(); i++){        
        String con="";
        for(int j=0; j<sb.length(); j++){
        con+=sb.charAt(j);
        BigInteger get=new BigInteger(con);
        sum=sum.add(get).mod(new BigInteger("1000000007"));
        }
        sb.deleteCharAt(0);
        }
        System.out.println(sum.mod(new BigInteger("1000000007")));
    }
}
