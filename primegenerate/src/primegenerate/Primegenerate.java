/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegenerate;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Primegenerate {

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
       if(start.intValue()>317){
       break;
       }
       divisors.addElement(start.intValue());
      // System.out.println(divisors);
       }
       System.out.println(divisors);
       for(int i=2; i<=1000000; i++){
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
      System.out.println(divisors.size());
       
      
}
}
