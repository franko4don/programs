/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofrotation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Gameofrotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long sum=0;
        long number[]=new long[N];
        for(int i=0; i<N; i++){
        number[i]=sc.nextLong();
        }
        Arrays.sort(number);
        for(int j=0; j<number.length; j++){
        sum+=(j+1)*number[j];
        }
        System.out.println(sum);
    }
}
