/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fridaythe13th;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fridaythe13th {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>hm=friday13();
        int T=sc.nextInt();
        for(int i=0; i<T; i++){  
        int count=0;
        int day1=sc.nextInt();
        int month1=sc.nextInt();
        int year1=sc.nextInt();
        int day2=sc.nextInt();
        int month2=sc.nextInt();
        int year2=sc.nextInt();
        for(int j=year1; j<=year2; j++){
        String obtain[]=hm.get(j).split(" ");
        if(j==year1){
        for(int k=0; k<obtain.length; k++){
        if(month1<=Integer.parseInt(obtain[k])){
        if(k==0&&day1<=13){
        count++;
        continue;
        }
        count++;
        }
        }
        continue;
        }
        
        if(j==year2){
        for(int k=0; k<obtain.length; k++){
        if(month2>=Integer.parseInt(obtain[k])){
        if(k==0&&day2>=3){
        count++;
        continue;
        }
        count++;
        }
        }
        continue;
        }
        for(int k=0; k<obtain.length; k++){       
        count++;       
        }
        }
        System.out.println(count);
        }
        
        
    }
    public static HashMap<Integer,String> friday13(){  
    int months[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int months1[]=new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int add=13;
        int m=4;
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        for(int j=1900; j<=9999; j++){
        String lookup="";
        int key=j; 
        if(add==13){
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
        if(add==13&&m!=13){       
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
        if(add==13&&m!=13){
        lookup+=Integer.toString(m)+" ";
        }
        }
        }
        hm.put(key, lookup.trim());
        m=1;
        }
     //   System.out.println(hm.get(2000));
        return hm;
    }
}
