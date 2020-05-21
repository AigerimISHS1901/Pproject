package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Library");
        primaryStage.setScene(new Scene(root, 770, 600));
        primaryStage.show();
        DatabaseHandler databaseHandler=new DatabaseHandler();
    }

    static ArrayList <Book> books=new ArrayList<>();


    public static void main(String[] args) {

        launch(args);
    }





}
