/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       double phi1=1.6180339;
       double phi2=0.6180339;
       double root5=Math.sqrt(5);
       double fibotemp=((Math.pow(phi1,n)-Math.pow(-phi2,n))/root5);
       System.out.println((long)(double)Math.round(fibotemp));
       }
    
}
