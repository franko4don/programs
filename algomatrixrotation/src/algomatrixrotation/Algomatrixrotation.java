/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algomatrixrotation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Algomatrixrotation {

    /**
     * @param args the command line arguments
     * a program that rotates matrix for R number of times
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      int M=sc.nextInt();
      int N=sc.nextInt();
      int R=sc.nextInt();
      int number[][]=new int[M][N];
      for(int i=0; i<M; i++){
      for(int j=0; j<N; j++){
      number[i][j]=sc.nextInt();
      }
      }
      int temp[][]=new int[M][N];
      int times=Math.min(M, N)/2;
      for(int k=0; k<times; k++){
      Vector <Integer>row=new Vector<Integer>();
      Vector <Integer>column=new Vector<Integer>();     
      for(int i=k; i<M-k; i++){     
      row.addElement(i);
      column.addElement(k);
      }
      for(int i=1+k; i<N-k; i++){     
      row.addElement(M-1-k);
      column.addElement(i);
      }
      for(int i=M-2-k; i>=0+k; i--){     
      row.addElement(i);
      column.addElement(N-1-k);
      }
      
      for(int i=N-2-k; i>k; i--){     
      row.addElement(k);
      column.addElement(i);
      }
      for(int start=0; start<row.size(); start++){
      int get=(start+R)%row.size();
      int value1=number[row.elementAt(start)][column.elementAt(start)];
      temp[row.elementAt(get)][column.elementAt(get)]=value1;
      }
      
      }
      for(int p=0; p<M; p++){
      String ans="";
      for(int q=0; q<N; q++){
      ans+=temp[p][q]+" ";
      }
      System.out.println(ans.trim());
      }
    }
}
