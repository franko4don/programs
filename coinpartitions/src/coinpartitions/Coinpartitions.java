/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coinpartitions;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Coinpartitions {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int coins[]=new int[20001];
       for(int i=1; i<coins.length; i++){
       coins[i]=i;
       }
       long ways[]=new long[coins.length];
       Arrays.fill(ways, 1);
       for(int j=2; j<coins.length; j++){
       for(int k=j; k<ways.length; k++){
       ways[k]=ways[k]+ways[k-j];
       ways[k]%=1000000007;
       }
       }
       int T=sc.nextInt();
       for(int m=0; m<T; m++){
       int N=sc.nextInt();
       System.out.println(ways[N]);
       }
   }   
        }
        

