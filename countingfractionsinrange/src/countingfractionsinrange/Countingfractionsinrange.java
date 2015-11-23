/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingfractionsinrange;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingfractionsinrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       long range=sc.nextLong();
       long a=1;
       long b=n;
       long c1=0;
       long d1=1;
       for(long q=range; q>1; q--) {
        long check=(q*a)-1;
        if(check%b==0){
        c1=check/b;
        d1=q; 
        break;
        }
       }
       
       int num=0;
       while(!(c1==1&&d1==n+1)){
       long k=(range+b)/d1;
       long e=k*c1-a;
       long f=k*d1-b;
       a=c1;
       b=d1;
       c1=e;
       d1=f;
       num++;
       }
       System.out.println(num);
    }
}
