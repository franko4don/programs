/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicographicpermutations;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lexicographicpermutations {
static long count;
static Vector v=new Vector();
static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        permutation("","abcdefghijklm");
        
    }
    private static void permutation(String prefix,String str){
    int n=str.length();
    if(n==0){
    System.out.println(prefix);
    }else{
    for(int i=0; i<n; i++){
    permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
    }
    }
    }
   
}
