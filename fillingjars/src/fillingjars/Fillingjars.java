/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fillingjars;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fillingjars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long sum=0;
       long N=sc.nextLong(); 
       int M=sc.nextInt();
       for(int i=0; i<M; i++){
       long values[]=new long[3];
       for(int j=0; j<3; j++){
       int h=sc.nextInt();
       values[j]=h;
       }
       long ans=((values[1]-values[0])+1)*values[2];
       sum+=ans;
       }
      System.out.println(sum/N);
    }
}
