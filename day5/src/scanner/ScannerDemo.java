package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) 
    {
    	// Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name and read it using nextLine() method
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        // Prompt the user to enter their age and read it using nextInt() method
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Prompt the user to enter their salary and read it using nextDouble() method
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        // Display the entered details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the scanner to free up resources
        scanner.close();
    }
}
