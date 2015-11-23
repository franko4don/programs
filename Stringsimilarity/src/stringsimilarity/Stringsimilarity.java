/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsimilarity;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Stringsimilarity {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();    
       for(int i=0; i<T; i++){
       Vector<String> v=new Vector<String>();
       String input=sc.next();
       int sum=input.length();
       StringBuilder sb=new StringBuilder().append(input);
       sb.deleteCharAt(0);
       for(int j=1; j<input.length(); j++){
       if(sb.charAt(0)==input.charAt(0)){
       StringBuilder test=new StringBuilder().append(sb);
       StringBuilder test1=new StringBuilder().append(input.substring(0,sb.length()));
       for(int l=0; l<sb.length(); l++){
       if(test.equals(test1)){
       sum+=test.length();
       break;
       }
       test.deleteCharAt(test.length()-1);
       test1.deleteCharAt(test1.length()-1);     
       }         
       }
       sb.deleteCharAt(0);        
       }
       System.out.println(sum);
       }       
    }
}
