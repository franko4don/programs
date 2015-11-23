/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pairs;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       long K=sc.nextLong();
       long []pairs=new long[N];
       for(int i=0; i<N; i++){
       pairs[i]=sc.nextLong();
       }
       Arrays.sort(pairs);
       int count=0;
       for(int j=0; j<N; j++){
       for(int k=0; k<N; k++){
       if(k==j){
       continue;
       }
       long ans=pairs[j]-pairs[k];
       if(ans<0){
       break;
       }
       if(ans==K){
       count++;
       break;
       }
       }
       }
       System.out.println(count);
    }
}
