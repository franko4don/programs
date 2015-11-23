/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antipalindromicstring;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Antipalindromicstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       Vector v=new Vector();
      for(int i=0; i<T; i++){
      long N=sc.nextLong();
      long M=sc.nextLong();   
      if(N==1){
      double compute=M%(Math.pow(10,9)+7);
      v.addElement((long)compute);
      continue;
      }
      if(N==2){
      long compute=M*(M-1);
      double main=compute%(Math.pow(10,9)+7);
      v.addElement((long)main);
      continue;
      }
      if(N>=3){
      double compute=M*(M-1)*(Math.pow(M-2,N-2));
      long ans=(long)compute;
      double main=ans%(Math.pow(10,9)+7);
      v.addElement((long)main);
      }
       }
      for(int j=0; j<v.size(); j++){
       System.out.println(v.elementAt(j));
      }
    }
}
