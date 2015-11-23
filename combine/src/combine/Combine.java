/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combine;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author FRANKCHUKY
 */
public class Combine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     /** long N=sc.nextLong();
      long K=sc.nextLong();
      long count=0;
      for(long x=1; x<=N; x++){
      long first=factorial(x);
      for(long r=0; r<x; r++){
      long second=factorial(r);
      long third=factorial(x-r);
      long answer=first/(second*third);
      if(answer>K){
      count++;
      }
      }
      }
      System.out.println(count);*/
       System.out.println(factorial(sc.nextLong()));
       
    }
    public static long factorial(long n){
        long number=n;
        long calc=1;
        for(int i=0; i<n; i++){
        calc*=(number-i);
        }
        return calc;
    }
    }
