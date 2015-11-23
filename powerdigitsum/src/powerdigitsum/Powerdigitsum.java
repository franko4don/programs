/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powerdigitsum;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Powerdigitsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       int sum=0;
       BigInteger b1=new BigInteger("2");
       BigInteger b2=b1.pow(N);
       String compute=b2.toString();
       for(int j=0; j<compute.length(); j++){
       sum+=Integer.parseInt(String.valueOf(compute.charAt(j)));
       }
       v.addElement(sum);
       }
       for(int k=0; k<v.size(); k++){
       System.out.println(v.elementAt(k));
       }
    }
}
