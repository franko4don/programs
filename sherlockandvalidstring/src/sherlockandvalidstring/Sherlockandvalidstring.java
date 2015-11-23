/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandvalidstring;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandvalidstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char one='a';
        char alpha[]=new char[26];
        HashMap <Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0; i<26; i++){
        alpha[i]=one;
        one+=1;
        }
        int numbers[]=new int[26];
        String input=sc.next();
        for(int j=0; j<26; j++){
        int count=0;
        for(int k=0; k<input.length(); k++){
        if(alpha[j]==input.charAt(k)){
        count++;
        }
        }
        hm.put(alpha[j], count);
        numbers[j]=count;
        }
        int high=0;
        int mode=0;
        for(int i=0; i<26; i++){
        numbers[i]=hm.get(alpha[i]);       
        }
        for(int j=0; j<26; j++){
        int count=0;
        for(int k=j; k<26; k++){
        if(numbers[j]==numbers[k]&&numbers[k]!=0){
        count++;
        }
        if(count>high){
        high=count;
        mode=numbers[j];
        }
        }
        }
       int addlow=0;
       for(int i=0; i<26; i++){
       if(numbers[i]-0<Math.abs(numbers[i]-mode)){
       addlow+=numbers[i]-0;
       }else{
       addlow+=Math.abs(numbers[i]-mode);
       }
       }
       if(addlow>1){
       System.out.println("NO");
       }else{
       System.out.println("YES");
       }
    }
    }
