/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tandemrepeats;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Tandemrepeats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       String input=sc.next();
       for(int i=0; i<M; i++){
       int L=sc.nextInt()-1;
       int R=sc.nextInt()-1;
       int patternlength=R+1-L;
       String take=input;
       take=take.substring(L, R+1)+"$"+take.substring(L);
       char get[]=take.toCharArray();
       Vector<Integer> sample=zvalues(get,patternlength);
       int ans=0;
       int temp=1;
       for(int j=0; j<sample.size()-1; j++){
       if(sample.elementAt(j)+patternlength==sample.elementAt(j+1)){
       temp++;
       }else{
       if(temp>ans){
       ans=temp;
       temp=1;
       }
       }
       }
       if(temp>ans){
       ans=temp;
       }
       System.out.println(ans);
    }
    }
    public static Vector<Integer> zvalues(char[] streams,int len){
    long Z[]=new long[streams.length];
    Vector<Integer>v=new Vector<Integer>();
    int left=0;
    int right=0;
    for(int i=1; i<streams.length; i++){
    if(i>right){
    left=right=i;  
    while(right<streams.length&&streams[right]==streams[right-left]){
    right++;
    }
    Z[i]=right-left;
    if(Z[i]==len)v.addElement(i-len);
    right--;
    }
    else{
        int k1=i-left;
        if(Z[k1]<right-i+1){
        Z[i]=Z[k1];
        if(Z[i]==len)v.addElement(i-len);
        }else{
        left=i;
        while(right<streams.length&&streams[right]==streams[right-left]){
    right++;
    }
        Z[i]=right-left;
        if(Z[i]==len)v.addElement(i-len);
        right--;
        }
}
    }
    return v;
    

}
    public static int compare(String main, String pattern, int L, int R){
    int temp=0;
    int ans=0;
   // System.out.println(pattern);
    for(int i=L-1; i<main.length()-pattern.length()+1; i+=pattern.length()){
    if(pattern.equals(main.substring(i, i+pattern.length()))){
   //  System.out.println(main.substring(i, i+pattern.length()+R-1));
    temp++;
    }else{
    if(temp>ans){
        ans=temp;
        temp=1;
    }
    }
    }
    if(temp>ans){
    ans=temp;
    }
    return ans;
    }
     
    }

