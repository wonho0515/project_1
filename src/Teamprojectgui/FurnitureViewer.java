package Teamprojectgui;

import Teamproject.FurnitureManager;
import TeamprojectFurniture.FurnitureInput;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class FurnitureViewer extends JPanel {

    WindowFrame frame;
    FurnitureManager furnitureManager;
    public FurnitureViewer(WindowFrame frame,FurnitureManager furnitureManager){
        this.frame=frame;
        this.furnitureManager=furnitureManager;

        System.out.println("***"+furnitureManager.size()+"***");

        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Brand");
        model.addColumn("Cost");
        model.addColumn("Caution");

        for(int i=0;i<furnitureManager.size();i++){
            Vector row=new Vector();
            FurnitureInput si=furnitureManager.get(i);
            row.add(si.getId());
            row.add(si.getFuniture());
            row.add(si.getBrand());
            row.add(si.getPrice());
            row.add(si.getCaution());
            model.addRow(row);
        }

        JTable table=new JTable(model);
        JScrollPane sp=new JScrollPane(table);

        this.add(sp);
    }
}
