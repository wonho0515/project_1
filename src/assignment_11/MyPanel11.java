package assignment_11;

import adapter.PanelMouseAdapter;

import javax.swing.*;
import java.awt.*;

public class MyPanel11 extends JPanel {
    public MyPanel11(){
        this.addMouseListener(new PanelMouseAdapter(this));
    }

    @Override
    protected void paintComponent(Graphics g) {

    }
}
