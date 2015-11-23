/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twistytuple;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Twistytuple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int count=0;
       int numbers[]=new int[N];
       for(int i=0; i<N; i++){
       numbers[i]=sc.nextInt();
       }
       for(int i=0; i<N; i++){
       for(int j=0; j<N; j++){
       for(int k=0; k<N; k++){
       if(i<j&&j<k&&numbers[k]<numbers[i]&&numbers[i]<numbers[j]){
       count++;
       }
       }
       }
       }
       System.out.println(count);
    }
}
