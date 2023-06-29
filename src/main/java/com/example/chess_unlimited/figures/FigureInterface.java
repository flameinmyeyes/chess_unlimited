package com.example.chess_unlimited.figures;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;

import static com.example.chess_unlimited.Logic.moveWhite;

public interface FigureInterface {

    default double getX(ImageView imageView){
        return imageView.getX();
    }

    default double getY(ImageView imageView){
        return imageView.getY();
    }

    public void setWhitePositionX(double startWhitePositionX);
    public void setWhitePositionY(double setWhitePositionY);

    default public void mouseMove(ImageView imageView){
        setWhitePositionX(getX(imageView));
        setWhitePositionY(getY(imageView));

        imageView.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (moveWhite) {
                    imageView.setX(mouseEvent.getX() - 50);
                    imageView.setY(mouseEvent.getY() - 50);

                    System.out.println(imageView.getX());
                    System.out.println(imageView.getY());
                }
            }
        });
    }

    default public void moveLeft(ImageView imageView){

    }
    default public void moveRight(){

    }
    default public void moveUp(){

    }
    default public void moveDown(){

    }
    default public void moveLeftUp(){

    }
    default public void moveRightUp(){

    }
    default public void moveLeftDown(){

    }
    default public void moveRightDown(){

    }
}
