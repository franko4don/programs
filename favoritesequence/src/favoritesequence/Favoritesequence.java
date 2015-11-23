/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritesequence;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Favoritesequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector finals=new Vector();
        Vector v=new Vector();
        Vector vec=new Vector();
        Vector ans=new Vector();
        HashSet hs=new HashSet();
        String make="";
        for(int i=0; i<N; i++){
        int K=sc.nextInt();
        for(int j=0; j<K; j++){
        long input=sc.nextInt();
        vec.addElement(input);
        hs.add(input);
        make+=Long.toString(input)+" ";
        }
        v.addElement(make.trim());
        make="";
        }       
        Object include[]=hs.toArray();
        Arrays.sort(include);
        for(int h=0; h<v.size(); h++){
        Vector vc=new Vector();
        StringBuilder sb=new StringBuilder();
        String some="";
        for(int p=0; p<v.elementAt(h).toString().length(); p++){
        if(v.elementAt(h).toString().charAt(p)==' '){
        break;
        }
        some+=v.elementAt(h).toString().charAt(p);
        }
        sb.append(some);
        vc.addElement(some);
        for(int k=0; k<include.length; k++){
        String compare=include[k].toString();
        int count=0;
        for(int u=0; u<vc.size(); u++){
        if(compare.equals(vc.elementAt(u).toString())){
        count++;
        }
        }
        if(count>0){
        continue;
        }
        sb.append(" "+compare);
        vc.addElement(" "+compare);
        }
        ans.addElement(sb.toString().trim());
        String generate="";
       /** for(int e=0; e<sb.length(); e++){
        if(sb.toString().trim().charAt(e)==' '){
        finals.addElement(generate);
        break;
        }
        generate+=sb.toString().trim().charAt(e);
        }
        Object sort[]=finals.toArray();
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));*/
        }
        //System.out.println(v);
        
        Object confirm[]=ans.toArray();
        Arrays.sort(confirm);
        System.out.println(Arrays.toString(confirm));
    }
}
