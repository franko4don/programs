/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablenumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Amicablenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int amicable[]=new int[]{220,284,1184,1210,2620,2924,5020,5564,6232,6368,10744,10856,12285,14595,17296,18416,63020,66928,66992,67095,69615,71145,76084,79750,87633,88730};
    int sums[]=new int[]{220,504,1688,2898,5518,8442,13462,19026,25258,31626,42370,53226,65511,80106,97402,115818,178838,245766,312758,379853,449468,520613,596697,676447,764080,852810};
    int T=sc.nextInt();
    for(int i=0; i<T; i++){
    int N=sc.nextInt();
    if(N<220){
    System.out.println(0);
    continue;
    }
    for(int j=amicable.length-1; j>=0; j--){
    if(amicable[j]<N){
    System.out.println(sums[j]);
    break;
    }
    }
    }   
}
}
