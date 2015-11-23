/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zalgorithm;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Zalgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        String input=sc.next();
        long addup=input.length();
        long sum[]=myownz(input);
        char []raw=input.toCharArray();
        for(int j=0; j<sum.length; j++){
        addup+=sum[j];
        }     
        System.out.println(Arrays.toString(zvalues(raw)));
    }
        
        
    }
    
    public static long[] zvalues(char[] streams){
    long Z[]=new long[streams.length];
    int left=0;
    int right=0;
    for(int i=1; i<streams.length; i++){
    if(i>right){
    left=right=i;  
    while(right<streams.length&&streams[right]==streams[right-left]){
    right++;
    }
    Z[i]=right-left;
    right--;
    }
    else{
        int k1=i-left;
        if(Z[k1]<right-i+1){
        Z[i]=Z[k1];
        }else{
        left=i;
        while(right<streams.length&&streams[right]==streams[right-left]){
    right++;
    }
        Z[i]=right-left;
        right--;
        }
}
    }
    return Z;
    

}
    
    public static long[] myownz(String operate){
    long [] Z=new long[operate.length()];
    int left=0;
    int right=0;
    for(int i=1; i<operate.length(); i++){
    int start=0;
    int end=i;
    int count=0;
    while(end<operate.length()&&operate.charAt(start)==operate.charAt(end)){
    start++;
    end++;
    count++;
    }
   
    if(count>1){
    Z[i]=count;
    left=i+1;
    right=end-1;
    start=0;
    for(int j=left+1; j<=right; j++){
    if(Z[start]+j<=right){
    Z[j]=Z[start];
    start++;
    }else{
    break;
    }
    i++;
    }
    }else{
    Z[i]=count;
    }
    }
        return Z;
    }
}