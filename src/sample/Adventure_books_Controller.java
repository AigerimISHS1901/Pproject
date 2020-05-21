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

public class Adventure_books_Controller {

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
            //back.getScene().getWindow().hide();

            FXMLLoader loader8 = new FXMLLoader();

            loader8.setLocation(getClass().getResource("/sample/mainWindow.fxml"));

            try {
                loader8.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root8 = loader8.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root8));
            stage.showAndWait();

        });
        add1.setOnAction(event -> {
            books.add(new Book("Dwaerindim dead","Marina Kurzhev" ));
        });
        add2.setOnAction(event -> {
            books.add(new Book( "The dark Prince's game", "Tatyana Zinina"));

        });
        add3.setOnAction(event -> {
           books.add(new Book( "Shantaram", "Gregor Gorenz"));

        });


    }
}


