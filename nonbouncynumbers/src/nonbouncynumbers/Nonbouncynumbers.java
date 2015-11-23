/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nonbouncynumbers;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Nonbouncynumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //  int T=sc.nextInt();
       int inc=12;
       int dec=11;
       BigInteger answer[]=new BigInteger[10001];
       BigInteger first=factorial(2+10);
       BigInteger second=factorial(10);
       BigInteger first1=factorial(2+9);
       BigInteger three=factorial(2);
       BigInteger second1=factorial(9);
       for(int i=3; i<answer.length; i++){
       inc++;
       dec++;
       first=first.multiply(new BigInteger(inc+""));
       first1=first1.multiply(new BigInteger(dec+""));
       three=three.multiply(new BigInteger(i+""));
      // first=first.mod(new BigInteger("1000000007"));
      // first1=first1.mod(new BigInteger("1000000007"));
      // three=three.mod(new BigInteger("1000000007"));
       BigInteger ans=first.divide(second.multiply(three));           
       BigInteger ans1=first1.divide(second1.multiply(three));      
       
       answer[i]=ans.add(ans1).subtract(new BigInteger("2")).subtract(new BigInteger(""+(10*i))).mod(new BigInteger("1000000007"));
    //  System.out.println(answer[i]);
       }
     //  System.out.println(Arrays.toString(answer));
    }

      public static BigInteger factorial(long n){
    BigInteger calc=BigInteger.ONE;
    for(long i=n; i>0; i--){
    calc=calc.multiply(new BigInteger(""+i));
   // calc=calc.mod(new BigInteger("1000000007"));
    }
    return calc;
    }
}
