/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandsquare;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandsquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        int N=sc.nextInt()+1;
        BigInteger calc1=new BigInteger("2").pow(N);
        BigInteger calc2=new BigInteger("2");
        BigInteger add=calc1.add(calc2);
        BigInteger mod=new BigInteger("1000000007");
        v.addElement(add.mod(mod));
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
    
}
