import java.io.*;
import java.net.*;

public class SIT_Client_702 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("Localhost", 3500);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Pizza");

        String response = in.readLine();
        System.out.println(response);

        socket.close();
    }
}
