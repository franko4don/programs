/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pandigitalproducts;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pandigitalproducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap hm=new HashMap();
        int N=sc.nextInt();
        long sum=0;
        String check[]=new String[N];
        String main="";
        for(int i=0; i<check.length; i++){
        check[i]=Integer.toString(i+1);
        main+=Integer.toString(i+1);
        }
        StringBuilder sb=new StringBuilder();
        sb.append(main);
        int raw=Integer.parseInt(sb.reverse().toString());
        
        double get=Math.sqrt(raw);
        int count=(int)get;
        for(int j=1; j<=count; j++){
        for(int k=1; k<=count; k++){
        long product=j*k;
        String first=Integer.toString(j);
        String second=Integer.toString(k);
        String third=Long.toString(product);
        String addup=first+second+third;
        if(addup.length()==N){
        int num=0;
        for(int x=0; x<check.length; x++){
        if(addup.contains(check[x])){
        num++;
        }
        }
        if(num==N){
        if(!hm.containsKey(product)){
        hm.put(product,j);
        sum+=product;
        }
        }
        }
        }
        }
        System.out.println(sum);
    }
}
