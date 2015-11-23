/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twoarrays;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Twoarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int n=sc.nextInt();
       long k=sc.nextLong();
       long values1[]=new long[n];
       long values2[]=new long[n];
       for(int j=0; j<n; j++){
       values1[j]=sc.nextLong();
       }
       for(int l=0; l<n; l++){
       values2[l]=sc.nextLong();
       }
       Arrays.sort(values1);
       Arrays.sort(values2);
       int count=0;
       for(int m=0; m<values1.length; m++){
       if(values1[m]+values2[values2.length-1-m]>=k){
       count++;
       }
       }
       if(count==n){
       System.out.println("YES");
       }else{
       System.out.println("NO");
       }
       }
    }
}
