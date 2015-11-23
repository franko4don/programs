/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eucleadianalgorithm;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Eucleadianalgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(gcd(17,43));
    }
    
    public static long gcd(long x, long y){
    long mod;
    long ans=0;
    long temp=0;
    if(y>x){
    temp=y;
    y=x;
    mod=x;
    }else{
    temp=x;
    mod=Long.MIN_VALUE;
    }
    
    while(mod!=0){
    ans=mod;
    mod=temp%y;
    temp=y;
    y=mod;    
    }
    return ans;
    }
}
