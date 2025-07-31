import models.Role;
import models.User;
import service.LocationService;
import service.UserService;

import java.util.Scanner;

public class TaxiBookingApplication {
    public static Role getRole(Scanner scanner) {
        System.out.println("Choose : USER -> 1 || DRIVER -> 2");
        int role = scanner.nextInt();
        scanner.nextLine(); // Fix: Use nextLine() instead of next()
        if (role == 2) return Role.DRIVER;
        return Role.USER;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        LocationService locationService = new LocationService();

        User currentUser = null;

        System.out.println("\n\n---------------------------- Welcome to the ROVERZ taxi Booking ----------------------------");

        System.out.println("SignUp : 1");
        System.out.println("SignIn : 2"); // Fix: Typo "SignIp" -> "SignIn"

        System.out.println();

        int choice = scanner.nextInt();
        scanner.nextLine(); // Fix: Consume the newline after nextInt()

        if (choice == 1) {
            System.out.println("Enter name : ");
            String userName = scanner.nextLine();
            System.out.println("Enter email : ");
            String email = scanner.nextLine();
            Role role = getRole(scanner);
            System.out.println("Enter Mobile Number : ");
            String mobileNumber = scanner.nextLine();
            System.out.println("Enter password : ");
            String password = scanner.nextLine();

            currentUser = userService.addUser(userName, email, role, mobileNumber, password);
            System.out.println("User registered successfully!");

        } else {
            System.out.println("Enter email : ");
            String email = scanner.nextLine();
            System.out.println("Enter password :");
            String password = scanner.nextLine();

            try {
                currentUser = userService.authenticateUser(email, password);
                System.out.println("Login successful! Welcome " + currentUser.getUserName());
            } catch (Exception exception) {
                System.out.println("Login failed: " + exception.getMessage());
                return;
            }
        }

        if (currentUser != null) {
            System.out.println("Current user: " + currentUser.getUserName() + " (" + currentUser.getRole() + ")");
        }

        System.out.println("These are the Locations:");
        System.out.println(locationService.getAllLocations());

        scanner.close();
    }
}