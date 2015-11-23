/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeofdirtiness;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Degreeofdirtiness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int M=sc.nextInt();
        int number[]=new int[N];
        int len=number.length;
        int inc=0;
        if(N%2!=0){
        for(int j=0; j<M/2; j++){
        int first=j%((N/2)+2);
        int second=((N-1-j)%((N/2)+1));
        number[first]=1;
        number[second+j]=1;
        }
        }
        System.out.println(Arrays.toString(number)); 
        }
    }
}
