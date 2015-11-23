/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package substringdivisibility;
import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Substringdivisibility {
static Vector v;
static long divide;
static long addup;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       v=new Vector();
       int N=sc.nextInt();
       if(N==3){
       permutation("","0123");
       }
       if(N==4){
       permutation("","01234");
       }
       if(N==5){
       permutation("","012345");
       }
       if(N==6){
       permutation("","0123456");
       }
       if(N==7){
       permutation("","01234567");
       }
       if(N==8){
       permutation("","012345678");
       }
       if(N==9){
       permutation("","0123456789");
       }
       System.out.println(addup);
    }
    private static void permutation(String prefix,String str){
    int n=str.length();
   // addup=0;
    int []primes=new int[]{2,3,5,7,11,13,17};  
    if(n==0){
    int length=prefix.length()-2;
    StringBuilder sb=new StringBuilder();
    sb.append(prefix);
    int l=0;
    int count=0;
    for(int j=0; j<length-1; j++){
    divide=Long.parseLong(prefix.substring(j+1,j+4));
    if(divide%primes[l]==0){
    count++;
    l++;
    }else{
    break;
    }
    }
    if(count==length-1){
     addup+=Long.parseLong(prefix);
    v.addElement(prefix);
    }
    }else{
    for(int i=0; i<n; i++){
    permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
   
    }
    }
    }
}
