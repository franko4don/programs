/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicelanebyfrank;
import java.util.*;

public class Servicelanebyfrank {

   
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     int T=sc.nextInt();
     int[]width=new int[N];
     int[]indices;
     int[]ans=new int[T];
     for(int i=0; i<N; i++){
     width[i]=sc.nextInt();
     }
     for(int j=0; j<T; j++){
     indices=new int[2];
     for(int k=0; k<2; k++){
     indices[k]=sc.nextInt();
     }
     int[]value;
     value=Arrays.copyOfRange(width,indices[0],indices[1]);
     Arrays.sort(value);
     ans[j]=value[0];
     }
     for(int l=0; l<T; l++){
     System.out.println(ans[l]);
     }
    }
}
