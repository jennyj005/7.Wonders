package com.example.seven_wonder.controller;

import com.example.seven_wonder.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.seven_wonder.MainApplication.stage;

public class MainStage {

    int maxplayer; //disparaîtra pour être remplacé par la variable définie lors du choix du nb de joueur

    @FXML
    protected void pressButtonPlay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("MiddleEarth.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);

        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }

    protected void ryuk(ArrayList players,int WhoTurn, ArrayList CardDeck){ //Système de gestion de la partie
        //Who's turn?
        boolean Victory = false;
        while (Victory == false) {
        if (WhoTurn <maxplayer-1){
            List playerturn ) (List) players.get(WhoTurn);
            int score = (int) playerturn.get(1);
            draw(CardDeck, WhoTurn, maxplayer-1); // player.size renvoit la taille de la liste player qui contient n player correspondant au nombre de joueurs de la partie
            choiceEvent();
        } else {
            List playerTurn = (List) players.get(maxplayer-1);
            int score = (int) playerTurn.get(1);
            draw(CardDeck, maxplayer-1, maxplayer-1); // player.size renvoit la taille de la liste player qui contient n player correspondant au nombre de joueurs de la partie
            choiceEvent();
        }
        WhoTurn +=1;
        Victory = limiTest(); //Vérifie si une condition de victoire est remplie
        }
        endGame();


        //What am I gonna do ? -Start Boucle1
        //Dépend du choix -Boucle1
        //Back to the choice -EndBoucle1
        //Next opponent
        //Check this player
    }

    private void endGame() { //Switch de stage vers stage affichant gagnant+score
    }

    private boolean limiTest() {
        return false;
    }

    private void choiceEvent() {
        boolean endActionTurnPlayer = false; //Ne changera que lorsque l'on souhaitera finir son tour
        eventChecker();//Vérifie la possibilité d'exécution des évènements
        //afficher des boutons listant les events possibles lors de ce tour
    }


    protected void draw(ArrayList CardDeck, int WhoTurn, int maxplayer){
        //Proposer un choix
        int theOne = choice();
        boolean CheckIsGood1;
        List mainPackage = (List) CardDeck.get(8); //8 car on s'assurera qu'il s'agit du packet principale
        List pPackage=(List) CardDeck.get(WhoTurn);
        if (WhoTurn < 7) {
            List otherPackage = (List) CardDeck.get(WhoTurn + 1);
            CheckIsGood1 = checkifbagEmpty(otherPackage); //vérifie s'il reste des éléments dans la pile
        } else {
            List otherPackage = (List) CardDeck.get(1);
            CheckIsGood1 = checkifbagEmpty(otherPackage); //vérifie s'il reste des éléments dans la pile
        }
        boolean CheckIsGood2 = checkifbagEmpty(pPackage); //vérifie s'il reste des éléments dans la pile
        boolean CheckIsGood3 = checkifbagEmpty(mainPackage); //vérifie s'il reste des éléments dans la pile
        //Penser à créer un check si les packet sont vides pas besoin d'aller plus loin
        Card cardtake = takeIt(CheckIsGood1,CheckIsGood2,CheckIsGood3);
        addtoplayerStuff (cardtake); //Attribue la carte de la pile sélectionnée au joueur


        int varcard = (int) mainPackage.get(1); //Passer le système en bag détails sur la page http://gallium.inria.fr/~maranget/X/421/poly/piles.html


        //Attribuer la carte de la pile sélectionnée
        //Fin de la fonction
    }

    private int choice() {
        int theOne = 0; //penser à retirer le =0 pour la valeur choisie
        //A éditer en fonction du JavaFX
        return theOne;
    }
}
