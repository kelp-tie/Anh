import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main extends JFrame
{

    /**
     * Constructor for objects of class main
     */
    public main()
    {
        // initialise instance variables
       Scanner myScanner = new Scanner(System.in);
       System.out.println("type in name and dimension of window");
       setTitle(myScanner.nextLine());
       int x = myScanner.nextInt(); int y = myScanner.nextInt();
       this.getContentPane().setPreferredSize(new Dimension(x, y));
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       this.pack();
       this.toFront();
       this.setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}
