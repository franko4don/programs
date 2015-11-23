/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handshake;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Handshake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        int N=sc.nextInt()-1;
        int sum=0;
        for(int j=N; j>=0; j--){
        sum+=j;
        }
        v.addElement(sum);
        }
        for(int k=0; k<v.size(); k++){
        System.out.println(v.elementAt(k));
        }
    }
}
