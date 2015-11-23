/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package specialmultiple;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Specialmultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Long> v=new Vector<Long>();
        for(int i=1; i<=10000; i++){
        String ans=Integer.toBinaryString(i);
        long get=Long.parseLong(ans)*9;
        v.addElement(get);
        }
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        long N=sc.nextLong();
        for(int l=0; l<v.size(); l++){
        if(v.elementAt(l)%N==0){
        System.out.println(v.elementAt(l));
        break;
        }
        }
    }
    }
}
