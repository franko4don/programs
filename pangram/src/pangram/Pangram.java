/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pangram;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pangram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine().toLowerCase();
       char one='a';
       char alpha[]=new char[26];
       for(int k=0; k<26; k++){
       alpha[k]=one;
       one+=1;
       }
       int count=0;
       for(int i=0; i<26; i++){
        String test=String.valueOf(alpha[i]);
       if(input.contains(test)){
       count++;
       }
       }
       if(count==26){
       System.out.println("pangram");
    }else{
       System.out.println("not pangram");
       } 
    }
}
