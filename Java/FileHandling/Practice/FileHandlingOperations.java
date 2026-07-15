package Java.FileHandling.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingOperations {
    public static void main(String[] args) throws IOException{
        // Creating a File

        File createFile = new File("C:/Full-Stack-Development/Java/FileHandling/Practice/fileOperations.txt");
        if(createFile.createNewFile()){
            System.out.println("New File Created: " + createFile.getName());
        } else{
            System.out.println("File already exist!");
        }

        // Writing a File
        FileWriter writeInFile = new FileWriter("C:/Full-Stack-Development/Java/FileHandling/Practice/fileOperations.txt");
        writeInFile.write("Files in Java is good!");
        writeInFile.close();

        System.out.println("Successfully written");

        // Reading from a File
        try {
            File readFile = new File("C:/Full-Stack-Development/Java/FileHandling/Practice/fileOperations.txt");
            Scanner reader = new Scanner(readFile);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem in Reading file!!");
            e.printStackTrace();
        }

        // Checking if file is readable
        if(createFile.canRead()){
            System.out.println("The file is readable");
        } else{
            System.out.println("The file is not readable");
        }

        // Checking if file is writable
        if(createFile.canWrite()){
            System.out.println("The file is writable");
        } else{
            System.out.println("The file is not writable");
        }

        // Checking if file exist
        if(createFile.exists()){
            System.out.println("The file exist.");
        } else{
            System.out.println("The file is not exist");
        }

        // Print the absolute path of the file
        System.out.println("Absolute path: " + createFile.getAbsolutePath());

        // Deleting File
        if (createFile.delete()) {
            System.out.println("The deleted file is : " + createFile.getName());
        }
        else {
            System.out.println("Failed in deleting the file.");
        }
    }
}
