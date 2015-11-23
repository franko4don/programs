/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powerfuldigitcounts;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Powerfuldigitcounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector v=new Vector();
        for(long i=0; i<999999999L; i++){
        BigInteger bi=new BigInteger(Long.toString(i));
        bi=bi.pow(N);
        if(bi.toString().length()>N){
        break;
        }
        if(bi.toString().length()==N){
        v.addElement(bi);
        }
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
}
