/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package andproduct;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Andproduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap hm=new HashMap();
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long A=sc.nextLong();
        long B=sc.nextLong();
        long and=A;
        for(long j=A; j<=B-1; j++){
        and&=j;
        }
        System.out.println(and);
        
        }
    }
}
