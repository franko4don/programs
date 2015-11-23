/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonsubsequence;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestcommonsubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans="";
         String a="$abcdaf";
        String b="$acbcf";
        char[]c=a.toCharArray();
        char[]d=b.toCharArray();
        int len1=c.length;
        int len2=d.length;
        int high=0;
        int start=0;
        int end=0;
        int number[][]=new int[len2][len1];
        for(int i=1; i<len2; i++){
        for(int j=1; j<len1; j++){
        if(d[i]==c[j]){
        
        number[i][j]=number[i-1][j-1]+1;
        if(number[i][j]>high){
        high=number[i][j];
        start=i;
        end=j;
        }
        }else{
        number[i][j]=Math.max(number[i][j-1], number[i-1][j]);
        }
        }
        }
        
        while(start!=0&&end!=0){
        if(number[start][end]>number[start][end-1]&&number[start][end]>number[start-1][end-1]){
        ans+=c[end]+" ";
        start--;
        end--;
        }else{
        if(number[start][end]==number[start][end-1]){
        end--;
        }else{
        start--;
        }
        }
        }
        
        System.out.println(high+" "+ans);
    }
    }
