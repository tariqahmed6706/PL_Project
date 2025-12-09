/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.awt.*;
import javax.swing.*;

public class MainGUI extends JFrame {

    public MainGUI() {
        setTitle("Parking Guidance System");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));

        JButton entryBtn = new JButton("Customer Entry");
        JButton exitBtn = new JButton("Customer Exit");
        JButton adminBtn = new JButton("Admin Panel");

        add(entryBtn);
        add(exitBtn);
        add(adminBtn);

        entryBtn.addActionListener(e -> new EntryGUI());
        exitBtn.addActionListener(e -> new ExitGUI());
        adminBtn.addActionListener(e -> new AdminGUI());

        setVisible(true);
    }

    public static void main(String[] args) {
        MainGUI main = new MainGUI();
    }
}

