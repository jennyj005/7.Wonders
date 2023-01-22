package com.example.seven_wonder.controller;

import com.example.seven_wonder.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import static com.example.seven_wonder.MainApplication.stage;

public class Rules
{
    @FXML
    protected void pressButtonReturn() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);

        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }
}
