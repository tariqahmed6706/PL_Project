/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import javax.swing.*;

public class AdminGUI extends JFrame {

    public AdminGUI() {
        setTitle("Admin Panel");
        setSize(300,300);

        Admin admin = new Admin();

        JTextField addField = new JTextField();
        JButton addBtn = new JButton("Add Spots");
        JButton viewBtn = new JButton("View Report");

        add(addField, "North");
        add(addBtn, "Center");
        add(viewBtn, "South");

        addBtn.addActionListener(e -> {
            int count = Integer.parseInt(addField.getText());
            admin.addSpots(count);
            JOptionPane.showMessageDialog(this, "Spots Added!");
        });

        viewBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Total Spots: " + admin.getTotalSpots() + 
                    "\nUsed Spots: " + admin.getUsedSpots());
        });

        setVisible(true);
    }
}

