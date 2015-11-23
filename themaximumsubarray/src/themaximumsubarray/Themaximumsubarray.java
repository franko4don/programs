/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package themaximumsubarray;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Themaximumsubarray {

    /**
     * finding the largest sum of a sub array using the kaden algorithm
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int array[]=new int[N];
        for(int j=0; j<N; j++){
        array[j]=sc.nextInt();
        }
        System.out.println(submax(array));
        }
    }
    
    static String submax(int a[]){
    int tempSum=0;
    int maxSum=0;
    int contig=0;
    for(int i=0; i<a.length; i++){
    int futureSum=tempSum+a[i];
    if(a[i]>0){
    contig+=a[i];
    }
    if(futureSum>0){
    tempSum=futureSum;
    
    if(tempSum>maxSum){
    maxSum=tempSum;
    }
    }else{
    tempSum=0;
    }
    }
    Arrays.sort(a);
    if(maxSum==0){
    maxSum=a[a.length-1];
    }
    if(contig==0){
    contig=a[a.length-1];
    }
     return ""+maxSum+" "+contig;
    }
}
