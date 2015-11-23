/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitfactorialchains;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Digitfactorialchains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long factorials[]=new long[]{1,1,2,6,24,120,720,5040,40320,362880};     
       HashMap <Long,Long>answer=new HashMap<Long,Long>();
       HashMap <Long,Long>checker=new HashMap<Long,Long>();
       checker.put(169L,3L);
       checker.put(363601L,3L);
       checker.put(1454L,3L);
       checker.put(871L,2L);
       checker.put(45361L,2L);
       checker.put(45362L,2L);
       checker.put(872L,2L);
       for(long i=0; i<=1000000; i++){
       HashMap <Long,Long>hm=new HashMap<Long,Long>();
       long number=i;
       long count=0;
       int check=0;
       if(checker.containsKey(i)){
       answer.put(i, checker.get(i));
       continue;
       }
       hm.put(number, count);
       for(int m=0; m<60; m++){
       long sum=0;
       char[]operate=(""+number).toCharArray();
       for(int j=0; j<operate.length; j++){
       sum+=factorials[Character.getNumericValue(operate[j])];
       }
       number=sum;
       count++;
       if(checker.containsKey(sum)){
       count+=checker.get(sum);
       break;
       }
       if(hm.containsKey(sum)){
       break;
       }    
       if(answer.containsKey(sum)){
       answer.put(i, count+answer.get(sum));
       check++;
       break;
       }
       hm.put(number, sum);
       
       }
       if(check==0){
       answer.put(i, count);
       }
       }
       
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       StringBuilder sb=new StringBuilder();
       int N=sc.nextInt();
       long size=sc.nextLong();
       for(long j=0; j<=N; j++){
       if(answer.get(j)==size){
       sb.append(j).append(" ");
       }
       }
       if(sb.length()!=0){
       System.out.println(sb.toString().trim());
       }else{
       System.out.println(-1);
       }
       }
       //System.out.println(answer.get(196L));
    }
       
    }