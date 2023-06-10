package Teamprojectgui;

import Teamprojectlisteners.ButtonAddListener;
import Teamprojectlisteners.ButtonViewListener;

import javax.swing.*;
import java.awt.*;

public class MenuSelection extends JPanel {

    WindowFrame frame;
    public MenuSelection(WindowFrame frame){
        this.frame=frame;

        this.setLayout(new BorderLayout());

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JLabel label=new JLabel("Menu Selection");

        JButton button1=new JButton("Add Furniture");
        JButton button2=new JButton("View Furniture");
        JButton button3=new JButton("Edit Furniture");
        JButton button4=new JButton("Delete Furniture");
        JButton button5=new JButton("Exist");

        button1.addActionListener(new ButtonAddListener(frame));
        button2.addActionListener(new ButtonViewListener(frame));

        panel1.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
    }
}
