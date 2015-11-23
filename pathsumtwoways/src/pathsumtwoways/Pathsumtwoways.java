/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pathsumtwoways;
import java.util.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pathsumtwoways {

    /**
     * @param args the command line arguments
     */
	
	
	public static void main(String args[]) throws Exception{
	Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long grid[][]=new long[N][N];
        int gridSize=grid.length;
        for(int i=0;i<N; i++){
        for(int j=0; j<N; j++){
        grid[i][j]=sc.nextInt();
        }
        }
            for (int index = gridSize - 2; index >= 0; index--) {
              grid[gridSize - 1][index] += grid[gridSize - 1][index+1];
              grid[index][gridSize - 1] += grid[index+1] [gridSize - 1];  
          }
          
           System.out.println("\n");
          for (int index = gridSize - 2; index >= 0; index--) 
          {
              for (int innerIndex = gridSize - 2; innerIndex >= 0; innerIndex--) 
              {
            	  grid[index][innerIndex] += Math.min(grid[index + 1][innerIndex], grid[index][innerIndex + 1]); 
              }
               
             }
		
        
       
	}
}
