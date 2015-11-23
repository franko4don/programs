/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;
import java.io.*;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Fileread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\FRANKCHUKY\\Desktop\\java progs\\fileread\\test.txt");
        File numb=new File("pytha.txt");
        int count=0;
        numb.createNewFile();
        FileWriter fw=new FileWriter(numb);
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
        String line=sc.nextLine();
        fw.flush();
        fw.write(line+" ");        
        }
        System.out.println(count);
    }
}
