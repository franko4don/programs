/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pizza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]names=new String[21];
        Vector v=new Vector();
        int[]calorie=new int[]{50,60,92,24,80,30,99,8,46,5,120,11,25,11,80,6,21,108,115,18,14};
names[0]="Anchovies";
names[1]= "Artichoke";
names[2]="Bacon";
names[3]="Broccoli";
names[4]="Cheese";
names[5]="Chicken";
names[6]="Feta";
names[7]="Garlic";
names[8]="Ham";
names[9]="Jalapeno";
names[10]= "Meatballs";
names[11]="Mushrooms";
names[12]="Olives";
names[13]="Onions";
names[14]="Pepperoni";
names[15]="Peppers";
names[16]="Pineapple";
names[17]="Ricotta";
names[18]="Sausage";
names[19]="Spinach";
names[20]="Tomatoes";
int combine=sc.nextInt();
String input=sc.nextLine();
int slices[]=new int[combine];
String main="";
String collect="";
int l=0;
int h=0;
int plus=0;
//input=repeat(input,2000);
           for(int i=0; i<input.length(); i++){
           if(input.charAt(i)==' ')continue;
           main+=input.charAt(i);
           }
           for(int j=0; j<main.length(); j++){
           if(Character.isDigit(main.charAt(j))){
           slices[l]=Character.getNumericValue(main.charAt(j));
           l++;
           } 
           if(j!=0&&Character.isDigit(main.charAt(j))){
           v.addElement(collect);
           collect="";continue;
           }
           if(j!=0){
           collect+=main.charAt(j);
           }
           if(j==main.length()-1){
           v.addElement(collect);
           }
           }
           String comma=String.valueOf(',');
           for(int k=0; k<v.size(); k++){
           Vector vec=new Vector();
           String top="";
           String element=v.elementAt(k).toString();
           if(element.contains(comma)==false){
           int index=Arrays.binarySearch(names,element);
           int calc=calorie[index];
           h+=slices[k]*(270+calc);
           }else{
           for(int t=0; t<element.length(); t++){
           if(element.charAt(t)==','){
           vec.addElement(top);
           top=""; continue;
           }
           top+=element.charAt(t);
           if(t==element.length()-1){
           vec.addElement(top);
           }
           }
           //System.out.println(vec);
           for(int u=0; u<vec.size(); u++){
           int index=Arrays.binarySearch(names,vec.elementAt(u).toString());
           int calc=calorie[index];
           plus+=calc;
           }
           h+=slices[k]*(270+plus);
           plus=0;
           }
           }
    
           //System.out.println(v.size());
           System.out.println("The total calorie intake is "+h);
    }
}
