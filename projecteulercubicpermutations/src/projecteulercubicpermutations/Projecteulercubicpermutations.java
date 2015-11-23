/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulercubicpermutations;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Projecteulercubicpermutations {
static int y;
static HashSet hs=new HashSet();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        double N=sc.nextDouble();
        double K=sc.nextDouble();
        double main=Math.pow(N-1, K);
        String input=Long.toString((long)main);
        permutation("",input);
        System.out.println(hs);
    }
    private static void permutation(String prefix,String str){
    int n=str.length();
    if(n==0){
    double number=Math.cbrt(Integer.parseInt(prefix));
    if(number%1==0){
    hs.add((long)number);
    }
    }else{
    for(int i=0; i<n; i++){
    permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
   
    }
    }
    }
}
