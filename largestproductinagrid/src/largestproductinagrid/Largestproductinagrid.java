/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestproductinagrid;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largestproductinagrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long great=0;
       int [][]number=new int[20][20];
       for(int i=0; i<20; i++){
       for(int j=0; j<20; j++){
       number[i][j]=sc.nextInt();
       }
       }
       int count=0;
       for(int l=0; l<=16; l++){
       for(int m=0; m<=16; m++){
       int times1=number[l][m];
       int times2=number[l+1][m+1];
       int times3=number[l+2][m+2];
       int times4=number[l+3][m+3];
       long ans=times1*times2*times3*times4;
       count++;
       if(ans>great){
       great=ans;
       }
       }
       }
       for(int l=19; l>=3; l--){
       for(int m=0; m<17; m++){
       int times1=number[l][m];
       int times2=number[l-1][m+1];
       int times3=number[l-2][m+2];
       int times4=number[l-3][m+3];
       long ans=times1*times2*times3*times4;
       if(ans>great){
       great=ans;
       }
       }
       }
       for(int k=0; k<20-3; k++){
       for(int l=0; l<20; l++){
       int times1=number[k][l];
       int times2=number[k+1][l];
       int times3=number[k+2][l];
       int times4=number[k+3][l];
       long ans=times1*times2*times3*times4;
       if(ans>great){
       great=ans;
       }
       }
       }
       
       for(int k=0; k<20; k++){
       for(int l=0; l<17; l++){
       int times1=number[k][l];
       int times2=number[k][l+1];
       int times3=number[k][l+2];
       int times4=number[k][l+3];
       long ans=times1*times2*times3*times4;
       if(ans>great){
       great=ans;
       }
       }
       }
       System.out.println(great);
    }
}
