/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manasaandstones;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Manasaandstones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int count=sc.nextInt();
        int a=sc.nextInt();
        int temp;
        int b=sc.nextInt();
        int get=Math.abs(a-b);
        if(a>b){
        temp=b*(count-1);
        }else{
        temp=a*(count-1);
        }
        StringBuilder sb=new StringBuilder();
        if(a==b){
        System.out.println(temp);
        continue;
        }
        for(int j=1; j<=count; j++){
        sb.append(temp).append(" ");
        temp+=get;
        }
        System.out.println(sb.toString().trim());
        }
}
}
