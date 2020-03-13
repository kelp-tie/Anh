import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class menu extends JFrame{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class menu
     */
    public menu()
    {
        // initialise instance variables
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("Menu");
        menuBar.add(menu1);
        JMenu menu2 = new JMenu("File");
        menuBar.add(menu2);
        JMenuItem menuItemA = new JMenuItem("Help");
        menu1.add(menuItemA);
        JMenuItem menuItemB1 = new JMenuItem("Save");
        menu2.add(menuItemB1);
        JMenuItem menuItemB2 = new JMenuItem("Load");
        menu2.add(menuItemB2);
        JMenuItem menuItemB3 = new JMenuItem("Edit");
        menu2.add(menuItemB3);
        JMenuItem menuItemB4 = new JMenuItem("Copy");
        menu2.add(menuItemB4);
        JMenuItem menuItemB5 = new JMenuItem("Paste");
        menu2.add(menuItemB5);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }

}
