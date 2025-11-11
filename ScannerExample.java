import java.util.Scanner; // Import the Scanner class

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console (System.in)
        Scanner scanner = new Scanner(System.in);

        // Read a String
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine(); // Reads the entire line until a newline character

        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads the next integer

        // Read a double
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble(); // Reads the next double

        // Consume the remaining newline character after reading the double
        // This is important if you plan to use nextLine() again after nextInt() or nextDouble()
        scanner.nextLine(); 

        // Read a boolean
        System.out.print("Are you a Java developer? (true/false): ");
        boolean isJavaDeveloper = scanner.nextBoolean(); // Reads the next boolean

        // Display the collected information
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Java Developer: " + isJavaDeveloper);

        // Close the scanner to release system resources
        scanner.close();
    }
}
