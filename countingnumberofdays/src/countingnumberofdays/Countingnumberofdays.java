/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingnumberofdays;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingnumberofdays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int months[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int lmonths[]=new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int day1=sc.nextInt();
        int month1=sc.nextInt();
        int year1=sc.nextInt();
        int day2=sc.nextInt();
        int month2=sc.nextInt();
        int year2=sc.nextInt();
        int count=0;
        int temp_date=day1;
        int month_index=month1;
        //starts count from here
        for(int j=year1; j<=year2; j++){ 
        if(j!=year1){
        month_index=1;
        count++;
        }
        if(j%400==0|(j%4==0&&j%100!=0)){//checks if the year is a leap year
        for(int i=0; i<369; i++){
        temp_date++;
        if(j==year2&&month_index==month2&&temp_date>day2){//determines where the count will end
        break;
        }
        if(temp_date>lmonths[month_index]){
        temp_date-=lmonths[month_index];//checks for a new month
        month_index++;
        }
        if(month_index>12){//checks for a new year
        break;
        }
        count++;
        
        }
        }else{
        for(int i=0; i<369; i++){
        temp_date++;
        if(j==year2&&month_index==month2&&temp_date>day2){ //determines where the count will end       
        break;
        }
        if(temp_date>months[month_index]){
        temp_date-=months[month_index];//checks for a new month
        month_index++;       
        }      
        if(month_index>12){
        break;
        }       
        count++;       
        }
        
        }
        }
        System.out.println(count);
    }
}
