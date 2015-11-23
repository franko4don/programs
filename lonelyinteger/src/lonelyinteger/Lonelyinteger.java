/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lonelyinteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lonelyinteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int count=0;
       Vector v=new Vector();
       int values[]=new int[N];
       int numbers[]=new int[101];
       for(int i=0; i<N; i++){
       values[i]=sc.nextInt();
       }
       for(int j=0; j<101; j++){
       numbers[j]=j;
       }
       for(int k=0; k<101; k++){
       for(int y=0; y<N; y++){
       if(numbers[k]==values[y]){
       count++;
       }
       }
       if(count==1){
       v.addElement(k);
       }
       count=0;
       }
       System.out.println(v.elementAt(0));
    }
    
}
