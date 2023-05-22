
import  javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int w = 640;
        int h = 480;
        JFrame f =  new JFrame();
        Drawing dc = new Drawing(w,h);
        SineWave sw= new SineWave();

        f.setSize(w,h);
        f.setTitle("ZAD 1 Program do rysowania funkcji ");
        f.add(dc);
        f.add(sw);
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setVisible(true);



      Drawing cos = new Drawing(100,100);
}
}