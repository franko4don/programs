/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integerrighttriangles;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 * 
 */
public class Integerrighttriangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
  {
    int max = 0;
    int maxP = 0;
    for(int p = 2; p <= 1000000; p += 2)
    {
      int solution = 0;
      for(int a = 1; a < p/3; a++)      
      {
        if((p*p - 2*p*a) % (2*p - 2*a) == 0)         
          solution++;      
      }
      if(solution > max)
      {
        max = solution;
        maxP = p;
        System.out.println(maxP);
      }
    
    
    }
  }
}
