package com.example.controller;

import com.example.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static com.example.MainApplication.stage;
import static javafx.application.Platform.exit;

public class MainController {

    @FXML
    protected void pressButtonPlay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("preparation.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        scene.getStylesheets().add("style.css");
        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void pressButtonLeave() throws Exception {
        exit();
    }
