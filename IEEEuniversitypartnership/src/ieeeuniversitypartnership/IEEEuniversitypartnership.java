/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeeuniversitypartnership;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author FRANKCHUKY
 */
public class IEEEuniversitypartnership {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long inputs[]=new long[N];
        Vector v=new Vector();
        for(int i=0; i<inputs.length; i++){
        inputs[i]=sc.nextLong();
        }
        int nqueries=sc.nextInt();
        for(int j=0; j<nqueries; j++){
        int query=sc.nextInt();
        for(int k=0; k<N; k++){
        if(inputs[k]%query==0){
        v.addElement(inputs[k]);
        }
        }
        System.out.println(v);
        v.clear();
        }
        
    }
}
