package jobSearchAndApplicationManagementSystem;
import java.util.Scanner;
public class LoginSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate user credentials (username, password, and role).
        String applicantUsername = "applicant";
        String applicantPassword = "password1";
        String employerUsername = "employer";
        String employerPassword = "password2";

        System.out.println("Welcome to the Job Application and Search Management System!");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(applicantUsername) && password.equals(applicantPassword)) {
            System.out.println("Login successful! You are an applicant.");
            // Perform actions for applicants here.
        } else if (username.equals(employerUsername) && password.equals(employerPassword)) {
            System.out.println("Login successful! You are an employer.");
            // Perform actions for employers here.
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
}
}
