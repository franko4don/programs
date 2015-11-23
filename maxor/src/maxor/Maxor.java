/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxor;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Maxor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc=new Scanner(System.in);
     int b1=sc.nextInt(); int numbers=0;
     int b2=sc.nextInt(); Vector v=new Vector();
     int c;
     for(int i=b1; i<=b2; i++){   
     for(int j=i; j<=b2; j++){
     c=i^j;
     v.addElement(c);
     }
     }
     for(int k=0; k<v.size(); k++){
     if(Integer.parseInt(v.elementAt(k).toString())>=numbers)
     numbers=Integer.parseInt(v.elementAt(k).toString());
     }
     System.out.println(numbers); 

          }

    }
