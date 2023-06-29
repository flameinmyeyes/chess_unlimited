package com.example.chess_unlimited;

import com.example.chess_unlimited.figures.FigureInterface;
import com.example.chess_unlimited.figures.Figures;
import com.example.chess_unlimited.figures.MoveInterface;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Figure extends Logic implements FigureInterface, MoveInterface {

    public static List<ImageView> whiteFigureList = HelloApplication.whiteListFigures;
    public static List<ImageView> blackFigureList = HelloApplication.blackFigureList;

    public double startWhitePositionX;
    public double startWhitePositionY;
    public double startBlackPositionX;
    public double startBlackPositionY;

    double endWhitePositionX;
    double endWhitePositionY;
    double endBlackPositionX;
    double endBlackPositionY;

    public void setWhitePositionX(double startWhitePositionX){
        this.startWhitePositionX = startWhitePositionX;
    }

    public void setWhitePositionY(double startWhitePositionY){
        this.startWhitePositionY = startWhitePositionY;
    }

    public void setBlackPositionX(double startBlackPositionX){
        this.startBlackPositionX = startBlackPositionX;
    }

    public void setBlackPositionY(double startBlackPositionY){
        this.startBlackPositionY = startBlackPositionY;
    }

    public void getWhitePositionX(double endWhitePositionX){
        this.endWhitePositionX = endWhitePositionX;
        System.out.println("white x"+ endWhitePositionX);
    }

    public void getWhitePositionY(double endWhitePositionY){
        this.endWhitePositionY = endWhitePositionY;
        System.out.println("white y"+ endWhitePositionY);
    }

    public void getBlackPositionX(double endBlackPositionX){
        this.endBlackPositionX = endBlackPositionX;
        System.out.println("black x"+ endBlackPositionX);
    }

    public void getBlackPositionY(double endBlackPositionY){
        this.endBlackPositionY = endBlackPositionY;
        System.out.println("black y"+ endBlackPositionY);
    }

    public double getWhitePositionX(ImageView imageView){
        return imageView.getX();
    }

    public double getWhitePositionY(ImageView imageView){
        return imageView.getY();
    }

    public ImageView createWhiteFigure(String filePath, Figures figurePos) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(filePath));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        setWhitePositionX(figurePos.getX());
        setWhitePositionY(figurePos.getY());
        imageView.setX(figurePos.getX());
        imageView.setY(figurePos.getY());

        imageView.setAccessibleText("White");
        return imageView;
    }

    public ImageView createBlackFigure(String filePath, Figures figurePos) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(filePath));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        setBlackPositionX(figurePos.getX());
        setBlackPositionY(figurePos.getY());
        imageView.setX(figurePos.getX());
        imageView.setY(figurePos.getY());
        imageView.setAccessibleText("Black");
        return imageView;
    }

    public void setFigureOnPosition(ImageView imageView){
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
            imageView.setX(Math.ceil(imageView.getX()));
            imageView.setY(Math.ceil(imageView.getY()));
            System.out.println(imageView.getX());
            System.out.println(imageView.getY());
        });
    }

    public void mouseMoveWhite(ImageView imageView){
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

    public void mouseMoveBlack(ImageView imageView){
        setBlackPositionX(getX(imageView));
        setBlackPositionY(getY(imageView));

        imageView.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!moveWhite) {
                    imageView.setX(mouseEvent.getX() - 50);
                    imageView.setY(mouseEvent.getY() - 50);

//                    System.out.println(imageView.getX());
//                    System.out.println(imageView.getY());
                }
            }
        });
    }

    public void moveLeft(ImageView imageView, int len){

    }

    public void moveRight(){

    }

