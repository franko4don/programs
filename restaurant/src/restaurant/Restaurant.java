/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int l=sc.nextInt();
        int b=sc.nextInt();
        int test;
        if(l<b){
        test=l;
        }else{
        test=b;
        }
        int gcd=0;
        for(int j=test; j>=0; j--){
        if(l%j==0&&b%j==0){
        gcd=j;
        break;
        }
        }
        int answer=(l/gcd)*(b/gcd);
        System.out.println(answer);
        }
    }
}
