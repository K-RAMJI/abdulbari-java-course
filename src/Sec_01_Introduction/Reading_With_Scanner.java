package Sec_01_Introduction;
import java.util.Scanner;

public class Reading_With_Scanner {
    public static void main(String[] args) {
        // Creating Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // 1. next(): Reads a single word (until space or newline)
        System.out.print("Enter a single word: ");
        String word = sc.next();
        System.out.println("You entered: " + word);
        
        // 2. nextLine(): Reads an entire line including spaces
        sc.nextLine();  // Consume the remaining newline
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();
        System.out.println("You entered: " + line);
        
        // 3. nextInt(): Reads an integer
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("You entered: " + intValue);
        
        // 4. nextLong(): Reads a long integer
        System.out.print("Enter a long number: ");
        long longValue = sc.nextLong();
        System.out.println("You entered: " + longValue);
        
        // 5. nextDouble(): Reads a double (decimal number)
        System.out.print("Enter a decimal number (double): ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered: " + doubleValue);
        
        // 6. nextFloat(): Reads a float (decimal number)
        System.out.print("Enter a decimal number (float): ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered: " + floatValue);
        
        // 7. nextBoolean(): Reads a boolean value (true/false)
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = sc.nextBoolean();
        System.out.println("You entered: " + boolValue);
        
        // 8. nextByte(): Reads a byte value (-128 to 127)
        System.out.print("Enter a byte value (-128 to 127): ");
        byte byteValue = sc.nextByte();
        System.out.println("You entered: " + byteValue);
        
        // 9. nextShort(): Reads a short integer
        System.out.print("Enter a short value (-32768 to 32767): ");
        short shortValue = sc.nextShort();
        System.out.println("You entered: " + shortValue);
        
        // 10. Checking for more input using hasNext() methods
        System.out.println("\nChecking for more input...");

        System.out.print("Enter something to check hasNext(): ");
        boolean hasNext = sc.hasNext();
        System.out.println("Has next token? " + hasNext);
        
        System.out.print("Enter an integer to check hasNextInt(): ");
        boolean hasNextInt = sc.hasNextInt();
        System.out.println("Has next int? " + hasNextInt);
        
        System.out.print("Enter a double to check hasNextDouble(): ");
        boolean hasNextDouble = sc.hasNextDouble();
        System.out.println("Has next double? " + hasNextDouble);
        
        System.out.print("Enter a boolean to check hasNextBoolean(): ");
        boolean hasNextBoolean = sc.hasNextBoolean();
        System.out.println("Has next boolean? " + hasNextBoolean);
        
        // Closing the scanner
        sc.close();
        System.out.println("\nScanner closed. Program finished.");
    }
}

