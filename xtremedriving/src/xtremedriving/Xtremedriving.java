/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremedriving;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Xtremedriving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int K=sc.nextInt();
       int N=sc.nextInt();
       long ways[][]=new long[5][K+1];
       for(int i=0; i<N; i++){
       int cowR=sc.nextInt();
       int cowC=sc.nextInt();
       ways[cowR][cowC]=-1;
       
       }
       
    }
}
