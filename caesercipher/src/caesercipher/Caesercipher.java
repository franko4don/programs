/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caesercipher;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Caesercipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String get=sc.next();
        int K=sc.nextInt();
        HashMap<Character,Integer>hm1=new HashMap<Character,Integer>();
        HashMap<Character,Integer>hm2=new HashMap<Character,Integer>();
        char[]lower=new char[26];
        char[]upper=new char[26];
        char one='a';
        char two='A';
        for(int i=0; i<26; i++){
        lower[i]=one;
        upper[i]=two;
        hm1.put(one,i);
        hm2.put(two,i);
        one+=1;
        two+=1;
        }
        String ans="";
        for(int j=0; j<get.length(); j++){
        char test=get.charAt(j);
        if(Character.isLetter(test)&&Character.isLowerCase(test)){
        int value=hm1.get(test);
        value+=K;
        value%=26;
        ans+=lower[value];
        }
        if(Character.isLetter(test)&&Character.isUpperCase(test)){
        int value=hm2.get(test);
        value+=K;
        value%=26;
        ans+=upper[value];
        }
        if(!Character.isLetter(test)){
        ans+=test;
        }
        }
        System.out.println(ans);
    }
}
