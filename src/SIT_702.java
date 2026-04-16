// Q2) Moderate: Online food order system
//     Problem: Customer sends food order to restaurant server.

// Solution: Create
//           1) Client sends food item name.
//           2) Server responds with confirmation

import java.io.*;
import java.net.*;

public class SIT_702 {
    public static void main(String[] args) throws IOException{

        ServerSocket servSocket = new ServerSocket(3500);

        System.out.println("Restaurant server started.....");

        Socket socket = servSocket.accept();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String order = in.readLine();

        System.out.println("Order received: "+order);

        out.println("Order Confirmed: "+order);

        socket.close();
        servSocket.close();
    }
}
