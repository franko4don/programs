/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rahulandtotaldirtiness;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Rahulandtotaldirtiness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int numbers[]=new int[N];
        for(int i=0; i<N; i++){
        numbers[i]=sc.nextInt();
        }
        long sum=0;
        int Q=sc.nextInt();
         for(int j=0; j<Q; j++){
         int O=sc.nextInt();
         int L=sc.nextInt()-1;
         int R=sc.nextInt()-1;
         for(int m=L; m<=R; m++){
         if(O==0){
         if(numbers[m]%2==0){
         numbers[m]/=2;
         }else{
         numbers[m]=3*numbers[m]+1;
         }
         }else{
         sum+=numbers[m];
         sum%=1000000007;
         }
         }
         }  
         System.out.println(sum);
    }
}
