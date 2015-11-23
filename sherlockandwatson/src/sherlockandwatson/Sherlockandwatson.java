/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandwatson;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandwatson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int Q=sc.nextInt();
        int number[]=new int[N];
        int answer[]=new int[N];
        for(int i=0; i<N; i++){
        number[i]=sc.nextInt();
        }
        for(int j=0; j<N; j++){
        int index=(j+K)%N;
        answer[index]=number[j];
        }
        for(int k=0; k<Q; k++){
        int query=sc.nextInt();
        System.out.println(answer[query]);
        }
    }
}
