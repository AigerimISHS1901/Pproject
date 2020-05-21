package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static sample.Main.books;

public class My_books_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img_background;

    @FXML
    private Button back;

    @FXML
    private Text text;

    @FXML
    private Label labelll;

    @FXML
    void initialize() {
        String s=books.toString();
        text.setText(s);
        back.setOnAction(event -> {
            //back.getScene().getWindow().hide();

            FXMLLoader loader12 = new FXMLLoader();

            loader12.setLocation(getClass().getResource("/sample/mainWindow.fxml"));

            try {
                loader12.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root12 = loader12.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root12));
            stage.showAndWait();

        });
    }
}
