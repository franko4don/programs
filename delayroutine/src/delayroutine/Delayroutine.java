/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package delayroutine;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Delayroutine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Prescaler");
        double prescaler=sc.nextDouble();
        System.out.println("Enter Crystal Frequency (MHz)");
        double freq=sc.nextDouble();
        double value=freq/4;
        double number=1/(value*1000000);
        double second=number*prescaler*prescaler;
        System.out.println("Enter time in seconds");
        double time=sc.nextDouble();
        double count=time/second;
        int counter=(int)count;
        String get="    movlw "+"d'"+counter+"'\n"+"    movwf counter\n"+"frank:\n"+"    btfss 0bh,2\n"+"    goto frank\n"+"    bcf 0bh,2\n"+"    decfsz counter,1\n"+"    goto frank\n"+"    bcf 0bh,2\n"+"    return";
       // System.out.println("    movlw "+"d'"+counter+"'");
       // System.out.println("    movwf counter");
       // System.out.println("frank:");
       // System.out.println("    btfss 0bh,2\n"+"    goto frank\n"+"    bcf 0bh,2\n"+"    decfsz counter,1\n"+"    goto frank\n"+"    bcf 0bh,2\n"+"    return");
        //System.out.println((int)count+" "+second);
        System.out.println(get);
    }
}
