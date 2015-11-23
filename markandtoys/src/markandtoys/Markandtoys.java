/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package markandtoys;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Markandtoys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        long []values=new long[N];
        for(int i=0; i<N; i++){
        values[i]=sc.nextInt();
        }
        Arrays.sort(values);
        int sum=0;
        int count=0;
        for(int j=0; j<N; j++){
        sum+=values[j];
        if(sum<K){
        count++;
        }
        if(sum>K){
        break;
        }
        }
        System.out.println(count);
    }
}
