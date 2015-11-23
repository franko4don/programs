/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandarrays;
import java.util.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int sum1=0;
        Vector<Integer> v1=new Vector<Integer>();
        int []v2=new int[N];
        int numbers[]=new int[N];
        for(int j=0; j<N; j++){
        numbers[j]=sc.nextInt();
        sum1+=numbers[j];
        v1.addElement(sum1);
        }
        int sum2=0;
        for(int k=numbers.length-1; k>=0; k--){
        sum2+=numbers[k];
        v2[k]=sum2;
        }
        int count=0;
        for(int m=0; m<N; m++){
        if(v2[m]==v1.elementAt(m)){
        System.out.println("YES");
        count++;
        break;
        }
        }
        if(count==0){
        System.out.println("NO");
        } 
        System.out.println(Arrays.toString(v2));
        System.out.println(v1);
        }
        
    }
}
