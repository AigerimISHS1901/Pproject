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

public class Programming_books_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img_background;

    @FXML
    private Label pan1;

    @FXML
    private ImageView img1;

    @FXML
    private Label pan2;

    @FXML
    private ImageView img2;

    @FXML
    private Label pan3;

    @FXML
    private ImageView img3;

    @FXML
    private Label book_name1;

    @FXML
    private Label book_name2;

    @FXML
    private Label book_name3;

    @FXML
    private Label author_name1;

    @FXML
    private Label author_name2;

    @FXML
    private Label author_name3;

    @FXML
    private Button add1;

    @FXML
    private Button add2;

    @FXML
    private Button back;

    @FXML
    private Button add3;

    @FXML
    void initialize() {
        back.setOnAction(event -> {
           // back.getScene().getWindow().hide();

            FXMLLoader loader11 = new FXMLLoader();

            loader11.setLocation(getClass().getResource("/sample/mainWindow.fxml"));

            try {
                loader11.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root11 = loader11.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root11));
            stage.showAndWait();

        });
        add1.setOnAction(event -> {
        books.add(new Book( "C++ master-class", "Maxim Kuznetsov"));
        });
        add2.setOnAction(event -> {
        books.add(new Book("World of programming", "Philip Antara"));
        }
        );
        add3.setOnAction(event -> {
         books.add(new Book( "Effective use C++", "Scott Myers"));
        });
    }}

