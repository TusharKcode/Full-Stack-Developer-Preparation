package Java.FileHandling.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamEx {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the stream
        try (FileInputStream fi = new FileInputStream("file1.txt")) {

            System.out.println("Channel: " + fi.getChannel());  // Display file channel information

            System.out.println("File Descriptor: " + fi.getFD());   // Display file descriptor

            System.out.println("Number of remaining bytes: " + fi.available()); // Illustrating available method

            fi.skip(4);     // Illustrating skip() method
            System.out.println("File Contents:");

            int ch;     // Reading characters from FileInputStream
            while ((ch = fi.read()) != -1) {
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: Ensure 'file1.txt' exists in the working directory.");
        }
        catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        String s = System.getProperty("user.dir");
        System.out.println("Current working directory: " + s);  // Print the current directory

        // Use try-with-resources to ensure the stream is closed automatically
        try (FileOutputStream fOut = new FileOutputStream("name3.txt", false)) { 

            String st = "TATA"; // String to be written to the file
            fOut.write(st.getBytes());  // Convert the string to a byte array and write it directly
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage()); // Handle exceptions if file operations fail
        }
    }
}