/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soyuz11;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Soyuz11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("  /\\  ");
        for(int i=0; i<N; i++){
        System.out.println("  ||  ");
        }
        System.out.println(" /||\\ ");
        System.out.println("/:||:\\");
        for(int i=0; i<N-1; i++){
        System.out.println("|:||:|");
        }
        System.out.println("|/||\\|");
        System.out.println("  **  ");
        System.out.println("  **  ");
    }
}
