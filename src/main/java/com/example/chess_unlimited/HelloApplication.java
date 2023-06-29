package com.example.chess_unlimited;

import com.example.chess_unlimited.figures.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static List<ImageView> whiteListFigures = new ArrayList<>();
    public static List<ImageView> blackFigureList = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        ImageView deck = new Deck().createDeck(Figures.deck,800,800);

        //White
        ImageView queenW = new Queen().createWhiteFigure(Figures.queenW, Figures.C1);
        ImageView kingW = new King().createWhiteFigure(Figures.kingW, Figures.D1);
        ImageView horseW = new Horse().createWhiteFigure(Figures.horseW, Figures.B1);
        ImageView ladW1 = new Lad().createWhiteFigure(Figures.ladW, Figures.A1);
        ImageView ladW2 = new Lad().createWhiteFigure(Figures.ladW, Figures.F1);
        ImageView slonW = new Slon().createWhiteFigure(Figures.slonW, Figures.E1);
        ImageView peshW1 = new Pesh().createWhiteFigure(Figures.peshW, Figures.A2);
        ImageView peshW2 = new Pesh().createWhiteFigure(Figures.peshW, Figures.B2);
        ImageView peshW3 = new Pesh().createWhiteFigure(Figures.peshW, Figures.C2);
        ImageView peshW4 = new Pesh().createWhiteFigure(Figures.peshW, Figures.D2);
        ImageView peshW5 = new Pesh().createWhiteFigure(Figures.peshW, Figures.E2);
        ImageView peshW6 = new Pesh().createWhiteFigure(Figures.peshW, Figures.F2);

//        ImageView queenW = new Queen().createWhiteFigure(Figures.queenW,100,100,200.0,500.0);
//        ImageView kingW = new King().createWhiteFigure(Figures.peshW,100,100,300.0,500.0);
//        ImageView horseW = new Horse().createWhiteFigure(Figures.horseW,100,100,100.0,500.0);
//        ImageView ladW1 = new Lad().createWhiteFigure(Figures.ladW,100,100,0.0,500.0);
//        ImageView ladW2 = new Lad().createWhiteFigure(Figures.ladW,100,100,500.0,500.0);
//        ImageView slonW = new Slon().createWhiteFigure(Figures.slonW,100,100,400.0,500.0);
//        ImageView peshW1 = new Pesh().createWhiteFigure(Figures.peshW,100,100,0.0,400.0);
//        ImageView peshW2 = new Pesh().createWhiteFigure(Figures.peshW,100,100,100.0,400.0);
//        ImageView peshW3 = new Pesh().createWhiteFigure(Figures.peshW,100,100,200.0,400.0);
//        ImageView peshW4 = new Pesh().createWhiteFigure(Figures.peshW,100,100,300.0,400.0);
//        ImageView peshW5 = new Pesh().createWhiteFigure(Figures.peshW,100,100,400.0,400.0);
//        ImageView peshW6 = new Pesh().createWhiteFigure(Figures.peshW,100,100,500.0,400.0);

        whiteListFigures.add(queenW);
        whiteListFigures.add(kingW);
        whiteListFigures.add(horseW);
        whiteListFigures.add(ladW1);
        whiteListFigures.add(ladW2);
        whiteListFigures.add(slonW);
        whiteListFigures.add(peshW1);
        whiteListFigures.add(peshW2);
        whiteListFigures.add(peshW3);
        whiteListFigures.add(peshW4);
        whiteListFigures.add(peshW5);
        whiteListFigures.add(peshW6);

        new Queen().setFigureOnPosition(queenW);
        new King().setWhiteFigureOnPosition(kingW);
        new Horse().setWhiteFigureOnPosition(horseW);
        new Lad().setFigureOnPosition(ladW1);
        new Lad().setFigureOnPosition(ladW2);
        new Slon().setFigureOnPosition(slonW);
        new Pesh().setWhiteFigureOnPosition(peshW1);
        new Pesh().setWhiteFigureOnPosition(peshW2);
        new Pesh().setWhiteFigureOnPosition(peshW3);
        new Pesh().setWhiteFigureOnPosition(peshW4);
        new Pesh().setWhiteFigureOnPosition(peshW5);
        new Pesh().setWhiteFigureOnPosition(peshW6);

        //Black
        ImageView queenB = new Queen().createBlackFigure(Figures.queenB, Figures.C6);
        ImageView kingB = new King().createBlackFigure(Figures.kingB, Figures.D6);
        ImageView horseB = new Horse().createBlackFigure(Figures.horseB, Figures.B6);
        ImageView ladB1 = new Lad().createBlackFigure(Figures.ladB, Figures.A6);
        ImageView ladB2 = new Lad().createBlackFigure(Figures.ladB, Figures.F6);
        ImageView slonB = new Slon().createBlackFigure(Figures.slonB, Figures.E6);
        ImageView peshB1 = new Pesh().createBlackFigure(Figures.peshB, Figures.A5);
        ImageView peshB2 = new Pesh().createBlackFigure(Figures.peshB, Figures.B5);
        ImageView peshB3 = new Pesh().createBlackFigure(Figures.peshB, Figures.C5);
        ImageView peshB4 = new Pesh().createBlackFigure(Figures.peshB, Figures.D5);
        ImageView peshB5 = new Pesh().createBlackFigure(Figures.peshB, Figures.E5);
        ImageView peshB6 = new Pesh().createBlackFigure(Figures.peshB, Figures.F5);

