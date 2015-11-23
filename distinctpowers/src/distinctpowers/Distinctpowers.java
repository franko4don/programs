/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distinctpowers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Distinctpowers {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=2; i<=N; i++){
        StringBuilder sb=new StringBuilder();
        for(int j=2; j<=N; j++){
        long ans=(long)Math.pow(i, j);
         sb.append(ans).append(" ");
        }
        System.out.println(sb);
        }
    
        
   }
}
