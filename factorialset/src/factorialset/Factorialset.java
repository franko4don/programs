/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialset;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Factorialset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("0");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       for(int i=3; i<=1500000; i+=2){
       int remove=i;
       if(remove==3||remove==5||remove==7){
       v.addElement(remove);
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.size(); y++){
       if(remove%divisors.elementAt(y)==0&&remove!=divisors.elementAt(y)){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       v.addElement(remove);
       }
   //  System.out.println(v.size());
       //program starts here
       int N=sc.nextInt();
      long number[]=new long[N];
      for(int i=0; i<N; i++){
      long first=sc.nextLong();
      long length=0; 
      int p=0;
      long prime=v.elementAt(p);
      while(prime<=first){
      prime=v.elementAt(p);
      int inc=1;
      long temp=prime;    
      while(temp<=first){
      temp=(long)Math.pow(prime, inc);
     length+=(first/temp);
      inc++;
     // System.out.println(temp);
      }
      p++;
      }
      number[i]=length;
      }
     System.out.println(subset(number));
      
    }
    public static long subset(long array[]){
    long add=0;
    for(int i=0; i<array.length; i++){
    for(int j=0; j<array.length-i; j++){
    long sumup[]=Arrays.copyOfRange(array, j, j+i+1);
  //  System.out.println(Arrays.toString(sumup));
    long addit=addvalues(sumup);
    if(addit%2==0){
    add+=addit;
    }
   // System.out.println(add);
    }
    }
    return add;
    }
    public static long addvalues(long indexsum[]){
    long temp=0;
    for(int i=0; i<indexsum.length; i++){
    temp+=indexsum[i];
    }
    return temp;
    }
}
