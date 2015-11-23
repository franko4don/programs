/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsundays;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingsundays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        countsundays();
        
    }
    public static void countsundays(){
    Scanner sc=new Scanner(System.in);
        int months[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int months1[]=new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int add=7;
        HashMap<Long,String>hm=new HashMap<Long,String>();
        for(int j=1900; j<2300; j++){
        String lookup="";
        int m=1;
        long key=j%400; 
        if(add==1){
        lookup+=Integer.toString(m)+" ";
        hm.put(key, lookup.trim());
        }
        if(key==0||(j%4==0&&j%100!=0)){
        while(m<13){
        add+=7;        
        if(add>months1[m]){
        add-=months1[m];
        m++;
        }
        if(add==1&&m!=13){       
        lookup+=Integer.toString(m)+" ";    
        }
        }
        }else{
        while(m<13){    
        add+=7;       
        if(add>months[m]){
        add-=months[m];
        m++;
        }     
        if(add==1&&m!=13){
        lookup+=Integer.toString(m)+" ";
        }
        }
        }
        hm.put(key, lookup.trim());
        }
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long year1=sc.nextLong();
        int count=0;
        int month1=sc.nextInt();
        int day1=sc.nextInt();
        long year2=sc.nextLong();
        int month2=sc.nextInt();
        int day2=sc.nextInt();
        for(long k=year1; k<=year2; k++){
        long get=k%400;
        int compare;
        String obtain=hm.get(get);
        String store[]=obtain.split(" ");
        for(int l=0; l<store.length; l++){  
        compare=Integer.parseInt(store[l]);
        
        }
        }
        System.out.println(count);
        }
    }
}
