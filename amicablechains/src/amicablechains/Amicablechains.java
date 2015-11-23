/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablechains;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Amicablechains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int limit=1000000;
       int divisors[]=new int[limit+1];
       for(int i=1; i<divisors.length; i++){
       for(int j=i; j<divisors.length; j+=i){
       divisors[j]+=i;
       }
       }
       for(int k=0; k<divisors.length; k++){
       divisors[k]-=k;
       }
       int N=sc.nextInt();
       int high=0;
        int answer=0;
       for(int m=1; m<=N; m++){
       int count=1;     
       int sub=0;
       int temp=divisors[m];
       while(temp!=m){
       if(count>28||temp>N){
       sub++;
       break;
       }
       temp=divisors[temp];
       count++;     
       }
       if(sub==0){
       if(count>high){
       high=count;
       answer=m;
       }
       }
       }
       System.out.println(answer);
    }
}
