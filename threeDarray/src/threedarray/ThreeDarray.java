/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threedarray;

import java.util.Random;

/**
 *
 * @author FRANKCHUKY
 */
public class ThreeDarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd=new Random();
        int number[][][]=new int[4][5][8];
        for(int i=0; i<number.length; i++){
        for(int j=0; j<number[i].length; j++){
        for(int k=0; k<number[i][j].length; k++){
        number[i][j][k]=rd.nextInt(9);
        }
        }
        }
        for(int i=0; i<number.length; i++){
        for(int j=0; j<number[i].length; j++){
        System.out.print("| ");
        for(int k=0; k<number[i][j].length; k++){
        System.out.print(number[i][j][k]+" ");
        }
        System.out.print("|");
        System.out.println();
        }
        System.out.println(" "+repeat("-",(9*2)-1));
        }
        
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
