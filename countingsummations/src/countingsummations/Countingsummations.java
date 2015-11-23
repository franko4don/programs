/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsummations;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingsummations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long ways[]=new long[1001];
        Arrays.fill(ways, 1);
        for(int i=2; i<ways.length; i++){
        for(int j=i; j<ways.length; j++){
        ways[j]=ways[j]+ways[j-i];
        ways[j]%=1000000007;
        }
        }
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        System.out.println(ways[N]-1);
        }
        
    }
}
