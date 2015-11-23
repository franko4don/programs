/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package littleashishhugedonation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Littleashishhugedonation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Long,Long> hm=new HashMap<Long,Long>();
        long add=0;
        for(long i=1; i<=20000000; i++){
        long sqr=(long)Math.pow(i,2);
        add+=sqr;
        hm.put(add,i);
        if(add>10000000000000000L){
        break;
        }
        }
        Collection c=hm.keySet();
        Object sort[]=c.toArray();
        Arrays.sort(sort);
        int start=0;
        int stop=0;
        long value[]=new long[sort.length];
        for(int m=0; m<value.length; m++){
        value[m]=Long.parseLong(sort[m].toString());
        if(sort[m].toString().length()>13&&stop==0){
        start=m;
        stop++;
        }
        }
        int T=sc.nextInt();
        for(int k=0; k<T; k++){
        long X=sc.nextLong();
        if(Long.toString(X).length()<=13){
        for(int j=start; j>=0; j--){
        if(value[j]<=X){
        System.out.println(hm.get(value[j]));  
        break;
        }
        }
        }else{
        for(int j=value.length-1; j>=0; j--){
        if(value[j]<=X){
        System.out.println(hm.get(value[j]));  
        break;
        }
        }
        }
        }
    }
}
