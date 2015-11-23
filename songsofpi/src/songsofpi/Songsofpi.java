/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package songsofpi;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Songsofpi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String test="31415926535897932384626433833";
        for(int i=0; i<=T; i++){
        String put=sc.nextLine().trim();
        if(i==0){
        continue;
        }
        String[]count=put.split(" ");
        String temp="";
        
        for(int j=0; j<count.length; j++){
        int add=count[j].length();
        temp+=Integer.toString(add);
        }
        if(temp.equals(test.substring(0,temp.length()))){
        System.out.println("It's a pi song.");
        }else{
        System.out.println("It's not a pi song.");
        
        }
        }
    }
}
