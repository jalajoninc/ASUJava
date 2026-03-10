
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Reads a full line

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Reads an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        input.close(); // Always close the scanner when done
    }
}