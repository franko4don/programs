/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subsetproblemdp;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Subsetproblemdp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int set[]=new int[]{0,2,3,7,8,10};
        int total=11;
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
        int count=0;
        int row=set.length-1;
        int column=total;
        int num=0;
        if(dp[set.length-1][total]=='T'){
        while(column!=0){
        if(dp[row][column]==dp[row-1][column]){
        row--;
        }else{
        num=set[row];
        count++;
        row--;
        column-=num;
        System.out.println(num);
        }
        }
        System.out.println(count);
        }
    }
    }

