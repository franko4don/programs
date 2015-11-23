/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countluck;

import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Countluck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
      for(int i=0; i<T; i++){
      int N=sc.nextInt();
      int M=sc.nextInt();
      String str[]=new String[N];
      StringBuilder sb=new StringBuilder();
      char main[][]=new char[N][M];
      for(int j=0; j<N; j++){
      String first=sc.next();
      for(int l=0; l<M; l++){
      main[j][l]=first.charAt(l);
      }
      sb.append(first.substring(0,M)).append("\n");
      }
      int m=0; int n=0;
      for(m=0; m<N; m++){
      for(n=0; n<M; n++){
     if(main[m][n]=='M'){
       System.out.println("starting"+"("+m+","+n+")");
     }
     if(main[m][n]=='*'){
     System.out.println("exit"+"("+m+","+n+")");
     }
      }
      }
      
      //System.out.println(Arrays.deepToString(main));
      int K=sc.nextInt();
      int index=sb.indexOf("M");
     // System.out.println("");
      
    }
      
 }
}
