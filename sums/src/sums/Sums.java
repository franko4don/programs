/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sums;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long sum=0;
        long number[]=new long[200001];
        for(int i=1; i<=200000; i++){
        sum+=i;   
        number[i]=sum;
        }
        System.out.println(sum);
    }
}
