/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permutate;
 import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Permutate {
   
public static void main(String args[]){
String input = "aaaaaaaabb";
String output = UniqueSubstring(input);
System.out.println("input string is "+input);
System.out.println("output string is "+output);
}
public static String UniqueSubstring(String input){
String maxSubstring ="";
String ret ="";
LinkedHashMap temp= new LinkedHashMap();
for(int i =0; i<input.length();i++){
boolean check = temp.containsKey(Character.toString(input.charAt(i)));
if (check == false) {
temp.put(Character.toString(input.charAt(i)),Character.toString(input.charAt(i)));
ret = ret + input.charAt(i);
}
else{
if(maxSubstring.length()<ret.length()) maxSubstring = ret;
int j = 0;
while(ret.charAt(j)!= input.charAt(i)){
temp.remove(Character.toString(ret.charAt(j)));
j++;
}
int pl = ret.indexOf(input.charAt(i));
ret = ret.substring(pl+1)+ input.charAt(i);
}
}
return maxSubstring;
}
}
