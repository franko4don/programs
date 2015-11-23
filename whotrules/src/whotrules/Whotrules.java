/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whotrules;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Whotrules {
 static Vector<String> v;
 static Vector<String>player1;
 static Vector<String>player2;
 static Vector<String>market;
 static Vector<String>place=new Vector<String>();
 static int count=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        File names=new File("C:\\Users\\FRANKCHUKY\\Desktop\\whotnames.txt");
        Scanner sc=new Scanner(names);
        v=new Vector<String>();
        while(sc.hasNext()){
        String get=sc.nextLine();
        v.addElement(get);
        }
        ArrayList<Vector>view=share(v);
        player1=view.get(0);
        player2=view.get(1);  
        place.addElement(v.elementAt(0));
        v.removeElementAt(0);
        int determine=rules(place.elementAt(place.size()-1),player1,player2,v);
        System.out.println(view);
        //System.out.println(player2);
    }
    
    public static int rules(String top,Vector<String> first, Vector<String>second,Vector<String>afia){
    while(!first.isEmpty()&&!second.isEmpty()){
    if(count%2==0){
    boolean check=false;
    for(int i=0; i<first.size(); i++){
    check=matcher(top,first.elementAt(i));//performs a linear search on player1's whot to see if any matches the top card
    if(check==true){
    place.addElement(first.elementAt(i));
    first.removeElementAt(i);
    break;
    }
    }
    if(check==false){
    Random rd=new Random();
    int pick=Math.abs(rd.nextInt(afia.size()-1))%(afia.size()-1);
    first.addElement(afia.elementAt(pick));
    afia.removeElementAt(pick);
    }
    }else{
    boolean check=false;
    for(int i=0; i<second.size(); i++){
    check=matcher(top,second.elementAt(i));//performs a linear search on player1's whot to see if any matches the top card
    if(check==true){
    place.addElement(second.elementAt(i));
    second.removeElementAt(i);
    break;
    }
    }
    if(check==false){
    Random rd=new Random();
    int pick=Math.abs(rd.nextInt(afia.size()-1))%(afia.size()-1);
    second.addElement(afia.elementAt(pick));
    afia.removeElementAt(pick);
    }
    }
    }
    return 1;
    
    }
    
    public static ArrayList<Vector> share(Vector<String> allgames){//shares the games to the players
    Vector<String> play1=new Vector<String>();
    Vector<String> play2=new Vector<String>();
    ArrayList<Vector>al=new ArrayList<Vector>();
    Random rd=new Random();
    for(int i=0; i<4; i++){
    int first=Math.abs(rd.nextInt(allgames.size()-1))%(allgames.size());
    play1.addElement(allgames.elementAt(first));
    allgames.removeElementAt(first);
    int second=Math.abs(rd.nextInt(allgames.size()-1))%(allgames.size());   
    play2.addElement(allgames.elementAt(second));
    allgames.removeElementAt(second);
    }
    al.add(play1);
    al.add(play2);
    v=allgames;
    return al;
    }
    
    //here the rules of the game is defined and the game is played recursively
   
    public static boolean matcher(String main,String compare){//matches the games to see if a player has the whot value
    String submain1=main.substring(main.length()-6, main.length()-4);
    String submain2=main.substring(0, main.length()-6);
    String subcomp1=compare.substring(compare.length()-6, compare.length()-4);
    String subcomp2=main.substring(0, compare.length()-6);
    if(submain1.equals(subcomp1)|submain2.equals(subcomp2)){
    return true;
    }else{
    
    return false;
    }
    }
    
    public static void Pick2(Vector play){
    
    }
}
