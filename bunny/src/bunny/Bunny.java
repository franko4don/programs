/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bunny;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Bunny {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner sc=new Scanner(System.in);
 int h=1; int N; 
 int T=sc.nextInt();
 int[]test=new int[T]; int[]answers=new int[T];
 for(int i=0; i<T; i++){
  N=sc.nextInt(); test[i]=N;
  for(int j=0; j<N; j++){
      if(N==0){
      System.out.println(h);}
      else{
      if(j%2==0){
      h=h*2;
      }
      else{
      h=h+1;
      }
      }  
  }
  answers[i]=h;
  h=1;
}
 for(int l=0; l<answers.length; l++){
 System.out.println(answers[l]);
    }
}
}