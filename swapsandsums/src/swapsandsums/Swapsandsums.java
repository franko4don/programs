/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsandsums;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Swapsandsums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int Q=sc.nextInt();
       Vector <Integer> v=new Vector<Integer>();
       for(int i=0; i<N; i++){
       v.addElement(sc.nextInt());
       }
       HashMap <Vector,Long> hm=new HashMap<Vector,Long>();
       for(int j=0; j<Q; j++){
       int type=sc.nextInt();
       int l=sc.nextInt();
       int r=sc.nextInt();      
       long sum=0;
       if(type==1){
       for(int k=l-1; k<r; k+=2){
       int first=v.elementAt(k);
       int second=v.elementAt(k+1);
       v.setElementAt(second,k);
       v.setElementAt(first,k+1);
       }
       }else{
       for(int m=l-1; m<r; m++){
       sum+=v.elementAt(m);
       }
       hm.put(v,sum);
       System.out.println(v);
       System.out.println(sum);
       }
       
       }
    }
}
