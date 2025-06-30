package service;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> registerUsers;

    public UserService() {
        this.registerUsers = new ArrayList<>();
    }

    public void addUser(String firstName, String lastName, int age, String email, String mobileNumber) {
        User newUser = new User(firstName, lastName, age, mobileNumber, email);
        registerUsers.add(newUser);
    }

    public void deleteUser(User user) {
        for (User users : registerUsers) {
            if (users.equals(user)) {
                registerUsers.remove((user));
                return;
            }
        }
        throw new RuntimeException("No user found..............");
    }

    public void getUserDetails(User user) {
        for (User users : registerUsers) {
            if (users.equals(user)) {
                System.out.println(users);
                return;
            }
        }
        throw new RuntimeException("No user found..............");
    }

    public void updateProfile(User user, String firstName, String lastName, int age, String email) {
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        user.setEmailId(email);
    }

    // search and filtering
    public User findUserByEmail(String email) {
        for (User user : registerUsers) {
            if (user.getEmailId().equals(email)) {
                return user;
            }
        }
        throw new RuntimeException("No user found..............");
    }

    public void getAllUsers() {
        for (User user : registerUsers) {
            System.out.println(user);
            System.out.println();
        }
    }

}
