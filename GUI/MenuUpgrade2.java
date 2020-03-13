import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;
import java.awt.event.*;
/**
 * Write a description of class MenuUpgrade2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuUpgrade2 extends JFrame implements ActionListener{
    // instance variables - replace the example below with your own
    Scanner myScanner = new Scanner(System.in);
    int x = myScanner.nextInt();
    int y = myScanner.nextInt();
    String string1= myScanner.nextLine();
    Canvas myCanvas;
    final String filename= "blueRect.png";
    ImageIcon img= new ImageIcon(filename);
    public void paint (Graphics g){
        super.paint(g);
        img.paintIcon(this,g,x,y);
    }

    /**
     * Constructor for objects of class MenuUpgrade2
     */

    public void actionPerformed(ActionEvent event){
        String cmd=event.getActionCommand();

        switch(cmd){
            case "Help": System.out.println("How can I help you?...Error..error.Terminating request...Request terminated. how can I help you?");
            break;
            case "Info": System.out.println("This is a blank screen with a menu bar. That's it. What do you want from me?");
            break;
            case "Quit": System.exit(0); 
            break;
            case "Copy": System.out.println("Copying... Unsuccessful. Try selecting a text");
            break;
            case "Paste": System.out.println("Pasting... Unsuccessful. Did you copy anything first?");
            break;
            case "Save": System.out.println("Saving... Unsuccessful. D.d..data corrupted...");
            break;
            case "Load": System.out.println("Loading... Unsuccessful. There's nothing to load");
            break;
            case "Edit": System.out.println("Editing... Unsuccessful. Please purchase the editing tools DLC for 29.99$");
            Dialog();
            break;
            case "Poke": System.out.println("stop it... >:(");
            break;
            default: System.out.println("this function hasn't been implemented yet");
        }
    }

    void Dialog(){
        System.out.println("where do you want the box to appear?");
        JDialog Box2 = new JDialog(this);
        Box2.setBounds(x,y,150,70);
        TextArea area2 = new TextArea("Credit card number");
        Box2.add(area2);
        Box2.toFront();
        Box2.setVisible(true);
        Box2.setTitle("Confirm payment");
    }

    public MenuUpgrade2()
    {
        // initialise instance variables
        System.out.println("type in name and dimension of window");
        setTitle(myScanner.nextLine());
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        this.getContentPane().setPreferredSize(new Dimension(x, y));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Menu bar
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        // menu
        JMenu menu1 = new JMenu("Menu");
        menuBar.add(menu1);
        JMenu menu2 = new JMenu("File");
        menuBar.add(menu2);
        JMenu menu3 = new JMenu("Tools");
        menuBar.add(menu3);

        // menu items for menu1
        JMenuItem menuItemA1 = new JMenuItem("Help");
        menuItemA1.setAccelerator(KeyStroke.getKeyStroke('h'));
        menuItemA1.addActionListener(this);
        menu1.add(menuItemA1);

        JMenuItem menuItemA2 = new JMenuItem("Info");
        menuItemA2.addActionListener(this);
        menuItemA2.setAccelerator(KeyStroke.getKeyStroke('i'));
        menu1.add(menuItemA2);

        JMenuItem menuItemA3 = new JMenuItem("Quit");
        menuItemA3.addActionListener(this);
        menuItemA3.setAccelerator(KeyStroke.getKeyStroke('q'));
        menu1.add(menuItemA3);

        // menu items for menu2
        JMenuItem menuItemB1 = new JMenuItem("Save");
        menuItemB1.addActionListener(this);
        menuItemB1.setAccelerator(KeyStroke.getKeyStroke('s'));
        menu2.add(menuItemB1);

        JMenuItem menuItemB2 = new JMenuItem("Load");
        menuItemB2.addActionListener(this);
        menuItemB2.setAccelerator(KeyStroke.getKeyStroke('l'));
        menu2.add(menuItemB2);

        JMenuItem menuItemB3 = new JMenuItem("Edit");
        menuItemB3.addActionListener(this);
        menuItemB3.setAccelerator(KeyStroke.getKeyStroke('e'));
        menu2.add(menuItemB3);
        // menu items for menu3
        JMenuItem menuItemC1 = new JMenuItem("Copy");
        menuItemC1.addActionListener(this);
        menuItemC1.setAccelerator(KeyStroke.getKeyStroke('c'));
        menu3.add(menuItemC1);

        JMenuItem menuItemC2 = new JMenuItem("Paste");
        menuItemC2.addActionListener(this);
        menuItemC2.setAccelerator(KeyStroke.getKeyStroke('p'));
        menu3.add(menuItemC2);

        JMenuItem menuItemC3 = new JMenuItem("Poke");
        menuItemC3.addActionListener(this);
        menuItemC3.setAccelerator(KeyStroke.getKeyStroke('`'));
        menu3.add(menuItemC3);

        this.pack();
        this.toFront();
        this.setVisible(true);
    }
}
