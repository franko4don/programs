/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonaldifference;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Diagonaldifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int numbers[][]=new int[N][N];
        for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
        numbers[i][j]=sc.nextInt();
        }
        }
        int sum1=0;
        int sum2=0;
        for(int i=0; i<N; i++){
        for(int j=i; j<i+1; j++){
        sum1+=numbers[i][j];
        }
        }
        for(int i=0; i<N; i++){
        for(int j=N-i-1; j>N-i-2; j--){
        sum2+=numbers[i][j];
        
        }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
