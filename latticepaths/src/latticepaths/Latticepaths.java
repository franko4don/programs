/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latticepaths;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Latticepaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int M=sc.nextInt();
        int sum=M+N;
        BigInteger first=factorial(sum);
        BigInteger second=factorial(N);
        BigInteger third=factorial(M);
        BigInteger ans=(first.divide(second.multiply(third))).mod(new BigInteger("1000000007"));
        System.out.println(ans);
        }
        
    }
    private static BigInteger factorial(int n){
    BigInteger calc=BigInteger.ONE;
    for(int i=n; i>=1; i--){
    BigInteger times=new BigInteger(Integer.toString(i));
    calc=calc.multiply(times);
    }
    return calc;
    }
}
