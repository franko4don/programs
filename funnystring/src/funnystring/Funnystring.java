/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funnystring;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Funnystring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        String input=sc.next();
        StringBuilder sb=new StringBuilder().append(input);
        String reverse=sb.reverse().toString();
        int count=0;
        for(int j=0; j<input.length()-1; j++){
        int first=Math.abs(input.charAt(j)-input.charAt(j+1));
        int second=Math.abs(reverse.charAt(j)-reverse.charAt(j+1));
        if(first==second){
        count++;
        }
        }
        if(count==reverse.length()-1){
        System.out.println("Funny");
        }else{
        System.out.println("Not Funny");
        }
        }
    }
}
