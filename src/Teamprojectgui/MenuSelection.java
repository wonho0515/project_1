package Teamprojectgui;

import javax.swing.*;
import java.awt.*;

public class MenuSelection extends JFrame {
    public MenuSelection(){
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JLabel label=new JLabel("Menu Selection");

        JButton button1=new JButton("Add Furniture");
        JButton button2=new JButton("View Furniture");
        JButton button3=new JButton("Edit Furniture");
        JButton button4=new JButton("Delete Furniture");
        JButton button5=new JButton("Exist");

        panel1.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
