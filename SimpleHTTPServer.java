import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class SimpleHTTPServer {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8081);
        System.out.println("Listenning for connection on port 8081 ....");
        while(true) {
            // spin forever

            // final Socket clientSocket = server.accept();
            // 1. Read HTTP request from the client socket 
            // 2. Prepare an HTTP response 
            // 3. Send HTTP response to the client 
            // 4. Close the socket
            // InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            // BufferedReader reader = new BufferedReader(isr);
            // String line = reader.readLine();
            // while (!line.isEmpty()) {
            //     System.out.println(line);
            //     line = reader.readLine();
            // } 
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}