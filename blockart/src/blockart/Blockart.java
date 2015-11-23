/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blockart;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Blockart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int N=sc.nextInt();
        int numbers[][]=new int[R][C];
        for(int i=0; i<N; i++){
        String operationtype=sc.next();
        int startR=sc.nextInt();
        int startC=sc.nextInt();
        int endR=sc.nextInt();
        int endC=sc.nextInt();
        if(operationtype.equals("a")){
        for(int j=startR-1; j<endR; j++){
        for(int k=startC-1; k<endC; k++){
        numbers[j][k]+=1;
        }
        }
        }
        
        if(operationtype.equals("r")){
        for(int j=startR-1; j<endR; j++){
        for(int k=startC-1; k<endC; k++){
        numbers[j][k]-=1;
        }
        }
        }
        
        if(operationtype.equals("q")){
        long add=0;
        for(int j=startR-1; j<endR; j++){
        for(int k=startC-1; k<endC; k++){
        add+=numbers[j][k];
        }
        }
        System.out.println(add);
        }
    }
}
}
