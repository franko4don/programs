/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codedtrianglenumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Codedtrianglenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        double firstroot=((-1)+(Math.sqrt(1-(4*2*-N))))/2;
        double secondroot=((-1)-(Math.sqrt(1-(4*2*-N))))/2;
        if(firstroot%1==0&&(long)firstroot>0){
        v.addElement((long)firstroot);
        }
        if(secondroot%1==0&&(long)secondroot>0){
        v.addElement((long)secondroot);
        }
        if(secondroot%1!=0||firstroot%1!=0){
        v.addElement(-1);
        }
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
}
