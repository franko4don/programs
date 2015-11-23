/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maximisesum;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Maximisesum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        long M=sc.nextLong();
        long high=0;
        long values[]=new long[N];
        for(int j=0; j<N; j++){       
        values[j]=sc.nextLong();      
        }
         for(int k=0; k<N; k++){
         for(int l=0; l<N; l++){
         long temp[]=Arrays.copyOfRange(values,l, l+k+1);
        // System.out.println(Arrays.toString(temp));
         long sum=0;
         for(int m=0; m<temp.length; m++){
         sum+=temp[m];
         }
         long mod=sum%M;
         if(mod>high){
         high=mod;
         }
         }
         
         }     
        System.out.println(high);
        }
    }
}
