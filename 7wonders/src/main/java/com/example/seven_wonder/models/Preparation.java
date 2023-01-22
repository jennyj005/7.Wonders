package com.example.seven_wonder.models;

import com.example.seven_wonder.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.seven_wonder.MainApplication.stage;

public class Preparation { // PREPARATION MISE EN PLACE DU JEU

    @FXML
    public Label error;

    @FXML
    public TextField nbPlayer;

    @FXML
    public GridPane gridPane;

    @FXML
    protected void backHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);

        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }
    /*
    235 cartes -
    7 cartes merveilles
    40 cartes rouges
    40 cartes vertes
    40 cartes bleues
    40 cartes jaunes
     */
    Cards cards = new Cards(1, "rouge", "bataille", 0, 0, null, "bouclier", null);

    public List<Wonders> generateWonder() {
        String[] nameWonder = {"Rhodes", "Olympie", "Alexandrie", "Babylone", "Halicarnasse", "Gizeh", "Ephese"};
        String[] effectWonder = {"Pioche une carte en plus", "test", "test2", "test3", "test4", "test5", "test6"};
        List<Wonders> wondersList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Wonders wonders = new Wonders(i, nameWonder[i], new ArrayList<>(), effectWonder[i], 0, "wonder" + i + ".png");
            wondersList.add(wonders);
        }
        return wondersList;
    }

    public List<ProgressCoins> generateProgress(int nbPlayer) {
        String[] nameProgress = {"Urbanisme", "Artisanat", "Joillerie", "test", "test", "test", "test", "Artisanat", "Joillerie", "test", "test", "test", "test"};
        String[] effectProgress = {"Pioche une carte en plus", "test", "test2", "test3", "test4", "test5", "test6", "test", "test2", "test3", "test4", "test5", "test6"};
        List<ProgressCoins> progressCoinsList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            ProgressCoins progressCoins = new ProgressCoins(i, nameProgress[i], effectProgress[i], null);
            progressCoinsList.add(progressCoins);
        }
        return progressCoinsList;
    }

    public void choiceNumber(ActionEvent actionEvent) {
        if (isNumeric(nbPlayer.getText())) {
            int choice = Integer.parseInt(nbPlayer.getText());
            if (choice < 2 || choice > 7) {
                error.setTextFill(Color.RED);
                error.setText("Error minimum 2 and maximum 7 players");
            } else {
                error.setText("");
                ChoiceBox choiceBox = new ChoiceBox();
                choiceBox.getItems().add("Rhodes");
                choiceBox.getItems().add("Olympie");
                choiceBox.getItems().add("Alexandrie");
                choiceBox.getItems().add("Babylone");
                choiceBox.getItems().add("Halicarnasse");
                choiceBox.getItems().add("Gizeh");
                choiceBox.getItems().add("Ephese");
                for (int i=0; i<choice; i++) {
                    gridPane.add(new Label("Pseudo player " + i+1),i,0);
                    gridPane.add(new TextField(),i,1);
                    gridPane.add(new Label("Wonder"), i, 2);
                }
                gridPane.getChildren().addAll(choiceBox);
                gridPane.getChildren().addAll(choiceBox);
                gridPane.getChildren().addAll(choiceBox);
                gridPane.getChildren().addAll(choiceBox);
            }
        }
    }

    private boolean isNumeric(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void confirmChoice(ActionEvent actionEvent) {


    }

    public void backHome(ActionEvent actionEvent) {


    }


}
