package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
    JTextField f1;
    JTextField f2;

    MyListener(JTextField f1,JTextField f2){
        this.f1=f1;
        this.f2=f2;
    }
    public void actionPerformed(ActionEvent e){
        JButton button=(JButton) e.getSource();
        String stringNum=f1.getText();
        int intNum=Integer.parseInt(stringNum);
        double dblNum=((double)intNum-32)/1.0;
        stringNum=Double.toString(dblNum);
        f2.setText(stringNum);
    }
    /*public void actionPerformed(ActionEvent e){
        JButton button=(JButton) e.getSource();
        button.setText("Hello");
    }*/
}
