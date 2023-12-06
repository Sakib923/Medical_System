package com.example.medical_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable{


    @FXML
    private VBox pnItems = null;
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Node [] nodes = new Node[10];

        for (int i = 0; i< nodes.length; i++){
            try{
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("HospitalItem.fxml"));
//                nodes[i].setOnMouseEntered(mouseEvent -> {
//                    nodes[j].setStyle("-fx-background-color: #0A0E3F");
//                });
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @FXML
    public void ToDoctorsPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OnlineDoctor.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





}