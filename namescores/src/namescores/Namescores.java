/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namescores;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Namescores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int N=sc.nextInt();
        String names[]=new String[N];
        HashMap hm=new HashMap();
        char one='A';
        for(int i=0; i<26; i++){
        hm.put(one,i+1);
        one+=1;      
        }
        for(int i=0; i<N; i++){
        names[i]=sc.next();
        }
        Arrays.sort(names);
        int Q=sc.nextInt();
        for(int j=0; j<Q; j++){
        String get=sc.next();
        int sum=0;
        for(int k=0; k<get.length(); k++){
        int add=Integer.parseInt(hm.get(get.charAt(k)).toString());
        sum+=add;
        }
        int index=Arrays.binarySearch(names,get);
        int ans=sum*(index+1);
        v.addElement(ans);
        }
        for(int l=0; l<v.size(); l++){
        System.out.println(v.elementAt(l));
        }
    }
}
