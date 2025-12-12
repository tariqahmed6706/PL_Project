package PL_Project;

public class User {
    private String id;
    private String name;
    private String username;
    private String password;
    private String role;

    public User(String id, String name, String username, String password, String role) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String toFileString() {
        return id + "," + name + "," + username + "," + password + "," + role;
    }

    public static User fromFileString(String line) {
        String[] data = line.split(",");
        if (data.length < 5) return null; 
        return new User(data[0], data[1], data[2], data[3], data[4]);
    }

    public String getId() {
        return id; 
    }
    public String getName() { 
        return name;
    }
    public String getUsername() { 
        return username; 
    }
    public String getPassword() { 
        return password; 
    }
    public String getRole() { 
        return role; 
    }
}
