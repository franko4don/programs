/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumerals;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Romannumerals {

    /**
     * @param args the command line arguments
     */
  static int max_n=5000000;
   static int mod=100000;
   static int [] memo = new int[max_n+5];
   static int fib(int n)
   {
      if(n==1)return 0;
      if(n==2) return 1;
      if(memo[n]>0)return memo[n];
      memo[n]=(fib(n-1) + fib(n-2))%mod;
      return memo[n];
   }
   public static void main(String []argh)
   {
      Scanner sc= new Scanner(System.in);
      for(int i=0;i<=max_n;i++)
      {
         fib(i);
      }
      int n=sc.nextInt();
      System.out.println(memo[n]);
      
   }
   
}
