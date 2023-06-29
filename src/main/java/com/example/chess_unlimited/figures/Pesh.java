package com.example.chess_unlimited.figures;

import com.example.chess_unlimited.Figure;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Pesh extends Figure implements FigureInterface{

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
                }
                //вправо вверх на 1
                else if ((startWhitePositionY - 150.0) < mouseEvent.getY() - 50 &&
                         (startWhitePositionY - 50.0) > mouseEvent.getY() - 50 &&
                         (startWhitePositionX + 150.0) > mouseEvent.getX() - 50 &&
                         (startWhitePositionX - 50.0) < mouseEvent.getX() - 50) {
                    moveRightUpWhite(imageView, 1);
                    deleteFigure(imageView, 1);
//                    deleteBlackFigure(imageView, 1, "moveRightUpWhite");
                }
                //влево вверх на 1
            else if ((startWhitePositionY - 150.0) < mouseEvent.getY() - 50 &&
                     (startWhitePositionY - 50.0) > mouseEvent.getY() - 50 &&
                     (startWhitePositionX - 150.0) < mouseEvent.getX() - 50 &&
                     (startWhitePositionX - 50.0) > mouseEvent.getX() - 50) {
                    moveLeftUpWhite(imageView, 1);
                    deleteFigure(imageView, 1);
//                    deleteBlackFigure(imageView, 1, "moveLeftUpWhite");
            }
            else {
                    imageView.setX(startWhitePositionX);
                    imageView.setY(startWhitePositionY);
                }
            }
        });
    }

    //Black
    public void setBlackFigureOnPosition(ImageView imageView){

        mouseMoveBlack(imageView);

        imageView.setOnMouseReleased(mouseEvent -> {
            if (!moveWhite) {
                //вниз на 1
                System.out.println("startBlackPositionY:"+startBlackPositionY);
                System.out.println("mouseEvent.getY:"+mouseEvent.getY());
                if ((startBlackPositionY + 150.0) > mouseEvent.getY() - 50 &&
                    (startBlackPositionY + 50.0) < mouseEvent.getY() - 50 &&
                    (startBlackPositionX + 50.0) > mouseEvent.getX() - 50 &&
                    (startBlackPositionX - 50.0) < mouseEvent.getX() - 50) {
                    moveDownBlack(imageView,1);
                }
                //вправо вниз на 1
                else if ((startBlackPositionY + 150.0) > mouseEvent.getY() - 50 &&
                         (startBlackPositionY + 50.0) < mouseEvent.getY() - 50 &&
                         (startBlackPositionX + 150.0) > mouseEvent.getX() - 50 &&
                         (startBlackPositionX - 50.0) < mouseEvent.getX() - 50) {
                    moveRightUpWhite(imageView,1);
                }
                //влево вниз на 1
                else if ((startBlackPositionY + 150.0) > mouseEvent.getY() - 50 &&
                         (startBlackPositionY + 50.0) < mouseEvent.getY() - 50 &&
                         (startBlackPositionX - 150.0) < mouseEvent.getX() - 50 &&
                         (startBlackPositionX - 50.0) > mouseEvent.getX() - 50) {
                    moveLeftUpWhite(imageView,1);
                }
                else {
                    imageView.setX(startBlackPositionX);
                    imageView.setY(startBlackPositionY);
                }
            }
        });
    }
}
