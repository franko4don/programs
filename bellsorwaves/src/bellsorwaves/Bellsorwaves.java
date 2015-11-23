/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bellsorwaves;
import java.util.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Bellsorwaves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double high=0;
        double low=7574.0;
        int count=1;
        double[]check=new double[N];
        HashSet hs=new HashSet();
        for(int i=0; i<N; i++){
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        check[i]=y;
        hs.add(y);
        if(y>high){
        high=y;
        }
        if(y<low){
        low=y;
        }
        }
        double tester=high;
        for(int j=0; j<N; j++){
        if(check[j]==low){
        count++;
        tester=check[j];
        }
        }
        int period=0;
        double start=check[0];
        for(int i=0; i<N; i++){
        if(start!=check[i]){
        period++;
        start=check[i];
        }
        
        }
        
        
        if(hs.size()==2){
        System.out.println("square-wave");
        System.out.println(period/2);
        }else{
        System.out.println("sine-wave");
        System.out.println(count/2);
        }
       // System.out.println(low);
    }
}
