package adapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelMouseAdapter extends MouseAdapter {

    JPanel panel;
    public PanelMouseAdapter(JPanel panel){
        this.panel=panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g=panel.getGraphics();
        g.drawRect(e.getX(),e.getY(),20,20);
    }
}
