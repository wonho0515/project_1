package Swing;

import javax.swing.*;
import java.awt.*;

public class C1 extends JFrame {
    public C1(){
        Container cp=getContentPane();
        JButton jb= new JButton("Click here");
        JLabel jl=new JLabel("label 2");
        cp.add(jb,BorderLayout.EAST);
        cp.add(jl,BorderLayout.WEST);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
