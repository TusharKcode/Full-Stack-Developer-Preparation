package Java.Networking.ClientServerCommunication;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {       // Initialize socket and input stream
    private static final int PORT = 5000;

    public Server(int port){    // Starts server and waits for a connection
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            
            System.out.println("Server Started");
            System.out.println("Waiting for a client...");

            try(
                Socket socket = serverSocket.accept();
                DataInputStream reader = new DataInputStream(socket.getInputStream())
            ){
                System.out.println("Client Connected");
                String message;

                do {
                    message = reader.readUTF();
                    System.out.println("Client: " + message);
                } while (!message.equalsIgnoreCase("Over"));
                System.out.println("Client Disconnected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server(PORT);
    }
}