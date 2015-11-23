/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitfun;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Digitfun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       while(sc.hasNext()){
       String get=sc.next();
       if(get.equals("END"))break;
       System.out.println(ivalue(get));
       }
    }
    
    public static int ivalue(String operate){
    int position=1;
    String A0=operate;
    String A1=Integer.toString(A0.length());
    while(!A0.equals(A1)){
    position++;
    A0=A1;
    A1=Integer.toString(A0.length());
    }
        return position;
    }
}
