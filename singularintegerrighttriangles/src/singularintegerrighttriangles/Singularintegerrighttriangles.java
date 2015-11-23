/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singularintegerrighttriangles;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Singularintegerrighttriangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   // int T=sc.nextInt();
  //  for(int i=0; i<T; i++){
     int limit =5000;
            int[] triangles = new int[limit+1];
                                    
            int result =0;
            int mlimit = (int)Math.sqrt(limit / 2);

            for (long m = 2; m <= mlimit; m++) {
                for (long n = 1; n < m; n++) {
                    if (((n + m) % 2) == 1 && gcd(n, m)==1) {
                        long a = m * m + n * n;
                        long b = m * m - n * n;
                        long c = 2 * m * n;                        
                        long p = a + b + c;                                                
                        while(p <= limit){
                            triangles[(int)p]++;
                            if (triangles[(int)p] == 1) result++;
                            if (triangles[(int)p] == 2) result--;
                            p += a+b+c;
                        }
                    }
                }
            
            System.out.println(m+" "+result);
            }
  //  }
    }
    private static long gcd(long a, long b) {
    long y, x;
    if (a>b){
    x=a;
    y=b;
    }else{
    x=b;
    y=a;
    }
    while(x%y!=0){
    long temp=x;
    x=y;
    y=temp%x;
    }
     return y;
    }
}
