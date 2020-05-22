package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.Main.books;

public class mainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_background;

    @FXML
    private Button art_button;

    @FXML
    private Button programming_button;

    @FXML
    private Button my_books_button;

    @FXML
    private Button adventure_button;

    @FXML
    private Button biography_button;

    @FXML
    private Label best_label;

    @FXML
    private ImageView best1_img;

    @FXML
    private ImageView best2_img;

    @FXML
    private ImageView best3_img;
    @FXML
    private Label n1;

    @FXML
    private Label n3;

    @FXML
    private Label n5;

    @FXML
    private Label n2;

    @FXML
    private Label n4;

    @FXML
    private Label n6;

    @FXML
    private Button add1;

    @FXML
    private Button add2;

    @FXML
    private Button add3;


    @FXML
    void initialize() {
        add1.setOnAction(event -> {
            books.add(new Book("Guard", "Terry Pratchett"));
        });
        add2.setOnAction(event -> {
            books.add(new Book("Lessons", "Gisele Bundchen"));
        });
        add3.setOnAction(event -> {
            books.add(new Book("Black holes", "Stephen Hawking"));
        });
        adventure_button.setOnAction(event -> {
            adventure_button.getScene().getWindow().hide();
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(getClass().getResource("/sample/Adventure_books.fxml"));
            try {
                loader3.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root3 = loader3.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root3));
            stage.show();

        });
        programming_button.setOnAction(event -> {
            programming_button.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/Programming_books.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        });
        art_button.setOnAction(event -> {
            art_button.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/Art_books.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        });
        biography_button.setOnAction(event -> {
            biography_button.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/Biography_books.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        });
        my_books_button.setOnAction(event -> {
            my_books_button.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/My_books.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        });

    }
}


