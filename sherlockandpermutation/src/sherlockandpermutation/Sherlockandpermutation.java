/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandpermutation;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandpermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int M=sc.nextInt();
        BigInteger first=factorial(N+M-1);
        BigInteger second=factorial(M-1);
        BigInteger third=factorial(N);
        BigInteger answer=(first.divide(third.multiply(second))).mod(new BigInteger("1000000007"));
        System.out.println(answer);
        }
    }
    public static BigInteger factorial(long n){
        BigInteger b2=new BigInteger("1");
        for(long i=n; i>=1; i--){
        BigInteger now=new BigInteger(Long.toString(i));
        b2=b2.multiply(now);
        }
        return b2;
    }
}
