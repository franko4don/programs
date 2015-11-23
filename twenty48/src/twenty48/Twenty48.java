/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twenty48;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Twenty48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int coins[]=new int[16];
       long number[]=new long[100001];
       Arrays.fill(number, 1);
       for(int i=0; i<coins.length; i++){
       coins[i]=(int)Math.pow(2, i);
       }
       
       for(int i=1; i<coins.length; i++){
       for(int j=coins[i]; j<number.length; j++){       
       number[j]=number[j]+number[j-coins[i]];
       number[j]%=1000000007;
       }
       }
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();      
       System.out.println(number[N]);
       }
    }
}
