/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pandigitalprime;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.math.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Pandigitalprime {
    static Vector <Integer> v;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       v=new Vector<Integer>();
       String four="1234";
       permutation("",four);
       String seven="1234567";
       permutation("",seven);
       //System.out.println(v);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       if(N>7652413){
       System.out.println(7652413);
       continue;
       }
       if(N<1423){
       System.out.println(-1);
       continue;
       }
       for(int j=0; j<v.size(); j++){
       if(v.elementAt(j)==N){
       System.out.println(v.elementAt(j));
       break;
       }
       if(v.elementAt(j)>N){
       System.out.println(v.elementAt(j-1));
       break;
       }
       }
       }
    }
    private static void permutation(String prefix,String str){
    int n=str.length();
    if(n==0){
    BigInteger b=new BigInteger(prefix);
    if(b.isProbablePrime(12)){
    v.addElement(Integer.parseInt(prefix)); 
    }
    }else{
    for(int i=0; i<n; i++){
    permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
   
    }
    }
    }
}
