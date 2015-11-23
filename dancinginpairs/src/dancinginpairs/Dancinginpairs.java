/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dancinginpairs;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Dancinginpairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        long ans=0;
        if(Math.sqrt(N)%1==0){
        ans=(long)Math.sqrt(N);
        }else{
        ans=(long)sqrt(N);
        }
        long check=ans%2;
        if(check==0){
        System.out.println("even");
        }else{
        System.out.println("odd");
        }
       
    }
    }
     public static double sqrt(long n){
    double low = 0.0;
    double high = (double)n+1;
    while ((high-low) > 0.00001) {
       double mid = (low+high) / 2;
        if (mid*mid < n) {
            low = mid;
        }
        else {
            high = mid;
        }
    }
    return low;
    }
}
