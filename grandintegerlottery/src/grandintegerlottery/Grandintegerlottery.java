/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grandintegerlottery;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Grandintegerlottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int S=sc.nextInt();
        int E=sc.nextInt();
        int P=sc.nextInt();
        int N=sc.nextInt();
        if(P>E){
        System.out.println("DOES NOT EXIST");
        System.exit(0);
        }
        int h;
        String[] values=new String[N];
        for(int i=0; i<N; i++){
        values[i]=sc.next();
        v.addElement(values[i]);
        }
        h=Integer.parseInt(values[N-1]);
        for(int j=S; j<E; j++){
        h++;
        String compare=Integer.toString(h);
        for(int k=0; k<N; k++){
        if(compare.contains(values[k])){
        v.addElement(compare);
        break;
        }
        }
        if(h>=E){
        break;
        }
        if(v.size()==P){
        break;
        }
        }
        if(P<=v.size()){
        System.out.println(v.elementAt(P-1));
        }else{
        System.out.println("DOES NOT EXIST");
        }
    }
}
