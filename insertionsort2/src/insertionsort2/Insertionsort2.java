/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort2;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Insertionsort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Vector<Integer>v=new Vector<Integer>();
        for(int i=0; i<N; i++){
        v.addElement(sc.nextInt());
        }
        for(int j=1; j<N; j++){
        int temp=v.elementAt(j);
        for(int k=0; k<j; k++){
        if(temp<v.elementAt(k)){
        v.removeElementAt(j);
        v.add(k, temp);
        break;
        }
        
        }
        String get="";
        for(int m=0; m<v.size(); m++){
        get+=v.elementAt(m)+" ";
        }
        System.out.println(get.trim());
        }
    }
}
