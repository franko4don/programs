/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coinsums;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Coinsums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int coins[]=new int[]{1,2,5,10,20,50,100,200};
       long ways[][]=new long[coins.length][100000];
       for(int i=0; i<ways.length; i++){
       for(int j=0; j<ways[i].length; j++){
       if(i==0){
       ways[i][j]=1;
       }else{
       if(j<coins[i]){
       ways[i][j]=ways[i-1][j];
       ways[i][j]%=1000000007;
       }else{
       ways[i][j]=ways[i-1][j]+ways[i][j-coins[i]];
       ways[i][j]%=1000000007;
       }
       }
       
       }
       }
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       System.out.println(ways[ways.length-1][N]);
       }
    }
}
