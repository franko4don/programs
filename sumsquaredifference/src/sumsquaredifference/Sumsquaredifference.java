/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsquaredifference;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sumsquaredifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v1=new Vector();
        Vector v2=new Vector();
        Vector answer=new Vector();
        BigInteger compute;
        BigInteger ans=new BigInteger("0");
        long sum=0;
        for(int i=1; i<=10000; i++){
        BigInteger b1=new BigInteger(Integer.toString(i));
        compute=b1.pow(2);
        ans=ans.add(compute);
        v1.addElement(ans);
        sum+=i;
        BigInteger b2=new BigInteger(Long.toString(sum));
        v2.addElement(b2.pow(2));
        }
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        int N=sc.nextInt();
        long first=Long.parseLong(v2.elementAt(N-1).toString());
        long second=Long.parseLong(v1.elementAt(N-1).toString());
        answer.addElement(first-second);
        }
        for(int k=0; k<answer.size(); k++){
        System.out.println(answer.elementAt(k));
        }
    }
}
