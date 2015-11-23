/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort1;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Insertionsort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int number[]=new int[N];
        for(int i=0; i<N; i++){
        number[i]=sc.nextInt();
        }
        int temp=number[N-1];
        int j=N-2;
        while(j>=0&&number[j]>temp){
        number[j+1]=number[j];
        String get="";
        for(int m=0; m<N; m++){
        get+=number[m]+" ";
        }
        System.out.println(get.trim());
        j--;
        }
       for(int i=0; i<N; i++){
       if(number[i]>temp){
       number[i]=temp;
       String get="";
        for(int m=0; m<N; m++){
        get+=number[m]+" ";
        }
        System.out.println(get.trim());
        break;
       }
       }
        }
        
    }
