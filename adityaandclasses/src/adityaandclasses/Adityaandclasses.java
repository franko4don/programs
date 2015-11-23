/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adityaandclasses;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Adityaandclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     String A=sc.next().toLowerCase();
        String B=sc.next().toLowerCase();
        char first[]=A.toCharArray();
        char[]second=B.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        String temp1=String.valueOf(first);
        String temp2=String.valueOf(second);
        if(temp1.equals(temp2)){
        System.out.println("Anagrams");
        }else{
        System.out.println("Not Anagrams");
        }
    }
}
