/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newwork;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Newwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long grid[][]=new long[N][N];
        long sol[]=new long[N];
        for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
        grid[i][j]=sc.nextLong();
        }
        }
        int gridSize = grid.length;

		//initialise solution
		  for (int i = 0; i < gridSize; i++) 		  sol[i] = grid[i][gridSize - 1]; 		 		  for ( int i =gridSize -2; i>= 0; i--)
		  {
			  // Traverse down
			  sol[0] += grid[0][i];

			  for (int j = 1; j < gridSize; j++) 			  { 			  
                            sol[j] = Math.min(sol[j - 1] + grid[j][i], sol[j] + grid[j][i]); 			  } 		   			  //Traverse up 			  
                          for (int j = gridSize - 2; j >= 0; j--) {
			  sol[j] = Math.min(sol[j], sol[j+1] + grid[j][i]);
			  }
		  }

		  long min_value=sol[0];
		  for(int i=1;i<=gridSize-1;++i)
		  {
			  if(sol[i]<min_value)
			  min_value=sol[i];  
		  }
                  System.out.println(min_value);
    }
}
