package com.example.chess_unlimited.figures;

public enum Figures {

    A1  (0.0, 500.0), A2  (0.0, 400.0), A3  (0.0, 300.0), A4  (0.0, 200.0), A5  (0.0, 100.0), A6  (0.0, 0.0),
    B1(100.0, 500.0), B2(100.0, 400.0), B3(100.0, 300.0), B4(100.0, 200.0), B5(100.0, 100.0), B6(100.0, 0.0),
    C1(200.0, 500.0), C2(200.0, 400.0), C3(200.0, 300.0), C4(200.0, 200.0), C5(200.0, 100.0), C6(200.0, 0.0),
    D1(300.0, 500.0), D2(300.0, 400.0), D3(300.0, 300.0), D4(300.0, 200.0), D5(300.0, 100.0), D6(300.0, 0.0),
    E1(400.0, 500.0), E2(400.0, 400.0), E3(400.0, 300.0), E4(400.0, 200.0), E5(400.0, 100.0), E6(400.0, 0.0),
    F1(500.0, 500.0), F2(500.0, 400.0), F3(500.0, 300.0), F4(500.0, 200.0), F5(500.0, 100.0), F6(500.0, 0.0);

    public final double posX;
    public final double posY;

    public static String deck = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\deck.png";
    public static String queenW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\queenW.png";
    public static String queenB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\queenB.png";
    public static String kingW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\kingW.png";
    public static String kingB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\kingB.png";
    public static String horseW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\horseW.png";
    public static String horseB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\horseB.png";
    public static String ladW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\ladW.png";
    public static String ladB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\ladB.png";
    public static String slonW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\slonW.png";
    public static String slonB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\slonB.png";
    public static String peshW = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\peshW.png";
    public static String peshB = "C:\\Users\\iLLUSiON\\IdeaProjects\\chess_unlimited\\src\\main\\java\\com\\example\\chess_unlimited\\pictures\\peshB.png";

    Figures(double posX, double posY){
        this.posX = posX;
        this.posY = posY;
    }

    public double getX(){
        return posX;
    }

    public double getY(){
        return posY;
    }
}
