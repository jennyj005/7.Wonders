package com.example.seven_wonder.controller;

import com.example.seven_wonder.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static com.example.seven_wonder.MainApplication.stage;
import static javafx.application.Platform.exit;

public class MainController {

    @FXML
    protected void pressButtonPlay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("gameboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);

        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void pressButtonLeave() throws Exception {
        exit();
    }

    @FXML
    public void pressButtonRules() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("rules.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);

        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }


}