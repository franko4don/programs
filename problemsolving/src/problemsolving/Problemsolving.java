/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Problemsolving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int K=sc.nextInt();
        int count=0;
        Vector <Integer>v=new Vector<Integer>();
       // int values[]=new int[N];
        for(int j=0; j<N; j++){
        v.addElement(sc.nextInt());
        }
        while(!v.isEmpty()){
        int check=v.elementAt(0);
        v.removeElementAt(0);
        for(int m=0; m<v.size(); m++){
        if(Math.abs(check-v.elementAt(m))>=K){
        check=v.elementAt(m);
        v.removeElementAt(m);
        m=0;
       // System.out.println(check);
        }
        }
        count++;
        }
        System.out.println(count);
        }
    }
}
