/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Flowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        Vector v=new Vector();
        long flowers[]=new long[N];
        long ans=0;
        for(int i=0; i<N; i++){
        flowers[i]=sc.nextLong();
        if(N==K){
        ans+=flowers[i];
        }
        }
        if(N==K){
        System.out.println(ans);
        System.exit(0);
        }else{
        Arrays.sort(flowers);
        int count=0;
        int control=N/K;
        int remainder=N%K;
       for(int k=0; k<control; k++){
        int x=k;
        count+=K;
        if(k==0){
        long[]sub=Arrays.copyOfRange(flowers,N-count,N);
        //System.out.println(Arrays.toString(sub));
        for(int l=sub.length-1; l>=0; l--){
        v.addElement((x+1)*sub[l]);
        }
        }else{
        long[]sub=Arrays.copyOfRange(flowers,N-count,N-count+K);
        for(int l=sub.length-1; l>=0; l--){
        v.addElement((x+1)*sub[l]);
        }
        }
        }
       Vector vec=new Vector();
        for(int p=0; p<K; p++){
        int part=p;
        long compute=0;
        for(int q=0; q<control; q++){
        compute+=Long.parseLong(v.elementAt(part).toString());
        part+=K;
        }
        vec.addElement(compute);
        }
        for(int h=0; h<remainder; h++){
        vec.addElement((control+1)*flowers[h]);
        }
        long finalans=0;
        for(int u=0; u<vec.size(); u++){
        finalans+=Long.parseLong(vec.elementAt(u).toString());
        }
        System.out.println(finalans);
        }
    }
}
