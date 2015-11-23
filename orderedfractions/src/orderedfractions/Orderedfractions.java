/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orderedfractions;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Orderedfractions {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long a =sc.nextLong();
        long b =sc.nextLong();
        long r = 0;
        long s = 1;
        long limit =sc.nextLong();
 
        for(long q=limit; q>1; q--) {
        long check=(q*a)-1;
        long value=find(b,check,q-1);
        if(check==value*b){
        System.out.println(value+" "+q);
        break;
        }
    
}
  
    }
   }
    public static long find(long b,long key,long check){
    long start=0;
    long temp;
    long end=check;
    boolean found=true;
    while(found){
    if(b*end>key){
  //  System.out.println(array[end]+" is greater than "+key);
    start=end;
    end/=2;
    
    }else{
    if(b*end==key){
   // System.out.println("Number found at "+end);
    
    return end;
    }
    if(b*end<key){
  //  System.out.println(array[end]+" is less than "+key);
    temp=end;
    end=(end+start)/2;
    if(temp==end){
    return -1;
    }
    
    }
    }
    if(end==0&&found==true){
   // System.out.println(key+" does not exist");
    break;
    }
    }
    return 1;
    }
}
