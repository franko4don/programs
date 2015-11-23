/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coinage;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Coinage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int coins[]=new int[]{1,2,5,10};
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long high=0;
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int check[]=new int[]{A,B,C,D};
        long ways[]=new long[N+1];
        ways[0]=1;
        int add=0;
        for(int j=0; j<coins.length; j++){
        add+=coins[j]*check[j];
        for(int k=coins[j]; k<ways.length; k++){
        
        if(k>add)break;
        if(j==0){         
        ways[k]=1;
        }else{
        ways[k]=ways[k]+ways[Math.abs(coins[j]-k)%coins[j]];
        }
        }
       
       
        
        
        }
        System.out.println(ways[ways.length-1]);
        }
    }
}
