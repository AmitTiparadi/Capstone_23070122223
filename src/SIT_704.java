// Q3) Difficult: Multi-Client Bank Transaction server

// Problem: Multiple ATM users access bank server simultaneously
// Solution: Create
//           * server handles multiple clients using threads
//           * each client sends deposit amount
//           * server updates balance

import java.io.*;
import java.net.*;

class ClientHandler extends Thread{
    Socket socket;
    static int bankBalance = 1000;

    ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader((socket.getInputStream())));

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            int deposit = Integer.parseInt(in.readLine());

            synchronized (ClientHandler.class){
                bankBalance = bankBalance+deposit;
                System.out.println("Deposit Successful");
                System.out.println("Updated Balance: "+bankBalance);
            }
            socket.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

public class SIT_704 { // Server
    public static void main(String[] args) throws IOException{
        ServerSocket servSocket = new ServerSocket(4000);
        System.out.println("Bank Server Started.....");

        while (true){
            Socket socket = servSocket.accept();
            new ClientHandler(socket).start();
        }
    }    
}
