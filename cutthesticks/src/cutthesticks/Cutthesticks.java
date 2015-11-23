/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cutthesticks;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Cutthesticks {
       static int h;
       static int q;
       static int g;
       static int dim;
          static int []Nlength;
         static int NumberOfSticks;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       NumberOfSticks=sc.nextInt();
       Nlength=new int[NumberOfSticks];
        for(int i=0; i<NumberOfSticks; i++){
        int length=sc.nextInt(); 
        Nlength[i]=length;//stores the length of sticks in an array
        }
                System.out.println(Nlength.length);
        operate();
    }   
    
     public static void operate(){
     for(int n=0; n<Nlength.length; n++){
     h=1000;
     for(int j=0; j<NumberOfSticks; j++){ //determines the lowest length of the stick by which all others will be subtracted
     if(Nlength[j]<=h&&Nlength[j]>0){
     h=Nlength[j];       
        }
     }
     for(int k=0; k<Nlength.length; k++){
     q=Nlength[k]-h; //takes the subtracted value and stores it in the array
     if(q<0){
         q=0;
     Nlength[k]=q;}
     else{
     Nlength[k]=q;
     }

     }
     for(int m=0; m<Nlength.length; m++){   //gets the number of non-zero digit in the array
     if(Nlength[m]>0){
     dim+=1;
         }    
     }
     if(dim!=0){
     System.out.println(dim);//prints out the value if the number of non-zero digits are not zero
     dim=0;
     }
        }
}
}
