
import org.w3c.dom.css.RGBColor;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends JFrame  {
   static public int whatWillBeColor;
  static public   int witchRowWeAre;
    static Drawing dc;
    static boolean easyMode ;
 static    int corretCollor ;
   static int corretCollorAndLocasion ;

    public static void main(String[] args) {
        corretCollorAndLocasion =  0;
        corretCollor = 0;
        whatWillBeColor = 39 ;
        witchRowWeAre  = 39  ;
        easyMode = true;
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
        Color[] tabOfCode = new Color[4];
        //znajdz 4 kulku kodu:
        if (easyMode){

                tabOfCode[0] = randomColor();
                System.out.println(tabOfCode[0]);
                tabOfCode[1] = randomColor(tabOfCode[0]);
                System.out.println(tabOfCode[1]);
                tabOfCode[2] = randomColor(tabOfCode[0],tabOfCode[1]);
                System.out.println(tabOfCode[2]);
                tabOfCode[3] = randomColor(tabOfCode[0],tabOfCode[1],tabOfCode[2]);
                System.out.println(tabOfCode[3]);

        }
        else {
            //tu bedzie wersja dla powtarzających się kolorow
        }


        jFrame.setJMenuBar(menuBar);
        // add butons
        // przyciks do zatwierdzania wyboru
        JButton confirmButton = new JButton("Potwierdz");
        confirmButton.setSize(100,40);
        confirmButton.setLocation(400,380);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                //glówna logika gry
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if(tabOfCode[i] == dc.tablesBalls[witchRowWeAre - j  ].returColor()){
                            System.out.println("JEJ TAKIE SAM KOLOR");
                            corretCollor++;
                            dc.PaintBall(witchRowWeAre-x  , 1 ,Color.red);
                            x++;
                            jFrame.repaint();
                            break;
                        }
                    }

                }
                x = 0;
                for (int i = 0; i < 4; i++) {
                    if(tabOfCode[i] == dc.tablesBalls[witchRowWeAre-i ].returColor()){
                        System.out.println("WOWOWOW TAKIE SAM KOLOR i miejsce ");
                        corretCollor--;
                        corretCollorAndLocasion++;
                        dc.PaintBall(witchRowWeAre-x  , 1 ,Color.GREEN);
                        jFrame.repaint();

                    }
                }
            System.out.println("corretCollor = "+corretCollor);
            System.out.println("corretCollorAndLocasion = "+corretCollorAndLocasion);

            if(corretCollorAndLocasion == 4){
                System.out.println("JEJEJ WYGRALES GRE");
                for (int i = 0; i < 4; i++) {
                    dc.PaintBall(i  , 0 ,tabOfCode[i]);
                    jFrame.repaint();
                }

            }

                corretCollor = 0;
                corretCollorAndLocasion = 0;
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
                    whatWillBeColor = witchRowWeAre - (4 - Integer.parseInt(String.valueOf(a.charAt(4))))  ;
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

    public static Color randomColor(Color... exept) {
        Color returnet = Color.gray;
        boolean isOk = true;
        while (isOk) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 8);
            switch (randomNum) {
                case 1:
                    returnet = Color.red;

                    break;
                case 2:
                    returnet = Color.ORANGE;

                    break;
                case 3:
                    returnet = Color.YELLOW;

                    break;
                case 4:
                    returnet = Color.GREEN;

                    break;
                case 5:
                    returnet = Color.BLUE;

                    break;
                case 6:
                    returnet = Color.PINK;

                    break;
                case 7:
                    returnet = Color.magenta;

                    break;
                case 8:
                    returnet = Color.CYAN;

                    break;

                default:
                    System.out.println("Cos poszło nie ta");


            }
            isOk = false;
            for (Color e :exept
                 ) {
                if(e == returnet){
                    isOk = true;
                }
            }

        }

        return returnet;
    }}