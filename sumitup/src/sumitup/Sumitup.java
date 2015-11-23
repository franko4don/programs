/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumitup;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sumitup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long h=0;
        int N=sc.nextInt();
        long []files=new long[N];
        long []ans=null;
        for(int i=0; i<N; i++){
        files[i]=sc.nextLong();
        }
        int Q=sc.nextInt();
        int []Query=new int[Q];
        for(int j=0; j<Q; j++){
        Query[j]=sc.nextInt();
        }
        for(int e=0; e<Q; e++){
            
            int comp=Query[e];
        for(int k=0; k<N; k++){
        if(k-comp<0){
        ans[k]=files[N-comp]+files[k];
        continue;
       }
        ans[k]=files[k]+files[k-comp];
             } 
        files=Arrays.copyOf(ans,N);
            }
           for(int d=0; d<files.length; d++){
               if(Q==0)break;
           h+=ans[d];
           }
           double answers=h%((Math.pow(10,9))+7);
           long solution=(int)answers;
           System.out.println(solution);
    }
}
