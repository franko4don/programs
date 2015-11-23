/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitcancellingfractions;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Digitcancellingfractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       // int K=sc.nextInt();
        int count=0;
        int numbers[]=null;
       if(N==2){
       numbers=new int[90]; 
       for(int i=10; i<100; i++){
       numbers[i-10]=i;
       }
        }
       if(N==3){
       numbers=new int[990]; 
       for(int i=10; i<1000; i++){
       numbers[i-10]=i;
       }
        }
       if(N==4){
       numbers=new int[9990]; 
       for(int i=10; i<10000; i++){
       numbers[i-10]=i;
       }
        }
       for(int j=0; j<4*49994955; j++){
       count++;
       }
       System.out.println(count);
    }
}
