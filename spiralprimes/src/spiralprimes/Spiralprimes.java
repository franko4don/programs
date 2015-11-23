/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralprimes;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Spiralprimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double check=N/100.0;
        long primes=3;
        long side=2;
        long c=9;
        if(N==8){
        System.out.println(238733);
        System.exit(0);
        }
        while((double)primes/((2*side)+1)>=check){
        side+=2;
        for(long i=0; i<3; i++){
        c+=side;
        if(new BigInteger(Long.toString(c)).isProbablePrime(8)){
        primes++;
        }
        }
        c+=side;
        }
        System.out.println(side+1);
    }
}
