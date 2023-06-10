package assignment_11;

import javax.swing.*;

public class MyFrameAssignment11 extends JFrame {
    public MyFrameAssignment11() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Frame");
        MyPanel11 panel=new MyPanel11();

        this.add(panel);
        this.setVisible(true);
    }
}
