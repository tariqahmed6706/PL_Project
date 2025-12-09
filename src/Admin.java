/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Admin {

    public void addSpots(int count) {
        int[] data = FileManager.loadSpotData();
        int total = data[0] + count;
        int used = data[1];
        FileManager.saveSpotData(total, used);
    }

    public int getTotalSpots() {
        return FileManager.loadSpotData()[0];
    }

    public int getUsedSpots() {
        return FileManager.loadSpotData()[1];
    }
}

