/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manasalovesmaths;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Manasalovesmaths {

    /**
     aim is to check if a number is divisible by 8
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int T=sc.nextInt();
        for(int r=0; r<T; r++){
        String get=sc.next();
        if(get.length()==1){
        if(Integer.parseInt(get)==8||Integer.parseInt(get)==0){
        v.addElement("YES");
        }else{
        v.addElement("NO");
        }
        }
        if(get.length()==2){
        StringBuilder sb=new StringBuilder();
        sb.append(get);
        String calc=sb.reverse().toString();
        if(Integer.parseInt(get)%8==0||Integer.parseInt(calc)%8==0){
        v.addElement("YES");
        }else{
        v.addElement("NO");
        }
        }   
        int control=0;
        if(get.length()>2){      
        int numbers[]=new int[]{104,112,120,128,136,144,152,160,168,176,184,192,200,208,216,224,232,240,248,256,264,272,280,288,296,304,312,320,328,336,344,352,360,368,376,384,392,400,408,416,424,432,440,448,456,464,472,480,488,496,504,512,520,528,536,544,552,560,568,576,584,592,600,608,616,624,632,640,648,656,664,672,680,688,696,704,712,720,728,736,744,752,760,768,776,784,792,800,808,816,824,832,840,848,856,864,872,880,888,896,904,912,920,928,936,944,952,960,968,976,984,992};
        for(int i=0; i<numbers.length; i++){
        StringBuilder sb2=new StringBuilder();
        sb2.append(get);
        int count=0;
        char val[]=Integer.toString(numbers[i]).toCharArray();
        for(int l=0; l<3; l++){
        for(int k=0; k<sb2.length(); k++){
        if(val[l]==sb2.charAt(k)){
        count++;
        sb2.deleteCharAt(k);
        break;
        }
        }
        }
        if(count==3){
        control++;
        break;
        }
        }
        if(control>0){
        v.addElement("YES");
        }else{
        v.addElement("NO");
        }
        }
    }
        for(int g=0; g<v.size(); g++){
        System.out.println(v.elementAt(g));
        }
    }
}
