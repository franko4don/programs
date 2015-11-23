/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranktweets;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Hackerranktweets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int i=0; i<=N; i++){
        String input=sc.nextLine().toLowerCase();
        if(input.contains("hackerrank")){
        count++;
        }
        }
        System.out.println(count);
    }
}
