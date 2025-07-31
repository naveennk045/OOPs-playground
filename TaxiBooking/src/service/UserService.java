package service;

import exceptions.InvalidCredentials;
import exceptions.UserNotFound;
import models.Role;
import models.User;

import java.util.ArrayList;

public class UserService {

    private static ArrayList<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public User addUser(String userName, String email, Role role, String mobileNumber, String password) {
        User currentUser = new User(userName, email, role, mobileNumber, password);
        users.add(currentUser);
        return currentUser;
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

    public User authenticateUser(String email , String password){
        User currentUser = findUser(email);
        if ( currentUser == null) throw new UserNotFound();
        if (!currentUser.getPassword().equals(password)) throw new InvalidCredentials();

        return currentUser;
    }

    private User findUser(long userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
    private User findUser(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
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
