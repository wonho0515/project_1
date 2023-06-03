package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerMouse extends MouseAdapter {
    JPanel panel;
    ListenerMouse(JPanel panel){
        this.panel=panel;
    }
    public void mouseClicked(MouseEvent e){
        Graphics g=panel.getGraphics();
        //g.drawRect(e.get);
    }
}
