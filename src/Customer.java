/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.time.LocalDateTime;

public class Customer {
    private int entryId;
    private String plateNumber;
    private LocalDateTime entryTime;

    public Customer(int entryId, String plateNumber) {
        this.entryId = entryId;
        this.plateNumber = plateNumber;
        this.entryTime = LocalDateTime.now();
    }

    public int getEntryId() {
        return entryId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
