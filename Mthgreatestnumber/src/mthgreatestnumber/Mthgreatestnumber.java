/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mthgreatestnumber;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Mthgreatestnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector <Long>v=new Vector<Long>();
        HashSet<Long>hs=new HashSet<Long>();
        int L=sc.nextInt();
        for(int i=0; i<L; i++){
        long val=sc.nextLong();
        v.addElement(val);
        hs.add(val);
        }
        int N=sc.nextInt();
        int M=sc.nextInt();
        for(int j=0; j<L; j++){
        for(int k=0; k<L; k++){
        if(j==k)continue;
        long first=v.elementAt(j);
        long second=v.elementAt(k);
        if(first==second)continue;
        if((second%2==0&&first%2==0)||(second%2==1&&first%2==1)){
        long sum=Math.abs(second-first);
        hs.add(sum);
        
        }
        
        }
        }
        Object sort[]=hs.toArray();
        Arrays.sort(sort);
       // System.out.println(Arrays.toString(sort));
        if(Long.parseLong(sort[sort.length-N].toString())==M){
        System.out.println("AKSHAY");
        }else{
        System.out.println("SANJAY");
        }
    }
}
