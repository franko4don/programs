/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonsubstring;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestcommonsubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="$abcdaf";
        String b="$3bcdf";
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
        number[i][j]=0;
        }
        }
        }
        System.out.println(high+"  "+"number["+start+"]"+"["+end+"]");
    }
}
