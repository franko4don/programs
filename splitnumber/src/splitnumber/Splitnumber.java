/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package splitnumber;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Splitnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<=N; i++){
        String input=sc.nextLine();
        if(i>0){
        String check[];
        if(input.contains("-")){
        check=input.split("-");
        }else{
        check=input.split(" ");
        }
        System.out.println("CountryCode="+check[0]+",LocalAreaCode="+check[1]+",Number="+check[2]);
        }
        }
    }
}