//        ImageView queenB = new Queen().createBlackFigure(Figures.queenB,100,100,200,0);
//        ImageView kingB = new King().createBlackFigure(Figures.kingB,100,100,300,0);
//        ImageView horseB = new Horse().createBlackFigure(Figures.horseB,100,100,100,0);
//        ImageView ladB1 = new Lad().createBlackFigure(Figures.ladB,100,100,0,0);
//        ImageView ladB2 = new Lad().createBlackFigure(Figures.ladB,100,100,500,0);
//        ImageView slonB = new Slon().createBlackFigure(Figures.slonB,100,100,400,0);
//        ImageView peshB1 = new Pesh().createBlackFigure(Figures.peshB,100,100,0,100);
//        ImageView peshB2 = new Pesh().createBlackFigure(Figures.peshB,100,100,100,100);
//        ImageView peshB3 = new Pesh().createBlackFigure(Figures.peshB,100,100,200,100);
//        ImageView peshB4 = new Pesh().createBlackFigure(Figures.peshB,100,100,300,100);
//        ImageView peshB5 = new Pesh().createBlackFigure(Figures.peshB,100,100,400,100);
//        ImageView peshB6 = new Pesh().createBlackFigure(Figures.peshB,100,100,500,100);

        blackFigureList.add(queenB);
        blackFigureList.add(kingB);
        blackFigureList.add(horseB);
        blackFigureList.add(ladB1);
        blackFigureList.add(ladB2);
        blackFigureList.add(slonB);
        blackFigureList.add(peshB1);
        blackFigureList.add(peshB2);
        blackFigureList.add(peshB3);
        blackFigureList.add(peshB4);
        blackFigureList.add(peshB5);
        blackFigureList.add(peshB6);

        new Queen().setFigureOnPosition(queenB);
        new King().setFigureOnPosition(kingB);
        new Horse().setBlackFigureOnPosition(horseB);
        new Lad().setFigureOnPosition(ladB1);
        new Lad().setFigureOnPosition(ladB2);
        new Slon().setFigureOnPosition(slonB);
        new Pesh().setBlackFigureOnPosition(peshB1);
        new Pesh().setBlackFigureOnPosition(peshB2);
        new Pesh().setBlackFigureOnPosition(peshB3);
        new Pesh().setBlackFigureOnPosition(peshB4);
        new Pesh().setBlackFigureOnPosition(peshB5);
        new Pesh().setBlackFigureOnPosition(peshB6);

        Group root = new Group(deck, queenW, kingW, horseW, ladW1, ladW2, peshW1, peshW2, peshW3, peshW4, peshW5, peshW6, slonW,
                                     queenB, kingB, horseB, ladB1, ladB2, peshB1, peshB2, peshB3, peshB4, peshB5, peshB6, slonB);

        stage.setScene(new Scene(root, 800, 800));
        stage.show();

    }

}
