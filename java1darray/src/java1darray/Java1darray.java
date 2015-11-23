/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java1darray;
import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
/**
 *
 * @author FRANKCHUKY
 */
public class Java1darray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int number[]=new int[N];
      int add=0;
      int count=0;
      for(int i=0; i<N; i++){
      number[i]=sc.nextInt();
      add+=number[i];
      }
      if(add<0){
      count++;
      }
      for(int i=1; i<N; i++){
      for(int j=0; j<N-i+1; j++){
      int temp[]=Arrays.copyOfRange(number, j, j+i);
      int sum=0;
      for(int k=0; k<temp.length; k++){
      sum+=temp[k];
      }
      if(sum<0){
      count++;
      
       }
      }
      }
      System.out.println(count);
    }
    }
