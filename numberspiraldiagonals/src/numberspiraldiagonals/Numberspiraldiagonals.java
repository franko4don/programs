/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberspiraldiagonals;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Numberspiraldiagonals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong()%1000000007;
        long get=(N/2);
        long mod=1000000007;
        long insert=get%mod;
        double first=((16.0/3)*(((insert)*(insert)%mod)*(insert)%mod))%mod;
        double second=(10.0*((insert)*(insert)%mod))%mod;
        double third=((26.0/3)*(insert))%mod;
        double fourth=1;
        double ans=first+second+third+fourth;
        System.out.println(Math.round(ans*100)/100);
        }
    }
}
