/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        String input=sc.next();
        if(input.length()%2!=0){
        v.addElement("-1");
        }else{
        String part1=input.substring(0,input.length()/2);
        String part2=input.substring(input.length()/2,input.length());
        char first[]=part1.toCharArray();
        StringBuilder sb=new StringBuilder();
        sb.append(part2);
        for(int j=0; j<part1.length(); j++){
        int k;
        for(k=0; k<sb.length(); k++){
        if(first[j]==sb.charAt(k)){
        sb.deleteCharAt(k);
        break;
        }
        }       
        }       
        v.addElement(sb.length());
        }
        }
        for(int l=0; l<v.size(); l++){
        System.out.println(v.elementAt(l));
        }
    }
}
