package Graphics;

import javax.swing.*;

public class MyFrame1 extends JFrame {
    public MyFrame1(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel1());
        setSize(500,500);
        setVisible(true);
    }
}
