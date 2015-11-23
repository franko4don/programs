/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mincostpath;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Mincostpath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=row;
        long number[][]=new long[row][column];
        long sumpath[][]=new long[row][column];
        for(int i=0; i<number.length; i++){
        for(int j=0; j<number[i].length; j++){
        number[i][j]=sc.nextInt();
        }
        }
        long top=0;
        long side=0;
        for(int i=0; i<row; i++){
        top+=number[i][0];
        sumpath[i][0]=top;
        }
        
        for(int i=0; i<column; i++){
        side+=number[0][i];
        sumpath[0][i]=side;        
        }
        for(int i=1; i<row; i++){
        for(int j=1; j<column; j++){
        sumpath[i][j]=number[i][j]+Math.min(sumpath[i-1][j],sumpath[i][j-1]);
        }
        }
        System.out.println(sumpath[row-1][row-1]);
    }
}
