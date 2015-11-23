/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package totientmaximum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Totientmaximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("10");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1416){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       for(int i=3; i<=2005056; i+=2){
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
       int T=sc.nextInt();
       
       for(int i=0; i<T; i++){
       long N=sc.nextLong();
       Vector temp=new Vector();
       long answer=1;
       for(int j=0; j<10000000; j++){
       
       if(answer*v.elementAt(j)>=N||answer<0){
       break;
       }
       temp.addElement(answer);
       answer*=v.elementAt(j);
       }
       if(answer<0){
       System.out.println(temp.elementAt(temp.size()-1));
       }else{
       System.out.println(answer);
       }
       }
    }
}
