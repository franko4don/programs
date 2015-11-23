/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumpathsum;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Maximumpathsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int sum=0;
       int N=sc.nextInt();
       int values[][]=new int[N][N];
       for(int j=0; j<N; j++){
       for(int k=0; k<j+1; k++){
       values[j][k]=sc.nextInt();
       }
       }
       int temp=0;
       int p=0;
       for(int m=values.length-1; m>0; m--){
       for(int n=0; n<values[m].length-1; n++){
       values[m-1][n]+=Math.max(values[m][n],values[m][n+1]);
       
       }
       }
       System.out.println(values[0][0]);
       }     
    }
}
