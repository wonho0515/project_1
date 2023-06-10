package Teamprojectlisteners;

import Teamprojectgui.FurnitureAdder;
import Teamprojectgui.FurnitureViewer;
import Teamprojectgui.WindowFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAddListener implements ActionListener {
    WindowFrame frame;
    public ButtonAddListener(WindowFrame frame){
        this.frame=frame;
    }
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        FurnitureAdder adder=frame.getFurnitureAdder();
        frame.setupPanel(adder);
    }
}
