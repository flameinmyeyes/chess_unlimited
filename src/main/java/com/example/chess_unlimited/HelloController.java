package com.example.chess_unlimited;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class HelloController {
    @FXML
    private Label welcomeText;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}