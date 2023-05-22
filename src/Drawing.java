import  java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Drawing extends JComponent{

    private int width ;
    private  int height ;

    private Color Black = new Color(0,0,0);

public Drawing(int w,int h){
   width = w;
   height = h;
}
protected  void  paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D.Double r = new Rectangle2D.Double(50,75,100,250);
    g2d.drawLine(0,240,640,240);
    g2d.drawLine(320,0,320,480);
    g2d.setColor(Black);

    //g2d.fill(r);
}

}

