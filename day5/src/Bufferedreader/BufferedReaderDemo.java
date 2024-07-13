package Bufferedreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args)throws IOException {
        
    	System.out.println("hello ");
    	
    	// Create a BufferedReader object to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter their name and read it using readLine() method
        System.out.println("Enter your name:");
        String name = reader.readLine();
            
        // Prompt the user to enter their age, read it using readLine() method and convert it to an integer
        System.out.println("Enter your age:");
        int age = Integer.parseInt(reader.readLine());

        // Prompt the user to enter their salary, read it using readLine() method and convert it to a double
        System.out.println("Enter your salary:");
        double salary = Double.parseDouble(reader.readLine());

        // Display the entered details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

       }
}
