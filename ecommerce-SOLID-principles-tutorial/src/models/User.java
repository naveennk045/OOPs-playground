package models;

import java.time.LocalDateTime;

public class User {

    private static long userCount = 1;
    private long userId;
    private String userName;
    private String email;
    private Role role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(String userName, String email, Role role) {
        this.userId = userCount++;
        this.userName = userName;
        this.email = email;
        if (role == Role.ADMIN) {
            throw new RuntimeException("You cannot able to select the admin directly");
        }
        this.role = role;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}