/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findhackerrank;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Findhackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<=N; i++){
        String input=sc.nextLine().trim();
        String check[]=input.split(" ");
        if(check.length>1){
        if(check[0].equals("hackerrank")){
        System.out.println(1);
        }
        if(check[check.length-1].equals("hackerrank")){
        System.out.println(2);
        }
        if(!check[0].equals("hackerrank")&&!check[check.length-1].equals("hackerrank")){
        System.out.println(-1);
        }
        }else{
        if(check[0].equals("hackerrank")){
        System.out.println(0);
        }
        }
        }
    }
}
