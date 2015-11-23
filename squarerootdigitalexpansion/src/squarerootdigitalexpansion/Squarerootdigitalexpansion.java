/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squarerootdigitalexpansion;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Squarerootdigitalexpansion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int P=sc.nextInt();
        long sum=0;
        BigDecimal ans;
        for(int i=2; i<=N; i++){
        if(Math.sqrt(i)%1==0){
        continue;
        }
        ans=sqrt(new BigDecimal(N),P);
        String temp=ans.toString();
        for(int j=0; j<P+1; j++){
        if(temp.charAt(j)=='.'){
        continue;
        }
        sum+=Character.getNumericValue(temp.charAt(j));
        }
        }
        System.out.println(sum);
    }
    
    public static BigDecimal sqrt(BigDecimal in, int scale){
    BigDecimal sqrt = new BigDecimal(1);
    sqrt.setScale(scale + 3, RoundingMode.FLOOR);
    BigDecimal store = new BigDecimal(in.toString());
    boolean first = true;
    do{
        if (!first){
            store = new BigDecimal(sqrt.toString());
        }
        else first = false;
        store.setScale(scale + 3, RoundingMode.FLOOR);
        sqrt = in.divide(store, scale + 3, RoundingMode.FLOOR).add(store).divide(
                BigDecimal.valueOf(2), scale + 3, RoundingMode.FLOOR);
    }while (!store.equals(sqrt));
    return sqrt.setScale(scale, RoundingMode.FLOOR);
}
}
