package assignment_10;

import javax.swing.*;
import java.awt.*;

public class PizzaMall extends JFrame {
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();

    public PizzaMall(){
        super("PizzaMall");
        p1.add(new JLabel("Welcome to java pizza. Choose the type of pizza."));
        p2.add(new JButton("Combination Pizza"));
        p2.add(new JButton("Potato pizza"));
        p2.add(new JButton("Roasted meat pizza"));
        p2.add(new JLabel("count"));
        p2.add(new JTextField(10));

        Container cp=getContentPane();
        cp.add(p1,BorderLayout.NORTH);
        cp.add(p2,BorderLayout.CENTER);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
