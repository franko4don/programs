/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Lcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
    
    public static long lcm(Vector<Integer> divisors, int array[]){
    long lcm=1;
    int pos=0;
    int control=0;
    Arrays.sort(array);
    while(pos!=divisors.size()-1){
    int prime=divisors.elementAt(pos);
    int count=0;
    int checkones=0;
    for(int i=0; i<array.length; i++){
    if(array[i]%prime==0){
    array[i]/=prime;
    count++;
    }
    if(array[i]==1){
    checkones++;
    }
    }
    //System.out.println(prime+"  "+Arrays.toString(array));
    
    if(count==0){
    pos++;
    }else{
    lcm*=prime;
    lcm%=1000000007;
    }
    if(checkones==array.length){
    control++;
    break;
    }
    }
    if(control==0){
    for(int j=0; j<array.length; j++){
    lcm*=array[j];
    lcm%=1000000007;
    }
    }
    return lcm%1000000007;
    }
}
