/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mirror;
import java.util.*;
import java.util.regex.Pattern;
/**
 *
 * @author FRANKCHUKY
 */
public class Mirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[^0-9]*[12]?[0-5]{1,2}[^0-9]*.[^0-9]*[12]?[0-5]{1,2}[^0-9]*.[^0-9]*[12]?[0-5]{1,2}[^0-9]*.[^0-9]*[12]?[0-5]{1,2}[^0-9]*");
        for(int i=0; i<12; i++){
        if(p.matcher(sc.next()).matches()){
        System.out.println("true");
        }else{
        System.out.println("false");
        }
        }
    }
}
