package Swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyListener2 extends MouseAdapter {
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }
}
