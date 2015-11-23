/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumdraws;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Minimumdraws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int pair=sc.nextInt();
        int socks=1+pair;
        v.addElement(socks);
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
}
