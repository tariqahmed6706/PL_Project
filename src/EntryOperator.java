/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
public class EntryOperator {
    private int totalSpots;
    private int usedSpots;

    public EntryOperator() {
        int[] data = FileManager.loadSpotData();
        this.totalSpots = data[0];
        this.usedSpots = data[1];
    }

    public boolean hasFreeSpot() {
        return usedSpots < totalSpots;
    }

    public void occupySpot() {
        if (hasFreeSpot()) {
            usedSpots++;
            FileManager.saveSpotData(totalSpots, usedSpots);
        }
    }

    public int getFreeSpots() {
        return totalSpots - usedSpots;
    }
}

