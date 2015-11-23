/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chiefchoper;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Chiefchoper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int values[]=new int[N];
       for(int i=0; i<N; i++){
       values[i]=sc.nextInt();
       }
       int count=0;
       for(int j=N-1; j>=1; j--){
       if(values[j-1]>=values[j]/2){
       count=values[j];
       }
       
       }
       System.out.println(count);
    }
}
