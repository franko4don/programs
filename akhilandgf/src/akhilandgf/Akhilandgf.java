/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilandgf;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Akhilandgf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       long N=sc.nextLong();
       long M=sc.nextLong();
       long mod=N%M;      
       String print=repeat("1",(int)mod);
       BigInteger get=new BigInteger(print);
       BigInteger module=new BigInteger(Long.toString(mod));
       System.out.println(get.mod(module));
       }
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
