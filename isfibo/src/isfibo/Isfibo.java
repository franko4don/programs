/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package isfibo;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Isfibo {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Vector v=new Vector();
     int T=sc.nextInt(); 
     String fibo[]=new String[T];
     v.addElement(0); v.addElement(1);
     for(int i=0; i<999999999; i++){
     long element1=Long.parseLong(v.elementAt(i).toString());
     long element2=Long.parseLong(v.elementAt(i+1).toString());
     long element3=element1+element2;  //generates the sequence
      if(element3>=10000000000L){
      break;
      }
     v.addElement(element3); //stores the sequences in a vector
     
     }
     for(int k=0; k<T; k++){
         long value=sc.nextLong();
     for(int j=0; j<v.size(); j++){
     if(value==Long.parseLong(v.elementAt(j).toString())){
     fibo[k]="IsFibo";  //stores "IsFibo" in an array if the value is fount in the vector
     }
     }
     }
     for(int h=0; h<fibo.length; h++){ 
         if(fibo[h]==null){
         System.out.println("IsNotFibo"); //prints out "IsNotFibo" if the string in the index is null
         continue;
         }
     System.out.println(fibo[h]); //prints out "IsFibo" if the value is in the array
     }
    }
     
}
