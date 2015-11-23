/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alternatingcharacters;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Alternatingcharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<T; i++){
        int count=0;
        sb.append(sc.next());
        int temp=sb.length();
        for(int j=0; j<temp-1; j++){
        if(sb.charAt(j)==sb.charAt(j+1)){
       // sb.replace(j,j+1,"]");
        count++;
        }
        }
        sb.delete(0,sb.length());
        v.addElement(count);
        }
        for(int k=0; k<v.size(); k++){
        System.out.println(v.elementAt(k));
        }
    }
}
