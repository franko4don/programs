/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Missingnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];       
        for(int i=0; i<n; i++){
        A[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int B[]=new int[m];
        for(int j=0; j<m; j++){
        B[j]=sc.nextInt();
        }
        int frequency1=1;
        Arrays.sort(A);
        Arrays.sort(B);
        Vector v1=new Vector();
        for(int k=0; k<A.length-1; k++){
        if(A[k]!=A[k+1]){
        v1.addElement(frequency1);
        frequency1=1;
        continue;
        }
        frequency1++;
        }
        v1.addElement(frequency1);
        Vector v2=new Vector();
        int frequency2=1;
        for(int l=0; l<B.length-1; l++){
        if(B[l]!=B[l+1]){
        v2.addElement(frequency2);
        frequency2=1;
        continue;
        }
        frequency2++;
        }
        v2.addElement(frequency2);
        Vector v3=new Vector();
        int count=0;
        for(int p=0; p<v1.size(); p++){
        count+=Integer.parseInt(v1.elementAt(p).toString());
        v3.addElement(count);
        }
        StringBuilder sb=new StringBuilder();
        for(int c=0; c<v1.size(); c++){
        int sum1=Integer.parseInt(v1.elementAt(c).toString());
        int sum2=Integer.parseInt(v2.elementAt(c).toString());
        if(sum2>sum1){
        sb.append(A[Integer.parseInt(v3.elementAt(c).toString())-1]).append(" ");
        }
        }
        System.out.println(sb.toString().trim());
    }
}
