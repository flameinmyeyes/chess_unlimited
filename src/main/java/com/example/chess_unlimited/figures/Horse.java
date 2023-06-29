package com.example.chess_unlimited.figures;

import com.example.chess_unlimited.Figure;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;

public class Horse extends Figure{

    public Horse() throws FileNotFoundException {
    }

    //White
    public void setWhiteFigureOnPosition(ImageView imageView){

        setWhitePositionX(getX(imageView));
        setWhitePositionY(getY(imageView));

        System.out.println("startPositionX:" + startWhitePositionX);
        System.out.println("startPositionY:" + startWhitePositionY);

        imageView.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView.setX(mouseEvent.getX()-50);
                imageView.setY(mouseEvent.getY()-50);
                System.out.println(mouseEvent.getX()-50);
                System.out.println(mouseEvent.getY()-50);
            }
        });
        imageView.setOnMouseReleased(mouseEvent -> {
            //Вверх вправо
            System.out.println("mouseEventY:" + mouseEvent.getY());

            if ((startWhitePositionY - 250.0) < mouseEvent.getY() - 50 &&
                    (startWhitePositionY + 50.0) > mouseEvent.getY() - 50 &&
                    (startWhitePositionX + 150.0) > mouseEvent.getX() - 50 &&
                    (startWhitePositionX + 50.0) < mouseEvent.getX() - 50) {
                imageView.setX(startWhitePositionX + 100.0);
                imageView.setY(startWhitePositionY - 200.0);
                setWhitePositionX(startWhitePositionX + 100.0);
                setWhitePositionY(startWhitePositionY - 200.0);
                getWhitePositionX(startWhitePositionX + 100.0);
                getWhitePositionY(startWhitePositionY - 200.0);
            } else {
                imageView.setX(startWhitePositionX);
                imageView.setY(startWhitePositionY);
            }
        });
    }

    //Black
    public void setBlackFigureOnPosition(ImageView imageView){

        setBlackPositionX(getX(imageView));
        setBlackPositionY(getY(imageView));

        System.out.println("startBlackPositionX:" + startBlackPositionX);
        System.out.println("startBlackPositionY:" + startBlackPositionY);

        imageView.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageView.setX(mouseEvent.getX()-50);
                imageView.setY(mouseEvent.getY()-50);
                System.out.println(mouseEvent.getX()-50);
                System.out.println(mouseEvent.getY()-50);
            }
        });
        imageView.setOnMouseReleased(mouseEvent -> {
            //На одну клетку вперед
            System.out.println("mouseEventY:" + mouseEvent.getY());

            if ((startBlackPositionY + 150.0) > mouseEvent.getY() - 50 &&
                    (startBlackPositionY + 50.0) < mouseEvent.getY() - 50 &&
                    (startBlackPositionX - 50.0) < mouseEvent.getX() - 50 &&
                    (startBlackPositionX + 50.0) > mouseEvent.getX() - 50) {
                imageView.setX(startBlackPositionX);
                imageView.setY(startBlackPositionY + 100.0);
                setBlackPositionX(startBlackPositionX);
                setBlackPositionY(startBlackPositionY + 100.0);
                getBlackPositionX(startBlackPositionX);
                getBlackPositionY(startBlackPositionY + 100.0);
            } else {
                imageView.setX(startBlackPositionX);
                imageView.setY(startBlackPositionY);
            }
        });
    }
}
