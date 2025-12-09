/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import javax.swing.*;

public class EntryGUI extends JFrame {

    public EntryGUI() {
        setTitle("Entry Station");
        setSize(300,200);

        EntryOperator op = new EntryOperator();

        JTextField plateField = new JTextField();
        JButton printBtn = new JButton("Print Ticket");

        add(plateField, "North");
        add(printBtn, "South");

        printBtn.addActionListener(e -> {
            if (!op.hasFreeSpot()) {
                JOptionPane.showMessageDialog(this, "Parking Full!");
                return;
            }

            int id = (int)(Math.random() * 10000);
            Customer c = new Customer(id, plateField.getText());
            FileManager.saveTicket(c);
            op.occupySpot();

            JOptionPane.showMessageDialog(this,
                    "Ticket Printed!\nEntryID: " + id);
        });

        setVisible(true);
    }
}

