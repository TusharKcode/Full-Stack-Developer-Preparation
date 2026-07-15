package Java.FileHandling.Practice;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;

public class ReaderClass {
    public static void main(String[] args) throws IOException{
        Reader r = new FileReader("C:\\Full-Stack-Development\\Java\\FileHandling\\Practice\\testingFile.txt");     // Open a file reader
        PrintStream out = System.out;

        char buffer[] = new char[10];                   // Create a character array and CharBuffer
        CharBuffer charBuffer = CharBuffer.wrap(buffer);    

        if(r.markSupported()){          // Check if the reader supports marking
            r.mark(100);
            out.print("mark method is supported");
        }

        r.skip(5);          // Skip 5 characters in the stream

        if(r.ready()){          // Check if the stream is ready to read
            r.read(buffer,0 ,10);   // Read 10 characters into the buffer
            out.print("Buffer after reading 10 chars: " + Arrays.toString(buffer));

            r.read(charBuffer);         // Read characters into the CharBuffer
            out.println("\nCharBuffer contents: " + Arrays.toString(charBuffer.array()));

            out.println("Next character: " + (char)r.read());   // Read a single character
        }

        r.close();      // Close the reader
    }   
}
