/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dancinpairs;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Dancinpairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        long []boys=new long[N];
        long []girls=new long[N];
        for(int i=0; i<N; i++){
        boys[i]=sc.nextLong();
        }
        for(int i=0; i<N; i++){
        girls[i]=sc.nextLong();
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        int pairs=0;  
        int limit=N-1;
        for(int j=N-1; j>=0; j--){
        for(int k=limit; k>=0; k--){
        long check=Math.abs(boys[j]-girls[k]);
        if(check<=K){
        pairs++;
        limit=k-1;
        break;
        }
        }
        }
        System.out.println(pairs);
    }
}
