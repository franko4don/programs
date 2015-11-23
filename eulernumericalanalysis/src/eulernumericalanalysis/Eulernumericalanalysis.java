/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulernumericalanalysis;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Eulernumericalanalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double y=sc.nextDouble();
       double xstop=sc.nextDouble();
       double x=sc.nextDouble();
       double h=sc.nextDouble();
       
       for(int i=1; i<200; i++){
       double equation=1+(y*y);
       if(x>=xstop){
       break;
       }
       y=y+h*equation;
       x+=h;
       System.out.println(y);
       }
    }
}
