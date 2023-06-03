import javax.swing.*;
import java.awt.*;
import java.awt.geom.RectangularShape;

import java.awt.geom.*;

 class Ball extends JComponent {

    int X;
    int Y;
    int W;
    int H;
     Color BallColor ;
    Graphics g;

    //costruktory
    public Ball(int x, int y,Color newColor ){
    X= x;
    Y = y;
    W= 50;
    H = 50;
    BallColor = newColor;

    }
    public  Ball(int x, int y, Color newColor,int w ,int h){
        X= x;
        Y = y;
        W= w;
        H =h;
        BallColor = newColor;
    }

    public Ellipse2D drawMe(){
        Ellipse2D.Double cos  = new Ellipse2D.Double(X,Y,W,H);
       // System.out.println("Bede teraz tysowal kolko o stadardowych wymiarach w punktach :" + X + " " + Y);
        return  cos;

    }

    public Color returColor(){
        return BallColor;
    }

}

