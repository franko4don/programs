/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doublebasepalindrome;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Doublebasepalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int sum=0;
        for(int i=N-1; i>=0; i--){
        String get=Integer.toString(i);
        String out=Integer.toString(i, K);
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        sb1.append(get);
        sb2.append(out);
        String compare1=sb1.reverse().toString();
        String compare2=sb2.reverse().toString();
        if(compare1.equals(get)&&compare2.equals(out)){
        sum+=i;
        }
        }
        System.out.println(sum);
    }
}
