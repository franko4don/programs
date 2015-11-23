/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recurrence;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Recurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        Vector<Long>v=new Vector<Long>();
        v.addElement(1L);
        v.addElement(7L);
        for(int i=2; i<N; i++){
        long ans=(2*v.elementAt(i-1))+(3*v.elementAt(i-2))+(8*i+4);
        v.addElement(ans);
        }
        System.out.println(v.elementAt(v.size()-1));
    }
}
