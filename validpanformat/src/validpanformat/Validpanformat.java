/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validpanformat;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Validpanformat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char one='A';
        HashMap <Character,Character> hm=new HashMap<Character,Character>();
        for(int j=0; j<26; j++){
        hm.put(one, one);
        one+=1;
        }
        //System.out.println(hm);
        for(int i=0; i<N; i++){
        String input=sc.next();
        int count=0;
        for(int k=0; k<input.length(); k++){
        if(k<5){
        if(hm.containsKey(input.charAt(k))){
        count++;
        }
        }
        if(k>4&&k<9){
        if(Character.isDigit(input.charAt(k))){
        count++;
        }
        }
        if(k==9){
        if(hm.containsKey(input.charAt(k))){
        count++;
        }
        }
        }
        if(count==10){
        System.out.println("YES");
        }else{
        System.out.println("NO");
        }
        }
    }
}
