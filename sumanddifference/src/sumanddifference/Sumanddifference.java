/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumanddifference;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Sumanddifference {

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
       for(int i=3; i<=1000000; i+=2){
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
       int L=sc.nextInt();
       int R=sc.nextInt();
       long S=0;
       long P=0;
       Vector<Integer>v1=new Vector<Integer>();
       for(int i=1; i<=1000; i++){
       v1.addElement(i*i);
       }
       for(int j=0; j<v.size(); j++){
       if(v.elementAt(j)>R)break;
       if(v.elementAt(j)>=L){
       S+=v.elementAt(j);
       }
       }
       
       for(int j=0; j<v1.size(); j++){
       if(v1.elementAt(j)>R)break;
       if(v1.elementAt(j)>=L){
       P+=v1.elementAt(j);
       }
       }
       System.out.println(S-P);
    }
}
