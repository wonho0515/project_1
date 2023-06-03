package Swing;

import javax.swing.*;

public class FrameTest {
    public static void main(String[]args){
        JFrame frame=new JFrame("Frame Test");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("example:");
        JButton button = new JButton("click me");

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
