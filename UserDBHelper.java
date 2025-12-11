package usermanagement;

import java.io.*;
import java.util.ArrayList;

public class UserDBHelper {
    private static final String FILE_NAME = "users.txt";
    public static ArrayList<User> users;

    // Add user
    public static void addUser(User u) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(u.toFileString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static ArrayList<User> loadUsers() {
        ArrayList<User> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) { 
                    User u = User.fromFileString(line);
                    if (u != null) list.add(u);
                }
            }
        } catch (IOException e) {
            
        }
        return list;
    }

    public static void updateUser(User updated) {
        ArrayList<User> users = loadUsers();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User u : users) {
                if (u.getId().equals(updated.getId())) {
                    bw.write(updated.toFileString());
                } else {
                    bw.write(u.toFileString());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(String id) {
        ArrayList<User> users = loadUsers();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User u : users) {
                if (!u.getId().equals(id)) {
                    bw.write(u.toFileString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
