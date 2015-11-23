/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmicpc;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Acmicpc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int N=sc.nextInt();
        int M=sc.nextInt();
        Vector v=new Vector();
        String binary[]=new String[N];
        for(int i=0; i<N; i++){
        binary[i]=sc.next();
        }
        for(int j=0; j<N; j++){
        BigInteger b1=new BigInteger(binary[j],2);
        for(int k=j; k<N; k++){
        int count=0;
        BigInteger b2=new BigInteger(binary[k],2);
        String answer=b1.or(b2).toString(2);
        for(int l=0; l<answer.length(); l++){
        if(answer.charAt(l)=='1'){
        count++;
        }
        }
        if(count>temp){
        temp=count;
        }
        v.addElement(count);
        }
        }
        int increase=0;
        for(int g=0; g<v.size(); g++){
        if(Integer.parseInt(v.elementAt(g).toString())==temp){
        increase++;
        }
        }
        System.out.println(temp);
        System.out.println(increase);
    }
}
