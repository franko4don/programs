/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatefeast;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Chocolatefeast {

      static Vector vec=new Vector();
   static Scanner in;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                in= new Scanner(System.in);
       int t = in.nextInt();
      
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
            
        }
    }
    
    private static long Solve(int N, int C, int M){
         //Write code to solve each of the test over here
        vec.addElement(N); vec.addElement(C); vec.addElement(M);
               N=Integer.parseInt(vec.elementAt(0).toString());
               C=Integer.parseInt(vec.elementAt(1).toString());
               M=Integer.parseInt(vec.elementAt(2).toString());
               long a=0;
long bought=N/C;
a+=bought;
if(bought==M){a++;}
while(bought>M){
long remaining=bought%M;
bought/=M;
a+=bought;
bought+=remaining;
if(bought==M){a++;}
}
vec.clear();
        return a;
}
   
}
