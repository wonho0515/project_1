package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel1 extends JPanel {
    public MyPanel1(){
    }
    protected void paintComponent(Graphics g){
        g.drawRect(50,50,50,50);
        /*g.drawOval(100,100,100,100);
        g.drawLine(250,250,300,300);
        g.drawString("Hello",400,400);*/
    }
}
