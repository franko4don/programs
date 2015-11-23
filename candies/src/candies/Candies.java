/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package candies;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Candies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=N;
        int number[]=new int[N];
        for(int i=0; i<N; i++){
        number[i]=sc.nextInt();
        }
        Arrays.sort(number);
        for(int j=0; j<number.length-1; j++){
        if(number[j+1]>number[j]){
        sum++;
        }
        }
        System.out.println(sum);
    }
}
