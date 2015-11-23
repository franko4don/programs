/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package campers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Campers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int K=sc.nextInt();
       int count=K;
       int low=Integer.MAX_VALUE;
       int high=0;
       int numbers[]=new int[K];
       for(int i=0; i<K; i++){
       int value=sc.nextInt();
       numbers[i]=value;
       if(value<low){
       low=value;
       }
       if(value>high){
       high=value;
       }
       }
       Arrays.sort(numbers);
       for(int j=low-2; j>0; j-=2){      
       count++;       
       }

       for(int k=0; k<K-1; k++){
       int diff=numbers[k+1]-numbers[k];
       if(diff>=4){
       count+=((numbers[k+1]-2-numbers[k])/2);
       }
       }
       for(int i=high+2; i<=N; i+=2){
       count++;
       }
       System.out.println(count);
    }
}
