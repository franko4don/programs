/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        String main="";
        for(int k=0; k<input.length(); k++){
        if(input.charAt(k)==' '){
        continue;
        }
        main+=input.charAt(k);
        }
        int number=main.length();
        //double tempheight=Math.sqrt(number);
        BigDecimal di=new BigDecimal(Double.toString(Math.sqrt(number)));
        BigDecimal d2=new BigDecimal("1");
        BigDecimal d3=di.divide(d2,0, RoundingMode.HALF_UP);
        int height=Integer.parseInt(d3.toString());
        double tempwidth=Math.ceil(Math.sqrt(number));
        int width=(int)tempwidth;
        sb.append(main);
        Vector v=new Vector();
        for(int i=0; i<height; i++){
         while(sb.length()>width){
        String temp="";
        for(int j=0; j<width; j++){
        temp+=sb.charAt(j);
        }
        sb.delete(0,temp.length());
        v.addElement(temp);
        }
        }
        int templength=sb.length();
        sb.append(repeat(" ",width-templength));
        if(sb.length()>0){
        v.addElement(sb.toString());
        }
       // System.out.println(width);
        for(int l=0; l<width; l++){
        String concat="";
        for(int m=0; m<height; m++){
        concat+=v.elementAt(m).toString().charAt(l);
        }
        ans.append(concat.trim()+" ");
        }
        System.out.println(ans.toString().trim());
       // System.out.println(tempwidth+" "+height);
    }
   public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
