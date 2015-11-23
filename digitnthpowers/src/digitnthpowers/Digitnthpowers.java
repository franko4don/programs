/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitnthpowers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Digitnthpowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector v=new Vector();
        long addup=0;
        for(int i=2; i<2000000; i++){
        String numb=Integer.toString(i);
        long sum=0;
        for(int j=0; j<numb.length(); j++){
        double multiply=Math.pow(Character.getNumericValue(numb.charAt(j)),N);
        long check=(long)multiply;
        sum+=check;
        }
        if(sum==i){
        addup+=i;
        }
        }
        System.out.println(addup);
    }
}
