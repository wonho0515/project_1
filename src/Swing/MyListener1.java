package Swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener1 implements MouseListener {
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
    }

}