//    public Boolean conditionMoveUp(MouseEvent mouseEvent, double colorPosX, double colorPosY, int size){
//        if ((colorPosY - (50.0 + size*100.0)) < mouseEvent.getY() - (size*100.0 - 50.0) &&
//                (colorPosY - (size*100.0 - 50.0)) > mouseEvent.getY() - (size*100.0 - 50.0) &&
//                (colorPosX + 50.0) > mouseEvent.getX() - 50 &&
//                (colorPosX - 50.0) < mouseEvent.getX() - 50){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public void deleteWhiteFigure(Figure move){
//        for (ImageView iw:blackFigureList){
//            if(startWhitePositionX == iw.getX() && startWhitePositionY + 100.0 == iw.getY()){
//                iw.setVisible(false);
//                whiteFigureList.remove(iw);
//                imageView.setX(startBlackPositionX);
//                imageView.setY(startBlackPositionY + size*100.0);
//                setBlackPositionX(startBlackPositionX);
//                setBlackPositionY(startBlackPositionY + size*100.0);
//                setMoveWhite(true);
//                break;
//            }else{
//                imageView.setX(startBlackPositionX);
//                imageView.setY(startBlackPositionY);
//                setMoveWhite(true);
//            }
//        }
    }

    public Figure deleteBlackFigure(ImageView imageView, int size, String moveDirection){

        double posX = (double) checkEnemyFigure(size, moveDirection).get(0);
        double posY = (double) checkEnemyFigure(size, moveDirection).get(1);

        System.out.println(posX);
        System.out.println(posY);

        for (ImageView iw:blackFigureList){
            //проверка на наличие вражеской фигуры на поле
            if(posX == iw.getX() && posY == iw.getY()){
                System.out.println("x"+ iw.getX());
                iw.setVisible(false);
                blackFigureList.remove(iw);
                moveDirection(imageView, size, moveDirection);
                setMoveWhite(false);
                break;
            }else{
                imageView.setX(startWhitePositionX);
                imageView.setY(startWhitePositionY);
                setMoveWhite(true);
            }
        }
        return this;
    }

    public Figure deleteFigure(ImageView imageView, int size){
        for (ImageView iw:blackFigureList){
            //проверка на наличие вражеской фигуры на поле
            if(imageView.getX() == iw.getX() && imageView.getY() == iw.getY()){
                System.out.println("imageView.getX():"+ imageView.getX());
                System.out.println("iw.getX():"+ iw.getX());
                iw.setVisible(false);
                blackFigureList.remove(iw);
                setMoveWhite(false);
                break;
            }else{
                imageView.setX(startWhitePositionX);
                imageView.setY(startWhitePositionY);
                setMoveWhite(true);
            }
        }
        return this;
    }

    public ArrayList checkEnemyFigure(int size, String moveDirection){

        ArrayList<Double> arrayList = new ArrayList<>();

        switch (moveDirection) {
            case ("moveUpWhite"):
                arrayList.add(startWhitePositionX);
                arrayList.add(startWhitePositionY - size*100.0);
                break;
            case ("moveDownBlack"):

                break;
            case ("moveLeftUpWhite"):
                arrayList.add(startWhitePositionX - size*100.0);
                arrayList.add(startWhitePositionY - size*100.0);
                break;
            case ("moveRightUpWhite"):
                arrayList.add(startWhitePositionX + size*100.0);
                arrayList.add(startWhitePositionY - size*100.0);
                break;
        }
        return arrayList;
    }

    public Figure moveDirection(ImageView imageView, int size, String moveDirection){

        switch (moveDirection) {
            case ("moveUpWhite"):
                moveUpWhite(imageView, size);
                break;
            case ("moveDownBlack"):
                moveDownBlack(imageView, size);
                break;
            case ("moveLeftUpWhite"):
                moveLeftUpWhite(imageView, size);
                break;
            case ("moveRightUpWhite"):
                moveRightUpWhite(imageView, size);
                break;
        }
        return this;
    }


    public Figure moveUpWhite(ImageView imageView, int size){
        imageView.setX(startWhitePositionX);
        imageView.setY(startWhitePositionY - size*100.0);
        setWhitePositionX(startWhitePositionX);
        setWhitePositionY(startWhitePositionY - size*100.0);
        setMoveWhite(false);
        return this;
    }

    public void moveDownBlack(ImageView imageView, int size){
        imageView.setX(startBlackPositionX);
        imageView.setY(startBlackPositionY + size*100.0);
        setBlackPositionX(startBlackPositionX);
        setBlackPositionY(startBlackPositionY + size*100.0);
        setMoveWhite(true);
    }

    public Figure moveLeftUpWhite(ImageView imageView, int size){
        imageView.setX(startWhitePositionX - size*100.0);
        imageView.setY(startWhitePositionY - size*100.0);
        setWhitePositionX(startWhitePositionX - size*100.0);
        setWhitePositionY(startWhitePositionY - size*100.0);
        setMoveWhite(false);
        return this;
    }

    public Figure moveRightUpWhite(ImageView imageView, int size){
        imageView.setX(startWhitePositionX + size*100.0);
        imageView.setY(startWhitePositionY - size*100.0);
        setWhitePositionX(startWhitePositionX + size*100.0);
        setWhitePositionY(startWhitePositionY - size*100.0);
        setMoveWhite(false);
        return this;
    }

    public void moveLeftDown(){

    }

    public void moveRightDown(){

    }

//    public double getX(ImageView imageView){
//        return imageView.getX();
//    }

    public double getY(ImageView imageView){
        return imageView.getY();
    }

}
