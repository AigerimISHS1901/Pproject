package sample;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void connect(User user){
        try{
            Socket socket = new Socket("127.0.0.1", 1235);
            ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
            // ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            if(user != null){
                toServer.writeObject(user);
            }
            socket.close();
            toServer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}