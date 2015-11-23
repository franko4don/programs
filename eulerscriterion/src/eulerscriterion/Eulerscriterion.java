/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerscriterion;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Eulerscriterion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long D=sc.nextLong();
        long P=sc.nextLong();
        long A=1;
        long B=A+D;
        long ans=0;
        if(Math.abs(D)==Math.abs(P)){
        System.out.println(0);
        continue;
        }
        for(int j=0; j<1000000; j++){
        if(A*B==P&&Math.abs(A-B)==D){
        if(B==A){
        System.out.println(1*2);
        ans=2;
        }else{
        System.out.println(4);
        ans=4;
        }
        break;
        }
        A+=1;
        B+=1;
        }
        }
    }
}
