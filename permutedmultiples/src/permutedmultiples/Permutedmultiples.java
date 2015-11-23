/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permutedmultiples;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Permutedmultiples {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int N=sc.nextInt();
        int K=sc.nextInt();
        int count;
        for(int i=125874; i<=N; i++){
        String check1=Integer.toString(i);
        char first1[]=check1.toCharArray();
        Arrays.sort(first1);
        String compare1=String.valueOf(first1);
        count=1;
        for(int j=2; j<=K; j++){
        String check2=Integer.toString(i*j);
        char first2[]=check2.toCharArray();
        Arrays.sort(first2);
        String compare2=String.valueOf(first2);
        if(compare1.equals(compare2)){
        count++;
        }else{
        continue;
        }
        }
        if(count==K){        
        StringBuilder sb=new StringBuilder();
        for(int k=1; k<=K; k++){
        sb.append(i*k+" ");
        }
        v.addElement(sb.toString().trim());
        }
        }
        for(int x=0; x<v.size(); x++){
        System.out.println(v.elementAt(x));
        }
    }
}
