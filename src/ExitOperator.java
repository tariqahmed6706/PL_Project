/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.time.Duration;
import java.time.LocalDateTime;

public class ExitOperator {

    public double calculateHours(LocalDateTime entryTime) {
        Duration duration = Duration.between(entryTime, LocalDateTime.now());
        return Math.ceil(duration.toMinutes() / 60.0);
    }

    public double calculatePayment(LocalDateTime entryTime) {
        return calculateHours(entryTime) * 10.0;
    }
}

