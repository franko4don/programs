/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hexatodecimal;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Hexatodecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
    calc();
    }
    public static int count(int n){
    int a[]=new int[n];
    int b[]=new int[n];
    a[0]=b[0]=1;
    for(int i=1; i<n; i++){
    a[i]=a[i-1]+b[i-1];
    b[i]=a[i-1];
    System.out.println(a[i]+"  "+b[i]);
    }
     return a[n-1]+b[n-1];
    }
    
    public static void calc(){
    String temp[]=new String[]{"1","1 1","1 2 1","1 3 3 1","1 4 6 4 1"};
    int length=temp[temp.length-1].length();
    for(int i=0; i<temp.length; i++){
    int len=length-temp[i].length();
    len/=2;
    System.out.println(repeat(" ",len)+temp[i]+repeat(" ",len));
    }
   
}
    
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
