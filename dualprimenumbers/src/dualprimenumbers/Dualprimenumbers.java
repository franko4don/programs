/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dualprimenumbers;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Dualprimenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
       BigInteger start=new BigInteger("10");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       hm.put(2,2);
       for(int i=3; i<=1000000; i+=2){
       int remove=i;
       if(remove==3||remove==5||remove==7){
       v.addElement(remove);
       hm.put(remove, remove);
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.size(); y++){
       if(divisors.elementAt(y)>(int)Math.sqrt(i)){
       break;
       }
       if(remove%divisors.elementAt(y)==0&&remove!=divisors.elementAt(y)){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       v.addElement(remove);
       hm.put(remove, remove);
       }
       HashMap <Integer,Integer>answer=new HashMap<Integer,Integer>();
       for(int i=0; i<v.size(); i++){
       String get=Integer.toString(v.elementAt(i));
       int number=0;
       for(int j=0; j<get.length(); j++){
       number+=Character.getNumericValue(get.charAt(j));
       }
       if(hm.containsKey(number)){
       answer.put(v.elementAt(i),v.elementAt(i));
       }
       }
       int T=sc.nextInt();
       for(int k=0; k<T; k++){
       int begin=sc.nextInt();
       int end=sc.nextInt();
       int count=0;
       for(int j=begin; j<=end; j++){
       if(answer.containsKey(j)){
       count++;
       }
       }
       System.out.println(count);
       }
       
    }
}
