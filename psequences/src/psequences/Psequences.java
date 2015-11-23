/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psequences;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Psequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int P=sc.nextInt();
        long count=0;
        for(int i=1; i<=N; i++){
        for(int j=1; j<=N; j++){
        if(i*j<=P){
        count++;
        }
        if(i*j>P){
        break;
        }
        }
        }
        System.out.println(count%1000000007);
    }
}
