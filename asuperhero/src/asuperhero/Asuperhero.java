/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asuperhero;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Asuperhero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       int M=sc.nextInt();
       int B[][]=new int[M+N][M];
       for(int j=0; j<N+M; j++){
       B[j][0]=sc.nextInt();
       B[j][1]=sc.nextInt();
       B[j][2]=sc.nextInt();
       }  
       
       System.out.println(Arrays.deepToString(B));
       }
    }
}
