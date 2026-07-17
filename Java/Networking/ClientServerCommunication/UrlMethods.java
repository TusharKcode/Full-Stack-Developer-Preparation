package Java.Networking.ClientServerCommunication;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlMethods {
    public static void main(String[] args) throws MalformedURLException {
        URL u1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYq" + "WK26I4fT8gfth6CACg#q=geeks+for+geeks+java");

        // Creating a URL with a protocol, hostname, and path
        URL u2 = new URL("http", "www.geeksforgeeks.org", "/jvm-works-jvm-architecture/");

        URL u3 = new URL("https://www.google.co.in/search" + "q=gnu&rlz=1C1CHZL_enIN714IN715&oq=gnu&aqs=chrome..69i57j69i60l5.653j0j7&sourceid=chrome&ie=UTF-8#q=geeks+for+geeks+java");

        // Printing the string representation of the URL
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println();
        System.out.println("Different components of URL3:");

        System.out.println("Protocol: " + u3.getProtocol());        // Retrieving the protocol for the URL

        System.out.println("Hostname: " + u3.getHost());            // Retrieving the hostname of the URL

        System.out.println("Default port: " + u3.getDefaultPort()); // Retrieving the default port

        System.out.println("Query: " + u3.getQuery());              // Retrieving the query part of the URL

        System.out.println("Path: " + u3.getPath());                // Retrieving the path of the URL

        System.out.println("File: " + u3.getFile());                // Retrieving the file name

        System.out.println("Reference: " + u3.getRef());            // Retrieving the reference
    }
}
