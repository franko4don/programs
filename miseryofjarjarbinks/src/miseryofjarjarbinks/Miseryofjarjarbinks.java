/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miseryofjarjarbinks;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Miseryofjarjarbinks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String value[]=new String[N];
        for(int i=0; i<N; i++){
        String get=sc.nextLine();
        value[i]=get;
        }
        System.out.println(pairofshoes(value));
    
    }
    public static int pairofshoes(String process[]){
    Vector<String>v=new Vector<String>();
    int count=0;
    v.addElement(process[0]);
    for(int j=1; j<process.length; j++){
    String operate=process[j];
    int check=0;
    for(int i=0; i<v.size(); i++){
    if(operate.substring(0, operate.length()-1).equals(v.elementAt(i).substring(0, v.elementAt(i).length()-1))){
    if(operate.charAt(operate.length()-1)!=v.elementAt(i).charAt(v.elementAt(i).length()-1)){
    count++;
    check++;
    v.removeElementAt(i);
    break;
    }
    }
    }
    if(check==0)v.addElement(operate);
    }
    return count;
    }
}
