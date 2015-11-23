/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thecoinchangeproblem;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Thecoinchangeproblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int coins[]=new int[M];
        for(int i=0; i<M; i++){
        coins[i]=sc.nextInt();
        }
        Arrays.sort(coins);
        int ways[]=new int[N+1];
        for(int j=0; j<M; j++){
        for(int k=0; k<N+1; k++){
        if(j==0&&k%coins[j]==0){
        ways[k]=1;
        }else{
        if(k>=coins[j]){
        ways[k]=ways[k]+ways[k-coins[j]];
        }
        }
        }
        }
        System.out.println(ways[N]);
    }
}
