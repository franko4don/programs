/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Newtonraphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println(squareroot(sc.nextInt(),sc.nextInt()));
    }
    
      public static int squareroot(int N, int P){
      int sum=0;
       for(int j=2; j<=N; j++){
       if(Math.sqrt(j)%1==0)continue;
       BigDecimal S=new BigDecimal(""+j);
       BigDecimal x=new BigDecimal(""+1);
       BigDecimal half=new BigDecimal(""+0.5);
       BigDecimal x1=null;
       for(int i=0; i<400; i++){
       x1=half.multiply(x.add(S.divide(x, P+5, RoundingMode.HALF_UP)));//*(x+(S/x));
       x=x1;
       }
       for(int k=0; k<=P; k++){
       String get=x1.toString();
       if(get.charAt(k)=='.')continue;
       sum+=Character.getNumericValue(get.charAt(k));
       }
      }
       return sum;
    }
}
