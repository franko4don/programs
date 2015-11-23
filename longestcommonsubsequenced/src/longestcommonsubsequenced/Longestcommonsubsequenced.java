/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonsubsequenced;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestcommonsubsequenced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.next();
        String M=sc.next();
              
        char[]sub1=N.toCharArray();
        char[]sub2=M.toCharArray();
        char first[]=new char[sub1.length+1];
        char second[]=new char[sub2.length+1];
        for(int i=1; i<first.length; i++){
        first[i]=sub1[i-1];
        }
        
        for(int i=1; i<second.length; i++){
        second[i]=sub2[i-1];
        }
         System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        int number[][]=new int[first.length][second.length];
        for(int i=1; i<number.length; i++){
        for(int j=1; j<number[i].length; j++){
        if(first[i]==second[j]){
        number[i][j]=1+number[i-1][j-1];
        }else{
        number[i][j]=Math.max(number[i-1][j], number[i][j-1]);
        }
        }
        }
        
       
       System.out.println(number[first.length-1][second.length-1]); 
       System.out.println(Arrays.deepToString(number)); 
    }
    }

