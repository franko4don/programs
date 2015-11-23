/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convergenceofe;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Convergenceofe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    BigInteger numerator=new BigInteger("2");
    BigInteger denominator=BigInteger.ONE;
    HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
    int N=sc.nextInt();
    for(int i=2; i<=N; i++){
    BigInteger temp=denominator;
    int condition=(i%3==0)?2*(i/3): 1;
    denominator=numerator;
    numerator=new BigInteger(Integer.toString(condition)).multiply(denominator).add(temp);
    }
    int add=0;
    for(int j=0; j<numerator.toString().length(); j++){
    add+=Character.getNumericValue(numerator.toString().charAt(j));
    }
    System.out.println(add);
    }
}
