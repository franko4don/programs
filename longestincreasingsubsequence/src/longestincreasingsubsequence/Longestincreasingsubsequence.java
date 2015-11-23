/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestincreasingsubsequence;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Longestincreasingsubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int test[]=new int[N];
        int low=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
        test[i]=sc.nextInt();
        if(test[i]<low){
        low=test[i];
        }
        }
        Vector<Integer>temp=new Vector<Integer>();
        temp.addElement(0);
        int R[]=new int[test.length];
        Arrays.fill(R, low);
        int length=0;
        for(int i=1; i<test.length; i++){
        if(test[i]>test[temp.elementAt(temp.size()-1)]){
        temp.addElement(i);
        length++;
        R[i]=temp.elementAt(temp.size()-2);
        }else{
        for(int j=0; j<temp.size(); j++){
        if(test[i]<test[temp.elementAt(j)]){
        temp.set(j, i);
        if(j>0){
        R[i]=temp.elementAt(j-1);
        }
        break;
        }
       
        }      
        }
        }
        System.out.println(length+1);
    }
    }
