/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hereliesthedifference;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Hereliesthedifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println(2^3);
        
    }
    public static char[] subset(int set[],int total){
        
        char dp[][]=new char[set.length][total+1];
        for(int i=0; i<set.length; i++){
        dp[i][0]='T';  
        }
        for(int i=0; i<set.length; i++){
        if(i==0){
        for(int j=1; j<dp[i].length; j++){
        if(j-set[i]==0){
        dp[i][j]='T';
        }else{
        dp[i][j]='F';
        }
        }
        }else{
        for(int j=1; j<total+1; j++){
        if(j<set[i]){
        dp[i][j]=dp[i-1][j];
        }else{
        if(dp[i-1][j]=='T'){
        dp[i][j]='T';
        }else{
        dp[i][j]=dp[i-1][j-set[i]];
        }
        }
        }
        }
        }
    return dp[dp.length-1];
    }
    
    public static int addup(int[] number){
    int size=0;
    for(int i=0; i<number.length; i++){
    size+=number[i];
    }
    return size;
    }
}
