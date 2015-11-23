/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Target {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int N=sc.nextInt();
        double number[]=new double[K];
        for(int i=0; i<number.length; i++){
        number[i]=sc.nextDouble();
        }
        Arrays.sort(number);
        long sum=0;
        for(int j=0; j<N; j++){
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double position=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        int get=find(number,position,number.length-1);
        sum+=K-get;
        System.out.println(get+" pos  "+position);
        }
        System.out.println(sum);
    }
    
 public static int find(double array[],double key,int size){
    int start=0;
    int end=size;
    boolean found=true;
    while(found){
    if(end==0)return 0;
    if(key>array[array.length-1])return array.length;
    if(array[end]==key){
    return end;
    }
    if(array[end]>key){ 
    if(key>array[end-1]){
     System.out.println(key+"  greater "+end);
    return end;
    }
    start=end;
    end/=2;
    
    }else{
    if(array[end]<key){
    if(array[end+1]>key){
    System.out.println(key+" smaller "+end);
    return end+1;
    }
    end=(end+start)/2;   
    }
    }
    }
    return 1;
    }
}
