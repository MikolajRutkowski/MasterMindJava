
import  javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int w = 650;
        int h = 650;
        JFrame jFrame =  new JFrame();
        Drawing dc = new Drawing(w,h);
        //create a menu up
        JMenuBar menuBar= new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu exit = new JMenu("Exit");
        JMenuItem size = new JMenuItem("Ator");
        menu.add(size);

        menuBar.add(menu);
        menuBar.add(exit);

        jFrame.setJMenuBar(menuBar);
        // add butons
        JButton BlueButton = new JButton("Niebieski");
        BlueButton.setBackground(Color.BLUE);
        BlueButton.setSize(50,30);
        BlueButton.setLocation();
        jFrame.add(BlueButton);


        jFrame.setSize(w,h);
        jFrame.setTitle("ZAD 18 MasterMind");
        jFrame.add(dc);

        jFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        jFrame.setVisible(true);



      Drawing cos = new Drawing(100,100);
}
}