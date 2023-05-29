
import org.w3c.dom.css.RGBColor;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame  {
   static public int whatWillBeColor;
  static public   int witchRowWeAre;
    static Drawing dc;

    public static void main(String[] args) {
        whatWillBeColor = 39 ;
        witchRowWeAre  = 39  ;
        int w = 850;
        int h = 850;
        JFrame jFrame =  new JFrame();
        dc = new Drawing(w,h);
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
        // przyciks do zatwierdzania wyboru
        JButton confirmButton = new JButton("Potwierdz");
        confirmButton.setSize(100,40);
        confirmButton.setLocation(400,380);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                witchRowWeAre = witchRowWeAre - 4;
                whatWillBeColor = witchRowWeAre ;
            }
        });
        jFrame.add(confirmButton);
        // przyciski do kolorow
        JButton[] tabelsOfCollors = new JButton[8];
        tabelsOfCollors[0] = new JButton("Czerwony");
        tabelsOfCollors[0].setBackground(Color.RED);
        tabelsOfCollors[1] = new JButton("Pomarańczowy");
        tabelsOfCollors[1].setBackground(Color.ORANGE);
        tabelsOfCollors[2] = new JButton("Żółty");
        tabelsOfCollors[2].setBackground(Color.YELLOW);
        tabelsOfCollors[3] = new JButton("Zielony");
        tabelsOfCollors[3].setBackground(Color.GREEN);
        tabelsOfCollors[4] = new JButton("Niebieski");
        tabelsOfCollors[4].setBackground(Color.BLUE);
        tabelsOfCollors[5] = new JButton("Różowy");
        tabelsOfCollors[5].setBackground(Color.pink);
        tabelsOfCollors[6] = new JButton("Fioletowy");
        tabelsOfCollors[6].setBackground(Color.magenta);
        tabelsOfCollors[7] = new JButton("Cyjan");
        tabelsOfCollors[7].setBackground(Color.CYAN);

        int x = 400;
        int y = 500;

        //robimy tabele kolorow
        for (int i = 0; i < 8; i++) {
       tabelsOfCollors[i].setSize(100,40);
       if(i==4){x = 400;}
       if(i > 3){
           tabelsOfCollors[i].setLocation(x,y);
       }else {

           tabelsOfCollors[i].setLocation(x ,y+40);
       }
       x = x + 100;
       tabelsOfCollors[i].addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               switch (e.getActionCommand()){
                   case "Czerwony":
                       dc.PaintBall(whatWillBeColor  , 0 ,Color.red);
                       jFrame.repaint();
                       break;
                   case "Pomarańczowy":
                       dc.PaintBall(whatWillBeColor ,0,Color.ORANGE);
                       jFrame.repaint();
                       break;
                   case "Żółty":
                       dc.PaintBall(whatWillBeColor ,0,Color.YELLOW);
                       jFrame.repaint();
                       break;
                   case "Zielony":
                       dc.PaintBall(whatWillBeColor ,0,Color.GREEN);
                       jFrame.repaint();
                       break;
                   case "Niebieski":
                       dc.PaintBall(whatWillBeColor ,0,Color.BLUE);
                       jFrame.repaint();
                       break;
                   case "Różowy":
                       dc.PaintBall(whatWillBeColor ,0,Color.PINK);
                       jFrame.repaint();
                       break;
                   case "Fioletowy":
                       dc.PaintBall(whatWillBeColor ,0,Color.magenta);
                       jFrame.repaint();
                       break;
                   case "Cyjan":
                       dc.PaintBall(whatWillBeColor ,0,Color.CYAN);
                       jFrame.repaint();
                       break;

                   default:
                       System.out.println("Cos poszło nie ta");


               }
           }
       });

       jFrame.add(tabelsOfCollors[i]);
        }
        //tablica przyciskow
        x= 400;
        y = 420;
        JButton[] tableOfChose = new JButton[4];
        for (int i = 0; i < 4; i++) {
            tableOfChose[i] = new JButton("nr: " + (i+1) );
            tableOfChose[i].setSize(100,80);
            tableOfChose[i].setLocation(x,y);

            x = x + 100;
            tableOfChose[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println( e.getActionCommand()) ;
                    String a = e.getActionCommand();
                    whatWillBeColor = witchRowWeAre -  Integer.parseInt(String.valueOf(a.charAt(4))) + 1 ;
                    System.out.println(whatWillBeColor);
                }
            });


            jFrame.add(tableOfChose[i]);
        }




        jFrame.setSize(w,h);
        jFrame.setTitle("ZAD 18 MasterMind");
        jFrame.add(dc);

        jFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        jFrame.setVisible(true);



      Drawing cos = new Drawing(100,100);
}


}