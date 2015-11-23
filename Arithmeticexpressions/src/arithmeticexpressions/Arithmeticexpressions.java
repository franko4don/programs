/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexpressions;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Arithmeticexpressions {

    /**
     * @param args the command line arguments
     */
  
 
    
 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int T = scanner.nextInt();

      for (int t = 0; t < T; t++) {
         long l = scanner.nextLong();
         long r = scanner.nextLong();
         long res = 0;
         for (long i = 0; i < 32; i++) {
            if ((r - l + 1 == 1))
               if(l%2==1)
                res=l&r;
            
            l >>= 1; r >>= 1;
       //  break;
           
         }
          System.out.println(res);
      }

      scanner.close();
   }
}
