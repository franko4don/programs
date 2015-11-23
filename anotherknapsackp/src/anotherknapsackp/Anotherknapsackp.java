/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anotherknapsackp;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Anotherknapsackp {
    
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       long range=sc.nextLong();
       long a=1;
       long b=n;
       long c1=0;
       long d1=1;
       for(long q=range; q>1; q--) {
       long check=(q*a)-1;
       long value=find(b,check,q-1);
       if(check==value*b){
       System.out.println(value+" "+q);
       d1=q;
       c1=value;
       break;
       }
       }
       
       int num=0;
       while(!(c1==1&&d1==n+1)){
       long k=(range+b)/d1;
       long e=k*c1-a;
       long f=k*d1-b;
       a=c1;
       b=d1;
       c1=e;
       d1=f;
       num++;
       }
       System.out.println(num);
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
       
    

