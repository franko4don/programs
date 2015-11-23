/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern3;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        String input=sc.next();
        System.out.println(match(input));
        }
    }
    public static int match(String process){
    int pattern=0;
    int high=0;
    StringBuilder sb=new StringBuilder();
    for(int i=0; i<process.length(); i++){
    sb.append(process.charAt(i));
    int length=1;
   // System.out.println(sb);
    for(int j=0; j<process.length()-sb.length()+1; j+=sb.length()){
    String get=process.substring(j, j+sb.length());
   // System.out.println(get);
    if(sb.toString().equals(get)){    
    length++;
    }else{
        length=0;
    break;
    }
    }
    if(length>=high){
    high=length;
    pattern=sb.length();
    }
    }
    return pattern;
    }
}
