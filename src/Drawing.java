import  java.awt.*;
import javax.swing.*;
public class Drawing extends JComponent{

    private int width ;
    private  int height ;
    int howmanyballs = 40;
    public Graphics2D g2d;
  public   Ball[] tablesBalls = new Ball[howmanyballs];
  public  Ball[] tablesOfSmallBalls = new Ball[howmanyballs];

public Drawing(int w,int h){
    // tworzymy okno do rysowania
   width = w;
   height = h;
   //tworzymy 40 kulek które będą zmianiać kolory
   int StarX = 50;
   int malyX = 30;
   int StarY = 50;
    for (int i = 0; i < howmanyballs; i++) {
        tablesBalls[i] = new Ball(StarX,StarY,Color.LIGHT_GRAY);
        tablesOfSmallBalls[i] = new Ball(malyX +220,StarY + 8,Color.LIGHT_GRAY,30,30 );
        StarX = StarX + 50;
        malyX = malyX + 30;
        if(StarX == 250){
            StarY = StarY + 50;
            StarX = 50 ;
            malyX = 30;
        }
        
    }
}
@Override
public   void paintComponent(Graphics g){
    super.paintComponent(g);
    g2d = (Graphics2D) g;


    g2d.drawLine(50,50,50,550);
    g2d.drawLine(250,50,250,550);
    g2d.drawLine(50,50,250,50);
    g2d.drawLine(50,550,250,550);

    for (Ball i : tablesOfSmallBalls
    ) {
        g2d.setColor(i.BallColor);
        g2d.fill(i.drawMe());
    }

    for (Ball i : tablesBalls
         ) {
        g2d.setColor(i.BallColor);
        g2d.fill(i.drawMe());
    }


}


public void PaintBall(int id, int bigOrSmal, Color color){
    if(bigOrSmal== 0) {
        tablesBalls[id].BallColor = color;

        g2d.setColor(tablesBalls[id].BallColor);
        g2d.fill(tablesBalls[id].drawMe());
    }
    if(bigOrSmal == 1){
        tablesOfSmallBalls[id].BallColor = color;

        g2d.setColor(tablesOfSmallBalls[id].BallColor);
        g2d.fill(tablesOfSmallBalls[id].drawMe());
    }
}



}




