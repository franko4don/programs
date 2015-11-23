/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandanagrams;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandanagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        String input=sc.next();
        BigInteger sum=BigInteger.ZERO;
        BigInteger two=new BigInteger("2");
        Vector<Character> v=new Vector<Character>();
        HashSet<String> hs=new HashSet<String>();
        StringBuilder sb=new StringBuilder().append(input);
        for(int j=0; j<input.length(); j++){
        StringBuilder main=new StringBuilder();
        for(int k=0; k<sb.length(); k++){
        main.append(sb.charAt(k));
        char get[]=main.toString().toCharArray();
        Arrays.sort(get);
        String put=String.valueOf(get);
        hs.add(put);
        }
        sb.deleteCharAt(0);
        }
        Iterator it=hs.iterator();
        while(it.hasNext()){
        long count=0;
        String compare1=it.next().toString();      
        int sub=compare1.length();
        int calc=1+input.length()-sub;
        for(int l=0; l<calc; l++){
        String temp=input.substring(l,l+sub);
        char sortit[]=temp.toCharArray();
        Arrays.sort(sortit);
        String compare2=String.valueOf(sortit);
        if(compare1.equals(compare2)){
        count++;
        }
        }
        if(count>1){
        BigInteger first=factorial(count);
        BigInteger second=factorial(count-2);
        BigInteger three=first.divide(second.multiply(two));
        sum=sum.add(three);
        }
        }
        System.out.println(sum);
    } 
    }
    public static BigInteger factorial(long n){
    BigInteger calc=new BigInteger("1");
    for(long i=n; i>0; i--){
    calc=calc.multiply(new BigInteger(Long.toString(i)));
    }
    return calc;
    }
}
