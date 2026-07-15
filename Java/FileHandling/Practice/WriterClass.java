package Java.FileHandling.Practice;

import java.io.*;

public class WriterClass {
    public static void main(String[] args) throws IOException{
        Writer writer = new FileWriter("C:\\Full-Stack-Development\\Java\\FileHandling\\Practice\\testingFile.txt", true);
        writer.write("Welcome to Full Stack Java Development"); // Writing Characters to a File
        
        writer.close();

        System.out.println("Data written successfully");

        Writer buffWrite = new BufferedWriter(new FileWriter("C:\\Full-Stack-Development\\Java\\FileHandling\\Practice\\testingFile.txt", true));
        buffWrite.write("BufferedWriter makes writing more efficient.");
        buffWrite.write("\\nIt reduces disk I/O by using a buffer.");

        System.out.println("Data written using BufferedWriter.");
        buffWrite.close();

    }
}
