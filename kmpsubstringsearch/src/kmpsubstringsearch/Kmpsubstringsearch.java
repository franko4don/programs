/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmpsubstringsearch;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Kmpsubstringsearch {
static int j=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String test="efghij";
        String pattern="abcd";
        int []pos=new int[pattern.length()];
        int j=0;
        for(int i=1; i<pos.length; i++){
        if(pattern.charAt(j)==pattern.charAt(i)){
        pos[i]=j+1;
        j++;
        }else{
        j=pos[i-1];
        }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(match(pos,test,pattern));
    }
    public static boolean match(int pos[],String text, String pattern){
    
    boolean monitor;
    String temp="";
    for(int i=0; i<text.length(); i++){
    monitor=false;
    if(pattern.charAt(j)==text.charAt(i)){
    //System.out.println(i+" "+j+" is a match");
    j++;
    }else{   
   // System.out.println(pos[j]+" "+j+" "+" not match");
    if(j==0){continue;}
    j=pos[j-1];
    i--;
    System.out.println(j+" "+i);
    
    }
    }
    if(j==pattern.length()){
    return true;
    }else{
     return false;  
    }
    }
}
