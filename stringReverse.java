import java.util.Scanner;

public class ReverseStringExampleWithScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the input string from the user
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();

        // Split the input string based on "."
        String[] words = input.split("\\.");

        // Create a StringBuilder to construct the output
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order to StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(".");
            }
        }

        // Convert StringBuilder to String
        String output = reversed.toString();

        // Print the output
        System.out.println("Output: " + output);
    }
}
