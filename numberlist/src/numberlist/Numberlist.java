/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlist;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Numberlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       int prt=N;
       int add=N;
       int K=sc.nextInt();
       int count=0;
       for(int j=0; j<N; j++){
       int temp=sc.nextInt();
       if(temp-K>0){
       count++;
       }
       }
       for(int l=1; l<count; l++){
       add-=l;
       prt+=add;
       }
       System.out.println(prt);
       }
    }
}
