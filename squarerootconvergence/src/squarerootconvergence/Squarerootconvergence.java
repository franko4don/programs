/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squarerootconvergence;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Squarerootconvergence {
static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        fractions();
    }
    public static void fractions(){
    BigInteger numerator=BigInteger.ONE;
    BigInteger denominator=new BigInteger("2");
    Vector <BigInteger> first=new Vector<BigInteger>();
    Vector <BigInteger> second=new Vector<BigInteger>();
    first.addElement(denominator);
    second.addElement(numerator);
    first.addElement(numerator);
    second.addElement(denominator);
   for(int i=1; i<=10000; i++){
   BigInteger lcm=second.elementAt(i);
   BigInteger number1=(lcm.divide(second.elementAt(0))).multiply(first.elementAt(0));
   BigInteger number2=first.elementAt(i);
   BigInteger add=number1.add(number2);
   second.addElement(add);
   first.addElement(lcm);
   }
    StringBuilder sb=new StringBuilder();
    int N=sc.nextInt();
    for(int i=1; i<=N; i++){
    BigInteger check1=first.elementAt(i).add(second.elementAt(i));
    BigInteger check2=second.elementAt(i);
    char get1[]=check1.toString().toCharArray();
    char get2[]=check2.toString().toCharArray();
    if(get1.length>get2.length){
    System.out.println(i);
    }
    
    }
    
    }
}
