/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaj;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Problemaj {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    int speed=0;
    Vector v=new Vector();
    for(int i=0; i<T; i++){
    int n=sc.nextInt();
    v.addElement(n);
    }
    for(int j=0; j<v.size(); j++){
     int ans=Integer.parseInt(v.elementAt(j).toString());
    speed+=ans;
    if(speed<1){
    speed=0;
    }
    }
    System.out.println(speed);
}
}
