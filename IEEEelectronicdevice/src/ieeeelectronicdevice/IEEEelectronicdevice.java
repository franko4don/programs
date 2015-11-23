/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeeelectronicdevice;

import java.util.*;
import java.io.*;

/**
 *
 * @author FRANKCHUKY
 */
public class IEEEelectronicdevice {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        HashMap hs=new HashMap();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line1=br.readLine();
        String[]firstline=line1.split(" ");
        long N=Long.parseLong(firstline[0]);
        long M=Long.parseLong(firstline[1]);
        long K=Long.parseLong(firstline[2]);
        String line2=br.readLine();
        String main[]=line2.split(" ");
        for(int i=0; i<N; i++){
        long input=Long.parseLong(main[i]);
        hs.put(i, input);
        }
        System.out.println(hs.size());
   }
}
