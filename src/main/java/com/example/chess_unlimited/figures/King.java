package com.example.chess_unlimited.figures;

import com.example.chess_unlimited.Figure;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;

public class King extends Figure {

    //White
    public void setWhiteFigureOnPosition(ImageView imageView){

        mouseMoveWhite(imageView);

        imageView.setOnMouseReleased(mouseEvent -> {
            if (moveWhite) {
                //вверх на 1
                if ((startWhitePositionY - 150.0) < mouseEvent.getY() - 50 &&
                        (startWhitePositionY - 50.0) > mouseEvent.getY() - 50 &&
                        (startWhitePositionX + 50.0) > mouseEvent.getX() - 50 &&
                        (startWhitePositionX - 50.0) < mouseEvent.getX() - 50) {
                    moveUpWhite(imageView, 1);
                    deleteFigure(imageView, 1);
                }
                //вправо вверх на 1
                else if ((startWhitePositionY - 150.0) < mouseEvent.getY() - 50 &&
                        (startWhitePositionY - 50.0) > mouseEvent.getY() - 50 &&
                        (startWhitePositionX + 150.0) > mouseEvent.getX() - 50 &&
                        (startWhitePositionX - 50.0) < mouseEvent.getX() - 50) {
                    moveRightUpWhite(imageView, 1);
                    deleteFigure(imageView, 1);
                }
                //влево вверх на 1
                else if ((startWhitePositionY - 150.0) < mouseEvent.getY() - 50 &&
                        (startWhitePositionY - 50.0) > mouseEvent.getY() - 50 &&
                        (startWhitePositionX - 150.0) < mouseEvent.getX() - 50 &&
                        (startWhitePositionX - 50.0) > mouseEvent.getX() - 50) {
                    moveLeftUpWhite(imageView, 1);
                    deleteFigure(imageView, 1);
                }
                else {
                    imageView.setX(startWhitePositionX);
                    imageView.setY(startWhitePositionY);
                }
            }
        });
    }

}
