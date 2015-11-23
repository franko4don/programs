/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fixingbubblesort;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fixingbubblesort {

    /**
     * @param args the command line arguments
     */
    public static void bubble_sort (int []a,int n) {
      int i, t, s = 1;
      while (true) {
        if(s==0)break;
         s = 0;
         for (i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
               t = a[i];
               a[i] = a[i - 1];
               a[i - 1] = t;
               s = 1;
            }
           // System.out.println(Arrays.toString(a));
         }
      }
   }
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n;
        n=scan.nextInt();
        int []list=new int[n];
        for(int i=0;i<n;i++)
        {
           int x=scan.nextInt();
           list[i]=x;
        }
        bubble_sort(list,n);
        for(int i=0;i<n;i++)
         System.out.println(list[i]);
        
   }
}
