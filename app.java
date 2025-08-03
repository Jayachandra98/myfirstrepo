import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Call the greet method
        greetUser(name);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }

    // Method to greet the user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}

