/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plusminus;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Plusminus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double pos=0;
        double neg=0;
        double zero=0;
        for(int i=0; i<N; i++){
        int number=sc.nextInt();
        if(number>0){
        pos++;
        }
        if(number==0){
        zero++;
        }
        if(number<0){
        neg++;
        }
        }
        pos/=N;
        neg/=N;
        zero/=N;
        System.out.println(new BigDecimal(pos).setScale(3, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(neg).setScale(3, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(zero).setScale(3, RoundingMode.HALF_UP));
    }
}
