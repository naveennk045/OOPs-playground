import models.Role;
import models.User;
import service.UserService;

import java.util.Scanner;

public class TaxiBookingApplication {
    public static Role getRole(Scanner scanner) {
        System.out.println("Choose : USER -> 1 || DRIVER -> 2");
        int role = scanner.nextInt();
        scanner.next();
        if (role == 2) return Role.DRIVER;
        return Role.USER;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();

        User currentUser = null;

        System.out.println("\n\n---------------------------- Welcome to the ROVERZ taxi Booking ----------------------------");


        System.out.println("SignUp : 1");
        System.out.println("SignIp : 2");

        if (scanner.nextInt() == 1) {
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

        } else {
            System.out.println("Enter email : ");
            String email = scanner.nextLine();
            System.out.println("Enter password :");
            String password = scanner.nextLine();

            try{
                currentUser = userService.authenticateUser(email,password);
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }




    }
}
