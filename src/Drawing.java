import  java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Drawing extends JComponent{

    private int width ;
    private  int height ;
    int howmanyballs = 40;
    Ball[] tablesBalls = new Ball[howmanyballs];

public Drawing(int w,int h){
   width = w;
   height = h;
   int StarX = 50;
   int StarY = 50;
    for (int i = 0; i < howmanyballs; i++) {
        tablesBalls[i] = new Ball(StarX,StarY,Color.MAGENTA);
        StarX = StarX + 50;
        if(StarX == 250){
            StarY = StarY + 50;
            StarX = 50 ;
        }
        
    }
}
protected  void  paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;


    g2d.drawLine(50,50,50,550);
    g2d.drawLine(250,50,250,550);
    g2d.drawLine(50,50,250,50);
    g2d.drawLine(50,550,250,550);
    //g2d.setColor(Black);


    for (Ball i : tablesBalls
         ) {
        g2d.fill(i.drawMe());
    }


}

}




