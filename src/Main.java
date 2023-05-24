
import  javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int w = 650;
        int h = 650;
        JFrame f =  new JFrame();
        Drawing dc = new Drawing(w,h);
        //create a menu up
        JMenuBar menuBar= new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu exit = new JMenu("Exit");
        JMenuItem size = new JMenuItem("Ator");
        menu.add(size);

        menuBar.add(menu);
        menuBar.add(exit);

        f.setJMenuBar(menuBar);




        f.setSize(w,h);
        f.setTitle("ZAD 18 MasterMind");
        f.add(dc);

        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setVisible(true);



      Drawing cos = new Drawing(100,100);
}
}