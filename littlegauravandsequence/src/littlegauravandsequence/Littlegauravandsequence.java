/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package littlegauravandsequence;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Littlegauravandsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long n=sc.nextLong();
        long check=0;
        for(int j=0; j<65432; j++){
        long value=(long)Math.pow(2,j);
        if(value>n){
        break;
        }
        check=value;
        }
        long ans=0;
        for(int k=0; k<check; k++){
        long first=(long)Math.pow(2,k%10)%10;
        long second=(2*k)%10;
        long full=(long)Math.pow(2,(second+first)%10)%10;
        ans+=full;
        }
        System.out.println(ans);
        }
    }
}
