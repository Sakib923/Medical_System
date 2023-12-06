package com.example.medical_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {

    private Stage stage;
    private Scene scene;

    @FXML
    private TextField User_Name;

    @FXML
    private TextField User_Password;

    @FXML
    private Button buttonToHomePage;
    @FXML
    public void backToWeclomePage (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Welcome_Page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void nextToHomePage (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonToHomePage.setOnAction(event -> {

        });
    }
}
