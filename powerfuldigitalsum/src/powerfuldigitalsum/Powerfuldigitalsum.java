/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powerfuldigitalsum;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Powerfuldigitalsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long test=0;
        int compute=N-1;
        Vector v=new Vector();
        HashSet hs=new HashSet();
        for(int j=compute; j>=1; j--){
        BigInteger bi1=new BigInteger(Integer.toString(j));
        for(int k=compute; k>=1; k--){
        BigInteger bi2=bi1.pow(k);
        long sum=0;
        String operate=bi2.toString();       
        for(int i=0; i<operate.length(); i++){
        sum+=Integer.parseInt(String.valueOf(operate.charAt(i)));
        }
        if(sum>test){
        test=sum;
        }
        }
        }
        System.out.println(test);
    }
}
