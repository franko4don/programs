/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package runningtimealgorithms;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Runningtimealgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector<Integer>v=new Vector<Integer>();
        for(int i=0; i<N; i++){
        v.addElement(sc.nextInt());
        }
        int count=0;
        for(int j=0; j<N; j++){
        int put=v.elementAt(j);
        for(int k=j; k>=0; k--){
        if(put>=v.elementAt(k)){
        v.add(k, put);
        v.remove(j+1);
        count++;
        break;
        }
        }
        
        }
        System.out.println(v);
    }

}
