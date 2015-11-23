/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mrpippospizza;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Mrpippospizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       HashMap<BigInteger,Integer>hm=new HashMap<BigInteger,Integer>();
       for(int i=1; i<520; i++){
       BigInteger first=factorial(2*i);
       BigInteger second=factorial(i);
       BigInteger third=second.multiply(new BigInteger(""+(i+1)));
       BigInteger ans=first.divide(second.multiply(third));
       hm.put(ans, i+2);
       }
       while(sc.hasNextLine()){
       String value=sc.next();
       System.out.println(hm.get(new BigInteger(value)));
       } 
       }
    
    public static BigInteger factorial(long n){
    BigInteger calc=BigInteger.ONE;
    for(long i=n; i>0; i--){
    calc=calc.multiply(new BigInteger(""+i));
    }
    return calc;
    }
}
