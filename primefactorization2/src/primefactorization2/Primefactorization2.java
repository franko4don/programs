/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactorization2;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Primefactorization2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=2000000;
       int []number=new int[N+1];
       int []sum=new int[N+1];
       for(int i=0; i<=N; i++){
       number[i]=i;
       }
       for(int j=2; j<=N; j++){
       int div=number[j];
       if(div!=1){
       for(int k=j; k<=N; k+=j){
       number[k]/=div;
       sum[k]+=div;
       }
       }
       }
       int T=sc.nextInt();
       int add=0;
       for(int m=0; m<T; m++){
       int get=sc.nextInt();
       add+=sum[get];
       }
       System.out.println(add);
    }
}
