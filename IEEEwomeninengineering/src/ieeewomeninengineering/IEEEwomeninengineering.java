/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeewomeninengineering;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class IEEEwomeninengineering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector vc=new Vector();
        Vector vec=new Vector();
        int n=sc.nextInt(); 
        int m=sc.nextInt();
        String print[]=new String[]{"Intelligence","Strength","Agility"};
        String name[]=new String[n];
        String ability[]=new String[n];
        String content[]=new String[m];
        int l=0;
        int h=0;
        int p;
        int count=0;
        int[]quality=new int[n];
        String main="";
        String input[]=new String[n+1];
        for(int y=0; y<n+1; y++){
        String enter=sc.nextLine().trim();
        input[y]=enter; //stores inputs in the array
        }
        for(int i=0; i<n+1; i++){
        if(i==0)continue;
        for(int j=0; j<input[i].length(); j++){
        if(input[i].charAt(j)==','){    //seperates the string inputs
        count++;
        if(count%2!=0){
        name[l]=main;  //stores the names of the heroes in the array
        main="";
        l++;
        continue;
        }else{
        ability[h]=main; //stores the ability of the heroes in the array
        main="";
        h++;
        continue;
        }
        }
        main+=input[i].charAt(j);
        }
        int limit;
        for(limit=0; limit<main.length(); limit++){
        char comma=main.charAt(limit);
        if(comma==':'){ 
        break;
        }
        }       
        String part1=main.substring(0,limit); //seperates the two Strings that were initially sperated by semicolon
        String part2=main.substring(limit+1,main.length());
        int a=Integer.parseInt(part1); //converts the strings to integers
        int b=Integer.parseInt(part2);
        int sum=a+b;
        double fi=(100*a)/sum; //gets the winner ratio
        int first=(int)fi; //takes the integer part
        int ans=first*(i); //calculates the quality of the hero
        quality[i-1]=ans; //stores the qualities in the array
        vc.add(i-1,ans);
        main="";
        }
        int[]high=Arrays.copyOfRange(quality,0,quality.length);
        Arrays.sort(high);
        for(int b=0; b<m; b++){
        for(p=0; p<vc.size(); p++){
        if(high[n-1-b]==Integer.parseInt(vc.elementAt(p).toString())){
        break;
        }
        }
        content[b]=ability[p];
        System.out.println(name[p]); //prints out the names of heroes in decreasing order of their qualities
        vc.remove(p);
        vc.add(p,0);
       }
        int number1=0;
        int number2=0;
        int number3=0;
        for(int z=0; z<content.length; z++){
        if(content[z].equals("Agility")){
        number3++;
        }
        if(content[z].equals("Intelligence")){
        number1++;
        }
        if(content[z].equals("Strength")){
        number2++;
        }
        }
        vec.addElement(number1);//adds the number of heroes with intelligence to the vector
        vec.addElement(number2);//adds the number of heroes with strength to the vector
        vec.addElement(number3);//adds the number of heroes with agility to the vector
        System.out.println(" ");
        System.out.println("This set of heroes:");
        int total=number1+number2+number3;
        for(int t=0; t<3; t++){
        BigDecimal bd1=new BigDecimal(Integer.parseInt(vec.elementAt(t).toString())*100);
        BigDecimal bd2=new BigDecimal(total);
        BigDecimal ans=bd1.divide(bd2,2, RoundingMode.HALF_UP);//calculates the percentage and rounds it up to 2 decimal places
        System.out.println("Contains "+ans+ " percentage of "+print[t]);//prints out the percentage abilities of the pool of heroes
        }
       //System.out.println(Arrays.toString(quality));
    }
    
}
