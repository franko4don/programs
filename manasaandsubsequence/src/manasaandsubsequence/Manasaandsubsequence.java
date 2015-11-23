/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manasaandsubsequence;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Manasaandsubsequence {
static long sum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String get=Integer.toString(N);
        sum=N;
        for(int i=0; i<get.length(); i++){
        sum+=Character.getNumericValue(get.charAt(i));
    }
        if(get.length()==3){
        System.out.println(subsequence4(N)+sum);
        }
    }
    private static long subsequence3(int number){
    String get=Integer.toString(number);
    long sum1=0;   
    for(int k=0; k<2; k++){
    for(int j=k+1; j<=2; j++){
    String temp=String.valueOf(get.charAt(k));
    sum1+=Integer.parseInt(temp+=get.charAt(j));
    }
    }
    return sum1;
    }
    private static long subsequence4(int number){
    String get=Integer.toString(number);
    long sum2=0;
    for(int i=0; i<3; i++){
    String temp=String.valueOf(get.charAt(0));
    sum2+=Integer.parseInt(temp+=get.charAt(i+1));
    }
    sum2+=Integer.parseInt(get.substring(0,3));
    sum2+=Integer.parseInt(get.substring(0,2)+get.charAt(3));
    sum2+=Integer.parseInt(get.charAt(0)+get.substring(2));
    int three=Integer.parseInt(get.substring(1));
    long add=subsequence3(three);
    return add+sum2;
    }
}
