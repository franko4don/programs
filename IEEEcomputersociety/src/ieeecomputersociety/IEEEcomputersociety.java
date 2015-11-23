/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeecomputersociety;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class IEEEcomputersociety {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        HashSet hs=new HashSet();
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        for(int i=0; i<input.length(); i++){
        String main="";
        for(int j=0; j<sb.length(); j++){
        main+=sb.charAt(j);
        System.out.println(main);
        StringBuilder test=new StringBuilder();
        test.append(main);
        String pali=test.reverse().toString();
        if(main.equals(pali)){
        hs.add(main.length());
       // System.out.println(main);
        }
        }
        sb.deleteCharAt(0);
        }
      // System.out.println(hs);
    }
}
