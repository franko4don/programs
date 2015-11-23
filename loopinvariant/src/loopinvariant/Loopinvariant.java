/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loopinvariant;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Loopinvariant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int numbers[]=new int[N];
       for(int i=0; i<N; i++){
       numbers[i]=sc.nextInt();
       }
       Arrays.sort(numbers);
       StringBuilder sb=new StringBuilder();
       for(int j=0; j<N; j++){
       sb.append(numbers[j]+" ");
       }
       System.out.println(sb.toString().trim());
    }
}
