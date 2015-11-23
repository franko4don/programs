/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandweirdsum;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandweirdsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long large=sc.nextLong();
        long small=sc.nextLong();
        String first;
        String second;
        if(large>small){
        first=large+"";
        second=small+"";
        }else{
        first=small+"";
        second=large+"";
        }
        int times;
        if(first.length()>second.length()){
        times=first.length()-second.length();
        second=repeat("0",times)+second;
        }else{
        times=second.length()-first.length();
        first=repeat("0",times)+first;
        }
        char start[]=first.toCharArray();
        char end[]=second.toCharArray();
        String ans1="";
        for(int n=0; n<end.length; n++){
        int high=0;
        int test1=Character.getNumericValue(start[n]);
        int test2=Character.getNumericValue(end[n]);
        
        for(int k=test1; k>=0; k--){
        for(int m=test2; m>=0; m--){
        if(((k+m)%10)>high){
        high=((k+m)%10);
        }
        }
        }
        ans1+=high;
        }
        System.out.println(ans1);
        }
        
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
