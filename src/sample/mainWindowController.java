package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    private TextField search_textfield;

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
    void initialize() {
        adventure_button.setOnAction(event -> {
             //adventure_button.getScene().getWindow().hide();
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
            stage.showAndWait();

        });
        programming_button.setOnAction(event -> {
           // programming_button.getScene().getWindow().hide();
            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(getClass().getResource("/sample/Programming_books.fxml"));
            try {
                loader4.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root4 = loader4.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root4));
            stage.showAndWait();

        });
        art_button.setOnAction(event -> {
           // art_button.getScene().getWindow().hide();
            FXMLLoader loader5 = new FXMLLoader();
            loader5.setLocation(getClass().getResource("/sample/Art_books.fxml"));
            try {
                loader5.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root5 = loader5.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root5));
            stage.showAndWait();

        });
        biography_button.setOnAction(event -> {
           // biography_button.getScene().getWindow().hide();
            FXMLLoader loader6 = new FXMLLoader();
            loader6.setLocation(getClass().getResource("/sample/Biography_books.fxml"));
            try {
                loader6.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root6 = loader6.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root6));
            stage.showAndWait();

        });
        my_books_button.setOnAction(event -> {
            // my_books_button.getScene().getWindow().hide();
            FXMLLoader loader7 = new FXMLLoader();
            loader7.setLocation(getClass().getResource("/sample/My_books.fxml"));
            try {
                loader7.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root7 = loader7.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root7));
            stage.showAndWait();

        });

    }
}


