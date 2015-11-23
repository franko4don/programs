/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmoduloexponentiation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fastmoduloexponentiation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long raise=sc.nextLong();
        long mod=sc.nextLong();
        long answer=power(N,raise,mod);
        System.out.println(answer);
    }
    public static long power(long a,long b,long c){
    long temp=a;
    for(long i=1; i<b; i++){
    temp*=a;
    temp%=c;
    }
    return temp;
    }
}
