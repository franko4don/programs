/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikbalsarrays;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ikbalsarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long number1[]=new long[N];
        long number2[]=new long[N];
        int Q=sc.nextInt();
        for(int i=0; i<Q; i++){
        int check=sc.nextInt();
        if(check==1){
        int l=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int j=l-1; j<r; j++){
        number1[j]+=c;
        }
        }
        
        if(check==2){
        int l=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int j=l-1; j<r; j++){
        number2[j]+=c;
        }
        }
        
        if(check==3){
        int l=sc.nextInt();
        int r=sc.nextInt();
        long ans=0;
        for(int j=l-1; j<r; j++){
        ans+=((number1[j]*number2[j])%1000000007);
        ans%=1000000007;
        }
        System.out.println(ans);
        }
        
        }
    }
}
