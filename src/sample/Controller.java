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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img_background;

    @FXML
    private Label auth_label;

    @FXML
    private TextField login_text;

    @FXML
    private TextField pass_text;

    @FXML
    private Button login_button;

    @FXML
    private Button signin_button;

    @FXML
    void initialize() {
        login_button.setOnAction(event -> {
            String loginText=login_text.getText().trim();
            String passwordText=pass_text.getText().trim();

            if(!loginText.equals("") && !passwordText.equals(""))
                loginUser(loginText, passwordText);
            else
                System.out.println("Error");
        });
        signin_button.setOnAction(event -> {
            openNewScene1("/sample/signUp.fxml");
        });
    }

    private void loginUser(String loginText, String passwordText) {
        DatabaseHandler dbHandler=new DatabaseHandler();
        User user=new User();
        user.setLoginname(loginText);
        user.setPassword(passwordText);
        ResultSet result=dbHandler.getUser(user);

        int counter=0;

        try {
            while (result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(counter >= 1){
            openNewScene1("/sample/mainWindow.fxml");
        }
    }
    public void openNewScene1(String window){
        //signin_button.getScene().getWindow().hide();
        FXMLLoader loader1=new FXMLLoader();
        loader1.setLocation(getClass().getResource(window));

        try{
            loader1.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        Parent root1=loader1.getRoot();
        Stage stage=new Stage();
        stage.setScene(new Scene(root1));
        stage.showAndWait();
    }

}
