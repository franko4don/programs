/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reciprocalcycles;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Reciprocalcycles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        Vector <Integer> v=new Vector<Integer>();
        for(int i=2; i<10000; i++){
        int count=0;
        int number=1;
        int remain[]=new int[10000];
        for(int j=0; j<20000; j++){
        if(number==0){
        count=0;
        break;
        }
        if(remain[number]!=0){
        break;
        }
        remain[number]=count;
        number*=10;
        number%=i;
        count++;
        }
        if(count-remain[number]>temp){
        temp=count-remain[number];
        v.addElement(i);
        }
        }
        int T=sc.nextInt();
        for(int k=0; k<T; k++){
        int N=sc.nextInt();
        int high=0;
        for(int m=0; m<v.size(); m++){
        if(v.elementAt(m)>=N){
        break;
        }
        if(v.elementAt(m)>high){
        high=v.elementAt(m);
        }
        }
        System.out.println(high);
        }       
}
}
