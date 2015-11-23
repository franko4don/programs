/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bagsofapples;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Bagsofapples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N[]=new int[M];
        int sum=0;
        for(int i=0; i<N.length; i++){
        N[i]=sc.nextInt();
        sum+=N[i];
        }
        Arrays.sort(N);
        if(sum%3==0){
        System.out.println(sum);
        }else{
        int check=0;
        for(int i=0; i<N.length; i++){
        for(int j=0; j<N.length-i; j++){
        int array[]=Arrays.copyOfRange(N, j, j+i+1);
       // System.out.println(Arrays.toString(array));
        int value=addup(array);
        if((sum-value)%3==0){
        if((sum-value)>check){
        check=sum-value;
        }
        }
        
        }
        }
        System.out.println(check);
        }
        }
    public static int addup(int[] number){
    int size=0;
    for(int i=0; i<number.length; i++){
    size+=number[i];
    }
    return size;
    }
}
