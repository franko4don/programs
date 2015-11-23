/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package angrychildren;
import java.util.*;
import java.math.*;

public class Angrychildren {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt(); //number of packets of candies
     int k=sc.nextInt(); //number of children
     int values[]=new int[N];
     int compare=999999999;
     for(int i=0; i<N; i++){
     int candy=sc.nextInt(); //fills in number of candies in each packet
     values[i]=candy;
     }
     Arrays.sort(values); //sorts the array from smallest to biggest
     for(int j=0; j<N-k; j++){
     int h=values[j+k-1]-values[j];
     if(h<compare){
     compare=h;
     }
     }
     System.out.println(compare);
    }
}
