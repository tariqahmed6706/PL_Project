/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.io.*;

public class FileManager {

    public static void saveTicket(Customer c) {
        try (FileWriter fw = new FileWriter("tickets.txt", true)) {
            fw.write(c.getEntryId() + "," + c.getPlateNumber() + "," + c.getEntryTime() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void savePayment(int entryId, double amount) {
        try (FileWriter fw = new FileWriter("payments.txt", true)) {
            fw.write("EntryID:" + entryId + ", Amount:" + amount + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveSpotData(int total, int used) {
        try (FileWriter fw = new FileWriter("parking.txt")) {
            fw.write(total + "," + used);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] loadSpotData() {
        try (BufferedReader br = new BufferedReader(new FileReader("parking.txt"))) {
            String line = br.readLine();
            String[] parts = line.split(",");
            return new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
        } catch (Exception e) {
            return new int[]{10, 0}; // default
        }
    }
}
