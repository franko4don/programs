/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long firstmatrix[][]=new long[N][N];
        long secondmatrix[][]=new long[N][N];
        long answer[][]=new long[N][N];
        for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
        firstmatrix[i][j]=sc.nextLong();
        }
        }
        for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
        secondmatrix[i][j]=sc.nextLong();
        }
        }
        for(int k=0; k<N; k++){       
        for(int p=0; p<N; p++){
        long ans=0;
        for(int l=0; l<N; l++){
        long first=firstmatrix[k][l];
        for(int m=l; m<l+1; m++){
        for(int n=p; n<p+1; n++){
        long second=secondmatrix[m][n];
        ans+=(first*second);
        }
        }
        }
        answer[k][p]=ans;
        }
        }
        for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
        System.out.print(answer[i][j]+" ");
    }
     System.out.println();
    }
    }
}
