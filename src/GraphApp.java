import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

class SineWave extends JPanel{

    //use constants for better readability
    private static final double W = 600, H = 700, AMPLITUDE = H/3;
    private static final int MARGIN =30, GAP = 15,DOT_SIZE = 3, SPEED = 10;

    //starting point
    private double x = MARGIN;
    private final double y = H/2;
    private final int dX = 1; //x increment

    //you need to use doubles to avoid rounding error and have use non integer coordinates
    private final List<Point2D.Double> points;
    private final Timer timer;

    public SineWave() {
        setPreferredSize(new Dimension((int)W, (int)H));
        points = new ArrayList<>();
        timer = new Timer(SPEED, e->addPoints()); //timer to add sine points
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        Shape xAxis = new Line2D.Double(MARGIN, H/2, W-MARGIN, H/2);
        g2.draw(xAxis);
        Shape yAxis = new Line2D.Double(W/2, MARGIN, W/2, H-MARGIN);
        g2.draw(yAxis);
        g.drawString("I", (int)(W/2-GAP),MARGIN);
        g.drawString("V'", (int)(W-GAP), (int)(H/2+GAP));

        g2.setColor(Color.blue);//colour of graph
        for(Point2D.Double p : points){
            Shape point = new Ellipse2D.Double(p.getX(), p.getY(),DOT_SIZE , DOT_SIZE);
            g2.draw(point);
        }
    }

    private void addPoints() {

        double angel = - Math.PI + 2* Math.PI * ((x-MARGIN)/(W- 2*MARGIN));//angle in radians
        double newY = y + AMPLITUDE  * Math.sin(angel);
        points.add(new Point2D.Double(x, newY));
        x += dX;
        if(x >= W-MARGIN) {
            timer.stop();
        }
        repaint();
    }
}