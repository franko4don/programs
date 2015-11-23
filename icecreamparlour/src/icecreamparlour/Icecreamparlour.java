/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamparlour;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Icecreamparlour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int k=1;
        int l=1;
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[]values=new int[N+1];
        values[0]=0;
        for(int j=1; j<N+1; j++){
        values[j]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(values));
        for(k=1; k<N; k++){
        for(l=1; l<N; l++){
        if(k==l){
        continue;
        }
        if(values[k]+values[l]==M){
        break;
        }
        }
        if(values[k]+values[l]==M){
        break;
        }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(k+" "+l);
        System.out.println(sb);
        }
    }
}
