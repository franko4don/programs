/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10001stprime;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author FRANKCHUKY
 */
public class Main {

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
       v.addElement(0);
       v.addElement(2);
       for(int i=3; i<=120000; i+=2){
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
       System.out.println(v.size());
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();      
       System.out.println(v.elementAt(N));
       }
    }
}
