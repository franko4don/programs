/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FRANKCHUKY
 */
public class Javarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<int[]> al=new ArrayList<int[]>();
        for(int i=0; i<N; i++){
        int D=sc.nextInt();
        int []numbers=new int[D];
        for(int j=0; j<D; j++){
        numbers[j]=sc.nextInt();
        }
        al.add(numbers);
        }       
        int Q=sc.nextInt();
        for(int k=0; k<Q; k++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[]obtain=al.get(x-1);
        try{
        System.out.println(obtain[y-1]);
        }catch(Exception e){
        System.out.println("ERROR!");
        }
        }
    }
}
