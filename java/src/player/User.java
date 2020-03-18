package player;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String role;

    public User(String name, String surname, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
