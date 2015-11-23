/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANKCHUKY
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.Icon;
public class image extends Component{
  static BufferedImage img;
@Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public image() {
       try {
           img = ImageIO.read(new File("src\\res\\circle12.jpg"));
       } catch (IOException e) {
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
    public static void main(String[] args){
    JFrame f = new JFrame("Load Image Sample");
    JButton jb=new JButton(""); 
    ImageIcon ic=new ImageIcon("src\\res\\circle12.jpg");
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

       // f.add(new image());
      //  f.pack();
        jb.setIcon(ic);
        
        f.add(jb);
        f.pack();
        f.setVisible(true);
    }
}
