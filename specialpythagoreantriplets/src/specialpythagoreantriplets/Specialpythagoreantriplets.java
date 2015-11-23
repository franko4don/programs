/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package specialpythagoreantriplets;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Specialpythagoreantriplets {

    /**
     * the aim here is to develop a program that can get a pythagorean triplet whose product is maximum when the sum is equal to n
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        HashMap hm=new HashMap();
        int a=1500;
        int b=1500;
        long big=0;
        for(int i=a; i>=1; i--){
        for(int j=i-1; j>=1; j--){
        double cvalue=Math.sqrt((i*i)+(j*j));      
        if(cvalue%1==0){
        int sum=i+j+(int)cvalue;
        long product=i*j*(int)cvalue;
        v.addElement(sum);
        hm.put(sum, product); //generates such numbers and puts them in a hashmap
        }
        }
        }
        int T=sc.nextInt();
        for(int x=0; x<T; x++){
        int N=sc.nextInt();
        if(hm.containsKey(N)){
        System.out.println(hm.get(N));//prints the answer by accessing the object in the hashmap using a key
        }else{
        System.out.println(-1);
        }
        
        }
    }
}
