package Teamprojectgui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FurnitureViewer extends JFrame {
    public FurnitureViewer(){

        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Brand");
        model.addColumn("Cost");
        model.addColumn("Caution");

        JTable table=new JTable(model);
        JScrollPane sp=new JScrollPane(table);

        this.add(sp);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
