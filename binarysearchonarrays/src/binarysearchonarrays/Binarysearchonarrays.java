/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchonarrays;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Binarysearchonarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       long key=sc.nextLong();
       long number[]=new long[5000000];
       for(int i=0; i<number.length; i++){
       number[i]=i*3+34;
       }
       long time1=System.currentTimeMillis();
       find(number,key);
       long time2=System.currentTimeMillis();
       
       long time3=System.currentTimeMillis();
       for(int i=0; i<number.length; i++){
       if(number[i]==key){
       System.out.println("Number found at "+i);
       break;
       }
       if(number[i]>key){
       break;
       }
       }
       long time4=System.currentTimeMillis();
       
       System.out.println("Time taken for the binary search is "+(time2-time1)+" ms");
       System.out.println("Time taken for the linear search is "+(time4-time3)+" ms");
    }
    
    public static int find(long array[],long key){
    int start=0;
    int temp;
    int end=array.length-1;
    boolean found=true;
    while(found){
    if(array[end]>key){
  //  System.out.println(array[end]+" is greater than "+key);
    start=end;
    end/=2;
    
    }else{
    if(array[end]==key){
    System.out.println("Number found at "+end);
    found=false;
    }
    if(array[end]<key){
  //  System.out.println(array[end]+" is less than "+key);
    temp=end;
    end=(end+start)/2;
    if(temp==end){
    System.out.println(key+" does not exist");
    break;
    }
    
    }
    }
    if(end==0&&found==true){
    System.out.println(key+" does not exist");
    break;
    }
    }
    return 1;
    }
}
