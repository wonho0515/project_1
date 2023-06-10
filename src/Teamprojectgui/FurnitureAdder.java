package Teamprojectgui;

import javax.swing.*;

public class FurnitureAdder extends JPanel {

    WindowFrame frame;
    public FurnitureAdder(WindowFrame frame) {
        this.frame=frame;

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
        JTextField fieldID = new JTextField(10);
        labelID.setLabelFor(fieldID);
        panel.add(labelID);
        panel.add(fieldID);

        JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
        JTextField fieldName = new JTextField(10);
        labelID.setLabelFor(fieldName);
        panel.add(labelName);
        panel.add(fieldName);

        JLabel labelBrand = new JLabel("Brand: ", JLabel.TRAILING);
        JTextField fieldBrand = new JTextField(10);
        labelID.setLabelFor(fieldBrand);
        panel.add(labelBrand);
        panel.add(fieldBrand);

        JLabel labelCost = new JLabel("Cost: ", JLabel.TRAILING);
        JTextField fieldCost = new JTextField(10);
        labelID.setLabelFor(fieldCost);
        panel.add(labelCost);
        panel.add(fieldCost);

        JLabel labelCaution = new JLabel("Caution: ", JLabel.TRAILING);
        JTextField fieldCaution = new JTextField(10);
        labelID.setLabelFor(fieldCaution);
        panel.add(labelCaution);
        panel.add(fieldCaution);

        panel.add(new JButton("save"));
        panel.add(new JButton("cancel"));

        SpringUtilities.makeCompactGrid(panel,6,2,6,6,6,6);

        this.add(panel);
        this.setVisible(true);
    }
}