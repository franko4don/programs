/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String temp=br.readLine();
    String get[]=temp.split(" ");
    int N=Integer.parseInt(get[0]);
    int K=Integer.parseInt(get[1]);
    int M=Integer.parseInt(get[2]);
    String temp1=br.readLine();
    String get1[]=temp1.split(" ");
    long values[]=new long[N];
   // for(int i=0; i<N; i++){
   // values[i]=Long.parseLong(get1[i]);
  //  }
    System.out.println(get1.length);
    }
}
