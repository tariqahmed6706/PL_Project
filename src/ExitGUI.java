/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;

public class ExitGUI extends JFrame {

    public ExitGUI() {
        setTitle("Exit Station");
        setSize(300,200);

        JTextField idField = new JTextField();
        JButton payBtn = new JButton("Calculate Payment");

        add(idField, "North");
        add(payBtn, "South");

        payBtn.addActionListener(e -> {
            try (BufferedReader br = new BufferedReader(new FileReader("tickets.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] p = line.split(",");
                    if (Integer.parseInt(p[0]) == Integer.parseInt(idField.getText())) {

                        LocalDateTime entryTime = LocalDateTime.parse(p[2]);
                        ExitOperator eo = new ExitOperator();
                        double amount = eo.calculatePayment(entryTime);

                        FileManager.savePayment(Integer.parseInt(p[0]), amount);

                        JOptionPane.showMessageDialog(this,
                                "Payment: " + amount + " EGP");

                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Ticket Not Found!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}
