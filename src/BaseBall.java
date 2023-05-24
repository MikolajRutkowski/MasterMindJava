import javax.swing.*;
import java.awt.*;
import java.awt.geom.RectangularShape;

import java.awt.geom.*;

 class Ball extends JComponent {

    int X;
    int Y;
     Color BallColor ;
    Graphics g;

    //costruktor
    public Ball(int x, int y,Color newColor ){
    X= x;
    Y = y;
    BallColor = newColor;

    }
    public Ellipse2D drawMe(){
        Ellipse2D.Double cos  = new Ellipse2D.Double(X,Y,50,50);
        System.out.println("Bede teraz tysowal kolko o stadardowych wymiarach w punktach :" + X + " " + Y);
        return  cos;

    }

}

