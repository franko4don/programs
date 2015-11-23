/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primepersets;

import java.math.BigInteger;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Primepersets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("10");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>141){
       break;
       }
       divisors.addElement(start.intValue());
       }
       for(int i=2; i<=20000; i++){
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
       System.out.println(v);
    }
}
