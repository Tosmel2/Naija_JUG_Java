import java.util.Scanner;

public class JavaStudentUtilityApp {
    // Shared Scanner for user input
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main loop: keep showing the menu until user chooses Exit (5)
        boolean running = true; // while/do-while requirement
        while (running) {
            showMenu();
            int choice = getIntInput("Enter your choice (1-5): ");

            switch (choice) { // switch requirement
                case 1:
                    addTwoNumbers();
                    break;
                case 2:
                    checkEvenOrOdd();
                    break;
                case 3:
                    printOneToN();
                    break;
                case 4:
                    displayDayOfWeek();
                    break;
                case 5:
                    System.out.println("Thank you for using the app");
                    running = false; // Exit the loop/program
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.\n");
            }
        }

        // Close resources if desired (optional in simple console apps)
        // scanner.close();
    }

    // --- Menu and input helpers ---

    // Shows the main menu (separate method to keep main() clean)
    private static void showMenu() {
        System.out.println("================ Java Student Utility App ================");
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Check EVEN or ODD");
        System.out.println("3. Print Numbers from 1 to N");
        System.out.println("4. Display Day of the Week");
        System.out.println("5. Exit");
        System.out.println("==========================================================");
    }

    // Safely read an integer from the user with a prompt
    private static int getIntInput(String prompt) {
        while (true) { // input validation with while loop
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // consume the end-of-line
                return value;
            } else {
                // if/else requirement used here
                System.out.println("Invalid input. Please enter an integer.\n");
                scanner.nextLine(); // clear invalid token
            }
        }
    }

    // --- Option 1: Add two numbers ---
    private static void addTwoNumbers() {
        int a = getIntInput("Enter the first integer: ");
        int b = getIntInput("Enter the second integer: ");
        int sum = a + b; // arithmetic operator
        System.out.println("Result: " + a + " + " + b + " = " + sum + "\n");
    }

    // --- Option 2: Check EVEN or ODD using ternary operator ---
    private static void checkEvenOrOdd() {
        int n = getIntInput("Enter an integer: ");
        String result = (n % 2 == 0) ? "EVEN" : "ODD"; // ternary operator
        System.out.println("The number " + n + " is " + result + "\n");
    }

    // --- Option 3: Print numbers from 1 to N using for loop ---
    private static void printOneToN() {
        int n = getIntInput("Enter N (>= 1): ");
        if (n < 1) {
            System.out.println("N must be at least 1.\n");
            return;
        }
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) { // for loop requirement
            System.out.print(i + (i < n ? ", " : "\n"));
        }
        System.out.println();
    }

    // --- Option 4: Display day of the week using switch ---
    private static void displayDayOfWeek() {
        int day = getIntInput("Enter a number (1-7): ");
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:
                System.out.println("Invalid day\n");
                return;
        }
        System.out.println("Day: " + dayName + "\n");
    }
}
