/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package worstpermutation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Worstpermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        Vector <Integer> v=new Vector<Integer>();
        HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0; i<N; i++){
        v.addElement(sc.nextInt());
        hm.put(v.elementAt(i),i);      
        }
        
        for(int j=0; j<K; j++){
        int count=0;
        if(j<=N){
        int temp=N-j;     
        for(int p=j; p<N; p++){
        if(temp>v.elementAt(p)&&hm.get(temp)>p){
        int get=v.elementAt(p);      
        int position=hm.get(temp);
        v.set(p,temp);        
        v.set(position,get);
        count++;
        hm.clear();
        for(int t=0; t<N; t++){
        hm.put(v.elementAt(t), t);
        }
        break;
        }else{
        break;
        } 
        
        }
        }else{
        break;
        }
        }
        StringBuilder sb=new StringBuilder();
        for(int l=0; l<v.size(); l++){
        sb.append(v.elementAt(l)+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
