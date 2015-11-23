/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeindex;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Palindromeindex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       Vector v=new Vector();
       for(int i=0; i<T; i++){
       String input=sc.next();
       StringBuilder sb1=new StringBuilder();
       sb1.append(input);
       String check=sb1.reverse().toString();
       if(check.equals(input)){
       v.addElement(-1);
       }else{
       for(int j=0; j<input.length()/2; j++){
        int temp=input.length()-1-j;
        if(input.charAt(j)!=input.charAt(temp)){
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        sb.deleteCharAt(temp);
        String check1=sb.toString();
        String check2=sb.reverse().toString();
        if(check1.equals(check2)){
        v.addElement(temp);
        }else{
        v.addElement(j);
        }
        break;
        }
       }
       }
       }
       for(int k=0; k<v.size(); k++){
       System.out.println(v.elementAt(k));
       }
    }
}
