/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chandrimaandxor;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Chandrimaandxor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<Integer>();
        for(int i=1; i<=5000000; i++){
        String get=Integer.toBinaryString(i);
        if(get.contains("11")){
        continue;
        }
        v.addElement(i);
        }
        int N=sc.nextInt();
        long ans=0;
        for(int j=0; j<N; j++){
        long input=sc.nextLong()%1000000007;
        ans=(ans^v.elementAt((int)input))%1000000007;
        }
        System.out.println(ans); 
    }
}
