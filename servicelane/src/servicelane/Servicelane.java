/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicelane;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.lang.reflect.Array;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Servicelane {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       int  N=sc.nextInt(); 
       int[]dim=new int[N];
       int T=sc.nextInt(); 
        int array;
       for(int i=0; i<dim.length; i++){
       array=sc.nextInt(); 
       if(array>3||array<1){
       System.err.println("Error, max value is 3  ");
       System.exit(0);
       }else{ 
       dim[i]=array;
        }
       }
       int[][]index=new int[T][2];
for(int k=0; k<T; k++){
index[k][0]=sc.nextInt(); index[k][1]=sc.nextInt();
}
          for(int h=0; h<T; h++){
System.out.println(vehicle(index[h][0],index[h][1],dim));
}
    }
            public static int vehicle(int i,int j,int[]N){
            int vehicles=3;
            for(int k=i; k<=j; k++){
            if(N[k]<vehicles)
            
            {vehicles=N[k];
            }
            }
        return vehicles;
        }
  
}