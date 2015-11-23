/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightgremlins;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lightgremlins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int S=sc.nextInt();
        long values[]=new long[S+1];
        int G=sc.nextInt();
        int primes[]=new int[G];
        long sum=0;
        for(int j=0; j<G; j++){
        int number=sc.nextInt();
        primes[j]=number;
       // sum+=(S/number);
        }
       // System.out.println(sum);
        for(int m=0; m<G; m++){
        for(int n=primes[m]; n<=S; n+=primes[m]){
       // if(primes[m]==primes[n])continue;
       // sum-=(S/(primes[m]*primes[n]));
         if(values[n]==0){
         values[n]=1;
         }else{
         values[n]=0;
         }
        }
        }
        int count=0;
        for(int k=1; k<=S; k++){
        if(values[k]==1){
        count++;
        }
        }
        System.out.println(count);
        }
    }
    public static long multiply(int prime[]){
    for(int i=0; i<prime.length; i++){
    
    }
    return 1;
    }
}
