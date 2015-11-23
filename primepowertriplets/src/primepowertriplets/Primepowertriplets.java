/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primepowertriplets;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Primepowertriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit=10000000;
        int store[]=new int[limit+1];
        BigInteger primes=new BigInteger("0");
        Vector <Integer>square=new Vector<Integer>();
        Vector <Integer>triplet=new Vector<Integer>();
        Vector <Integer>quad=new Vector<Integer>();
        while(primes.intValue()<3162){
        primes=primes.nextProbablePrime();
        square.addElement((int)Math.pow(primes.intValue(),2));
        if(primes.intValue()<216){
        triplet.addElement((int)Math.pow(primes.intValue(),3));
        }
        if(primes.intValue()<56){
        quad.addElement((int)Math.pow(primes.intValue(),4));
        }
        }
        HashSet<Integer>answer=new HashSet<Integer>();
        for(int i=0; i<square.size(); i++){
        for(int j=0; j<triplet.size(); j++){
        for(int k=0; k<quad.size(); k++){
        int add=square.elementAt(i)+triplet.elementAt(j)+quad.elementAt(k);
        if(add<=limit){
        answer.add(add);
        }else{
        break;
        }
        }
        }
        }
        Object sort[]=answer.toArray();
        Arrays.sort(sort);
        for(int i=0; i<sort.length; i++){
        int check=Integer.parseInt(sort[i].toString());
        store[check]+=1;
        }
        for(int j=0; j<store.length-1; j++){
        store[j+1]+=store[j];
        }
        int T=sc.nextInt();
        for(int m=0; m<T; m++){
        int N=sc.nextInt();       
        System.out.println(store[N]);
        }
    }
}
