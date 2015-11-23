/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discretelogarithm;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Discretelogarithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int count=0;
       BigInteger a=new BigInteger(Long.toString(sc.nextLong()));
       long start=sc.nextLong();
       BigInteger g=new BigInteger(Long.toString(sc.nextLong()));
       for(long j=1; j<200000; j++){
       BigInteger b=new BigInteger(Long.toString(j));
       BigInteger check=a.modPow(b, g);
       if(check.equals(new BigInteger(Long.toString(start)))){
       System.out.println(j);
       count++;
       break;
       }
       }
       if(count==0){
       System.out.println(-1);
       }
       }
    }
}
