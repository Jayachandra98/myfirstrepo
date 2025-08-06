import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            // Ask for the user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Ask for the user's age with input validation
            int age = 0;
            boolean validAge = false;
            while (!validAge) {
                System.out.print("Enter your age: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    if (age > 0) {
                        validAge = true;
                    } else {
                        System.out.println("Please enter a valid positive age.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // discard invalid input
                }
            }

            // Call the greet method
            greetUser(name, age);

            // Ask if the user wants to continue
            System.out.print("Would you like to greet another person? (yes/no): ");
            continueChoice = scanner.nextLine().trim().toLowerCase();

        } while (continueChoice.equals("yes"));

        System.out.println("Thank you for using GreetingApp. Goodbye!");
        scanner.close();
    }

    // Method to greet the user based on age
    public static void greetUser(String name, int age) {
        System.out.println("\nHello, " + name + "!");

        if (age < 12) {
            System.out.println("You're a young explorer! Welcome to the world of Java.");
        } else if (age <= 19) {
            System.out.println("You're a teenager! Java is a great language to master.");
        } else if (age <= 59) {
            System.out.println("Java welcomes you, " + name + ". Keep learning!");
        } else {
            System.out.println("It's never too late to learn. Welcome to Java!");
        }

        System.out.println(); // Blank line for spacing
    }
}




