/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whoisthewinner;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Whoisthewinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[]alpha=new char[26];
        char one='a';
        for(int i=0; i<26; i++){
        alpha[i]=one;
        one+=1;
        }
        int numbers[]=new int[26];
        int high=0;
        String input=sc.next();
        for(int j=0; j<26; j++){
        int count=0;
        for(int k=0; k<input.length(); k++){
        if(alpha[j]==input.charAt(k)){
        count++;
        }
        }
        numbers[j]=count;
        if(count>high){
        high=count;
        }
        }
        for(int i=0; i<26; i++){
        if(numbers[i]==high){
        System.out.println(alpha[i]);
        break;
        }
        }
    }
}
