/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingasmartide;
import java.util.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Buildingasmartide {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        String get=sc.nextLine();    
        System.out.println(get);
        }
        sc.close();
        
    }
}
