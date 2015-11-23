/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddquery;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Evenoddquery {
static int A[];
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        A=new int[N];
        for(int i=0; i<N; i++){
        A[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        for(int j=0; j<Q; j++){
        int x=sc.nextInt()-1;
        int y=sc.nextInt()-1;
        long check=find(x,y);
        if(check%2==0){
        System.out.println("Even");
        }else{
        System.out.println("Odd");
        }
        }
    }
    private static long find(int x,int y){
    
    if(x>y){
    return 0;
    }
    long ans=(long)Math.pow(A[x],find(x+1,y));
    return ans;
    }
}
