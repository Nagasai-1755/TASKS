package ExceptionHandling;

import java.io.IOException;

public class ThrowVsThrowsExample {
    public static void main(String[] args) {
        ThrowVsThrowsExample example = new ThrowVsThrowsExample();

        try {
            // Using "throw" to raise a custom exception
            example.processAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            // Using "throws" to declare an exception in the method signature
            example.readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught an exception while reading a file: " + e.getMessage());
        }
    }

    public void processAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }

    public void readFile(String fileName) throws IOException {
        // Code to read a file, might throw IOException
        // For the sake of the example, we don't actually read a file here.
        throw new IOException("File not found");
    }
}