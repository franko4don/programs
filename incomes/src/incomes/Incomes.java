/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package incomes;
import java.util.*;
import java.math.*;
import javax.swing.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Incomes {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });  
        
    }
    private static void createAndShowGUI() {
        System.out.println(SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(650,850);
        f.setVisible(true);
    }
}
