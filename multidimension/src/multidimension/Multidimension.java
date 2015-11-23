/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimension;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Multidimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]matrix=new int[3][3];
        for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
        matrix[i][j]=sc.nextInt();
        }
        }
       // for(int k=0; k<matrix.length; k++){
        //System.out.println(Arrays.toString(matrix[k]));
        //}
        for(int a=0; a<3; a++){
        for(int b=0; b<3; b++){
        System.out.print(matrix[a][b]+" ");
        }
        System.out.println(" ");
        }
    }
}
