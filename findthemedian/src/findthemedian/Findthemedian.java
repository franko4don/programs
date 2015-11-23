/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findthemedian;
import java.util.*;
import java.math.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Findthemedian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int []values=new int[N];
    for(int i=0; i<N; i++){
    values[i]=sc.nextInt();
    }
    Arrays.sort(values);
    int length=N/2;
       System.out.println(values[length]);
    }
}
