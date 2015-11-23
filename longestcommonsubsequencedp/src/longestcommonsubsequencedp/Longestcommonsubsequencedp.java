/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonsubsequencedp;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestcommonsubsequencedp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt()+1;
        int M=sc.nextInt()+1;
        int first[]=new int[N];
        int second[]=new int[M];
        for(int i=1; i<first.length; i++){
        first[i]=sc.nextInt();
        }
        for(int j=1; j<second.length; j++){
        second[j]=sc.nextInt();
        }
        int number[][]=new int[first.length][second.length];
        for(int i=1; i<first.length; i++){
        for(int j=1; j<second.length; j++){
        if(first[i]==first[j]){
        number[i][j]=1+number[i-1][j-1];
        }else{
        number[i][j]=Math.max(number[i-1][j], number[i][j-1]);
        }
        }
        }
       System.out.println(Arrays.deepToString(number)); 
    }
}
