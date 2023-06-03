package Swing;

import javax.swing.*;

public class Hello1 {
    public static void main(String[]args){
        JFrame frame=new JFrame("온도 변환기");
        JPanel panel=new JPanel();
        JLabel label1=new JLabel("화씨 온도");
        JTextField field1=new JTextField(10);
        JLabel label2=new JLabel("섭씨 온도");
        JTextField field2=new JTextField(10);
        JButton button=new JButton("Convert");

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);
        button.addActionListener(new MyListener(field1,field2));
        frame.setContentPane(panel);
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
    /*public static void main(String[]args){
        JFrame f = new JFrame("title");
        JPanel p = new JPanel();
        JLabel l = new JLabel("Fahrenheit temperature");
        JLabel j = new JLabel("Celsius temperature");
        JTextField tf=new JTextField(" ");
        JButton b = new JButton("Convert");

        f.setSize(300,200);
        p.add(l);
        p.add(tf);

        p.add(j);
        p.add(tf);
        p.add(b);
        p.add(tf);
        f.setContentPane(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}*/
