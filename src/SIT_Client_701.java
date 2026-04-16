import java.io.*;
import java.net.*;

public class SIT_Client_701 {
    public static void main(String[] args) throws UnknownHostException{
        try{
            Socket socket = new Socket("Localhost", 3000);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello support team");

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
