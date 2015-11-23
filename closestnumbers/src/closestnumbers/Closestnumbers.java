/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package closestnumbers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Closestnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector v=new Vector();
        long []values=new long[N];
        for(int i=0; i<N; i++){
        values[i]=sc.nextLong();
        }
        long temp[]=Arrays.copyOf(values,N);
        Arrays.sort(temp);
        for(int j=0; j<N-1; j++){
        long answers=temp[j+1]-temp[j];
        v.addElement(answers);
        }
        long h=99999999999L;
        for(int k=0; k<v.size(); k++){
        if(Long.parseLong(v.elementAt(k).toString())<h){
        h=Long.parseLong(v.elementAt(k).toString());
        }
        }
        StringBuilder sb=new StringBuilder();
        for(int l=0; l<v.size(); l++){
        if(Long.parseLong(v.elementAt(l).toString())==h){
         sb.append(temp[l]).append(" ").append(temp[l+1]).append(" ");
        }
        }
        System.out.println(sb.toString().trim());
    }
}
