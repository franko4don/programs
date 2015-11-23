/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package destroy;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Destroy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.next();
        int count=0;
        Vector<String>v=new Vector<String>();
        String get="";
        for(int i=0; i<N.length(); i++){
        get+=N.charAt(i);
        v.addElement(get);
        }
        for(int j=0; j<v.size(); j++){
        int length=get.length()-v.elementAt(j).length();
        if(length%2!=0){
        continue;
        }
        String comp1=N.substring(v.elementAt(j).length(), v.elementAt(j).length()+length/2);
        String comp2=N.substring(v.elementAt(j).length()+length/2, N.length());
        if(comp1.equals(comp2)){
        count++;
        }
        }
        System.out.println(count+1);
    }
}
