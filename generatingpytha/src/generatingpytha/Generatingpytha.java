/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generatingpytha;
import java.math.*;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Generatingpytha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector va=new Vector();
        Vector vb=new Vector();
        Vector vc=new Vector();
        Vector sum=new Vector();
        Vector multiply=new Vector();
        Vector answer=new Vector();
        for(int i=0; i<T; i++){
        int count=0;
        long high=0;
        int N=sc.nextInt();
        for(int m=1; m<40; m++){
        for(int n=1; n<m; n++){
        double a1=Math.abs((Math.pow(m,2))-(Math.pow(n,2)));
        long a=(long)a1;
        long b=2*m*n;
        double c1=Math.abs((Math.pow(m,2))+(Math.pow(n,2)));
        long c=(long)c1;
        va.addElement(a);
        vb.addElement(b);
        vc.addElement(c);
        sum.addElement(a+b+c);
        multiply.addElement(a*b*c);
        System.out.println(a+" "+b+" "+c);
        /**if(a+b+c==N){
        if(a*b*c>high){high=a*b*c;}
        count++;
        long times=a*b*c;
        }*/
        }
        
       // if(count==0){
       // answer.addElement(-1);
       // break;
       // }
      //  }
        }
        answer.addElement(high);
        }
       // for(int x=0; x<answer.size(); x++){
       // System.out.println(answer.elementAt(x));
       // }
    }
}
