/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeehkn;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class IEEEHKN {

      public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);      
        int count=0;
        int limit;
        String bounds=sc.nextLine();
        for(limit=0; limit<bounds.length(); limit++){
        char comma=bounds.charAt(limit);
        if(comma==','){
        break;
        }
        }
        String part1=bounds.substring(0,limit);
        String part2=bounds.substring(limit+1,bounds.length());
        int a=Integer.parseInt(part1);
        long b=Long.parseLong(part2);
       for(int j=a; j<=b; j++){
        String first=Long.toBinaryString(j); //converts value to binary
        StringBuilder sb=new StringBuilder();
        sb.append(first);
        String finals=sb.reverse().toString();
        if(first.equals(finals)){                 //checks if it is a palindrome
        count+=1;
        }
    }
        System.out.println(count);
}
}
