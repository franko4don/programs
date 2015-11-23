/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thetrigonometricratios;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Thetrigonometricratios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int count=0;
        String store[]=new String[N];
        for(int j=0; j<N; j++){
        String check=sc.next();
        char trans[]=check.toCharArray();
        Arrays.sort(trans);
        String obtained=String.valueOf(trans);
        store[j]=obtained;
        }
        for(int m=0; m<N; m++){
        count++;
        char test1=store[0].charAt(m);
        for(int n=1; n<N; n++){
        char test2=store[n].charAt(m);
        if(test1<=test2){
        count++;
        test1=test2;
        }
        }
        }
        if(count==N*N){
        System.out.println("YES");
        }else{
        System.out.println("NO");
        }
        }
    }
    
}
