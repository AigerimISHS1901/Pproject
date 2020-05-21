package sample;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1235);
            System.out.println("Waiting for a client...");
            Socket socket = server.accept();
            System.out.println("Client connected!");
            DatabaseHandler handler = new DatabaseHandler();
            handler.getDbConnection();
            //ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            User user = null;
            if((user = (User)in.readObject()) != null){
                handler.signUpUser(user);
            }
            in.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
