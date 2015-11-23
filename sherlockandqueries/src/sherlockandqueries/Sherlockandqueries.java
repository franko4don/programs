/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandqueries;

import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandqueries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[]A=new int[N+1];
        int[]B=new int[M+1];
        int[]C=new int[M+1];
       //A[0]=B[0]=C[0]=0;
        A[0]=0;  B[0]=0; C[0]=0;
        /**A[1]=1;  B[1]=1; C[1]=13;
        A[2]=2;  B[2]=2; C[2]=29;
        A[3]=3;  B[3]=3; C[3]=71;
        A[4]=4;*/
        for(int e=1; e<N+1; e++){
        A[e]=sc.nextInt();
        }
        for(int f=1; f<M+1; f++){
        B[f]=sc.nextInt();
        }
        for(int g=1; g<M+1; g++){
        C[g]=sc.nextInt();
        }
              
        for(int i=1; i<=M; i++){
        for(int j=1; j<=N; j++){
        if (j%B[i]==0){
            A[j]=A[j]*C[i];
        }
        }
        }
        for(int k=1; k<A.length; k++){
        System.out.print(A[k]+" ");
        
        }
    }
}
