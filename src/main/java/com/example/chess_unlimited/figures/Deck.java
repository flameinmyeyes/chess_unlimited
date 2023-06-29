package com.example.chess_unlimited.figures;

import com.example.chess_unlimited.Figure;
import com.example.chess_unlimited.Logic;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck extends Figure {

    public Deck() throws FileNotFoundException {

    }

    public ImageView createDeck(String filePath, Integer width, Integer Height) throws FileNotFoundException {

        new Logic().setMoveWhite(true);
        Image image = new Image(new FileInputStream(filePath));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(Height);
//        setWhitePositionX(posX);
//        setWhitePositionY(posY);
//        imageView.setX(posX);
//        imageView.setY(posY);

        return imageView;
    }
}
