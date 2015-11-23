/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cavitymap;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Cavitymap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       String input[][]=new String[N][N];
       String answer[][]=new String[N][N];
       for(int i=0; i<N; i++){
       String get=sc.next();
       char grab[]=get.toCharArray();
       for(int j=0; j<N; j++){
       input[i][j]=String.valueOf(grab[j]);
       answer[i][j]=String.valueOf(grab[j]);
       }
       }
       for(int k=1; k<N-1; k++){
       for(int l=1; l<N-1; l++){
       int one=Integer.parseInt(input[k][l-1]);
       int two=Integer.parseInt(input[k][l+1]);
       int three=Integer.parseInt(input[k-1][l]);
       int four=Integer.parseInt(input[k+1][l]);
       int check=Integer.parseInt(input[k][l]);
       if(one<check&&two<check&&three<check&&four<check){
       answer[k][l]="X";
       }
       }
       }
       for(int m=0; m<N; m++){
       StringBuilder sb=new StringBuilder();
       for(int n=0; n<N; n++){
       sb.append(answer[m][n]);
       }
       System.out.println(sb);
       }
       
    }
}
