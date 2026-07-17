package Java.Networking.ClientServerCommunication;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {       // Initialize socket and input/output streams
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int PORT = 5000;

    public Client(String addr, int port){
        try (
            Socket socket = new Socket(addr, port);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
        ) {        
            System.out.println("Connected to Server");
            System.out.println("Type 'Over' to quit.");

            String message;

            do {
                System.out.print("You: ");
                message = reader.readLine();

                writer.writeUTF(message);
                writer.flush();
            } while (!message.equalsIgnoreCase("Over"));

            System.out.println("Connection Closed");

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client(SERVER_ADDRESS, PORT);
    }
}
