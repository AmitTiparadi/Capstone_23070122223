import java.io.*;
import java.net.*;

public class SIT_Client_704 {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Socket socket = new Socket("Localhost", 4000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.println("500");

        String response = in.readLine();
        System.out.println(response);

        socket.close();
    }
}
