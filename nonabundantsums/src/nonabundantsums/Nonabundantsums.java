/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nonabundantsums;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Nonabundantsums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
       Vector <Integer>abundant=new Vector<Integer>();
       for(int j=12; j<=51000; j++){
       int sum=0;
       long add=0;
       for(int i=1; i<=j/2; i++){         
       if(j%i==0){
       sum+=i;
       }
       if(sum>j){
       abundant.addElement(j);
       break;
       }
       }
       }
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       for(int i=0; i<abundant.size(); i++){
       for(int k=i; k<abundant.size(); k++){
       hm.put(abundant.elementAt(i)+abundant.elementAt(k),abundant.elementAt(i)+abundant.elementAt(k));
       }
       }
       int T=sc.nextInt();
       for(int m=0; m<T; m++){
       int N=sc.nextInt();
       if(hm.containsKey(N)){
       System.out.println("YES");
       }else{
       System.out.println("NO");
       }
       }       
    }
}
