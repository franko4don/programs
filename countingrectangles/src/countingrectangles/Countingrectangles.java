/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingrectangles;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingrectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
            int error = Integer.MAX_VALUE;
            int closestarea = 0;
            int target =sc.nextInt();
            int x = (int)Math.sqrt(target+600);
            int y = 1;

            while (x >= y) {
                int rects = x * (x + 1) * y * (y + 1) / 4;
                                
                if (error > Math.abs(rects - target)) {
                    closestarea = x * y;
                    error = Math.abs(rects - target);
                }
                                
                if (rects > target)
                    x--;
                 else                     
                    y++;                                   
            } 
            System.out.println(closestarea);
        }
    }
}
