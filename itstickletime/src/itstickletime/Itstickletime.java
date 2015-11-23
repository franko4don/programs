/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itstickletime;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Itstickletime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     
     int times=1;
     HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
     HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
     for(int i=1; i<=11; i++){
     times*=i;
     hm1.put(times, i);
     hm2.put(i, times);
     }
     Vector <Integer>v=primes(hm2.get(N));
     long count=0;
     for(int i=0; i<v.size(); i++){
     for(int j=0; j<v.elementAt(i); j++){
     if(j%v.elementAt(i)!=0&&hm1.containsKey(j*v.elementAt(i))){
     count++;
     }
     if(j*v.elementAt(i)>hm2.get(N)){
     break;
     }
     }
     if(v.elementAt(i)>hm2.get(N)){
     break;
     }
     }
     
     for(int i=1; i<100000; i++){
     for(int j=0; j<v.size(); j++){
     if(i==1&&hm1.containsKey( i*v.elementAt(j))){
     count++;
     }
     if(i>1&&hm1.containsKey(i*v.elementAt(j))&&v.elementAt(j)%i!=0){
    count++;
     }
     if(i*v.elementAt(j)>hm2.get(N)){
     break;
     }
     }
     
     if(i>hm2.get(N)){
     break;
     }
     }
   //  System.out.println(hm);
     
     System.out.println(count);
     
    }
    public static Vector<Integer>primes(int N){
     Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("0");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1414){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       for(int i=3; i<=N; i+=2){
       int remove=i;
       if(remove==2||remove==3||remove==5||remove==7){
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
       return v;
}
}