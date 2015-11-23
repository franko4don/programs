/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newfibonacci;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Newfibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int j=0; j<T; j++){
       Vector <Long>v=new Vector<Long>();
       v.addElement(0L);
       v.addElement(1L);
       v.addElement(1L);
       long a=sc.nextLong();
       long b=sc.nextLong();
       long c=sc.nextLong();
       long n=sc.nextLong();
       for(int i=0; i<n-2; i++){
       long f3=((a*v.elementAt(i+2))+(b*v.elementAt(i+1))+(c*v.elementAt(i)))%1000000007;
       v.addElement(f3);
    }
       System.out.println(v);
    }
    }
}
