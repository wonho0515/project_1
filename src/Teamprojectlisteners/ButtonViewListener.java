package Teamprojectlisteners;

import Teamprojectgui.FurnitureViewer;
import Teamprojectgui.WindowFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewListener implements ActionListener {
    WindowFrame frame;
    public ButtonViewListener(WindowFrame frame){
        this.frame=frame;
    }
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton) e.getSource();
        FurnitureViewer viewer=frame.getFurnitureviewer();
        frame.setupPanel(viewer);
    }
}
