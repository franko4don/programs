/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblenumbers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Divisiblenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        int count=0;
        for(int j=0; j<100; j++){
        long ans=(long)Math.pow(2, j);
        if(ans>N)break;
        if(N%ans==0){
        count++;
        }
        }
         System.out.println(count);
        
        }
    }
}
