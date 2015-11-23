/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltofraction;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Decimaltofraction {

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
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
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
       double fraction=sc.nextDouble();
       int numerator=0;
       String length=Double.toString(fraction);
       int limit=0;
       for(int i=0; i<length.length(); i++){
       if(length.charAt(i)=='.'){
       limit=i;
       numerator=Integer.parseInt(length.substring(i+1));
       break;
       }
       }
       int whole=(int)fraction;
       String deno=1+repeat("0",Integer.toString(numerator).length());
       int denominator=Integer.parseInt(deno);
       String ans="";
       for(int j=0; j<v.size(); j++){
       if(v.elementAt(j)>numerator){
       ans=Integer.toString(numerator)+"/"+Integer.toString(denominator);
       break;
       }
       while(numerator%v.elementAt(j)==0&&denominator%v.elementAt(j)==0){
       numerator/=v.elementAt(j);
       denominator/=v.elementAt(j);
       }
       }
       
       if(whole>0){
       int top=(denominator*whole)+numerator;
       String get=Integer.toString(top)+"/"+Integer.toString(denominator);
       System.out.println(get);
       }else{
       System.out.println(ans);
    }
    }
     public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
