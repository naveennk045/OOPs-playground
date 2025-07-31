package service;

import models.Role;
import models.User;

import java.util.ArrayList;

public class UserService {

    private static ArrayList<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void addUser(String userName, String email, Role role, String mobileNumber, String password){
        users.add(new User(userName, email, role, mobileNumber, password));
    }

    public void updateProfile(long userId, String userName, String email, Role role, String mobileNumber, String password) {
        User currentUser = findUser(userId);
        if (currentUser != null) {
            currentUser.setUserName(userName);
            currentUser.setEmail(email);
            currentUser.setRole(role);
            currentUser.setMobileNumber(mobileNumber);
            currentUser.setPassword(password);
            System.out.println("Profile updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private User findUser(long userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
