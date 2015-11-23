/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcollatzsequence;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestcollatzsequence {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
        int longest[]=new int[]{1,2,3,6,7,9,18,19,25,27,54,55,73,97,129,171,231,235,313,327,649,654,655,667,703,871,1161,2223,2322,2323,2463,2919,3711,6171,10971,13255,17647,17673,23529,26623,34239,35497,35655,52527,77031,106239,142587,156159,216367,230631,410011,511935,626331,837799,1117065,1126015,1501353,1564063,1723519,2298025,3064033,3542887,3732423};
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        for(int j=0; j<longest.length; j++){
        if(longest[j]>N){
        System.out.println(longest[j-1]);
        break;
        }
        }
        }
   }
}
