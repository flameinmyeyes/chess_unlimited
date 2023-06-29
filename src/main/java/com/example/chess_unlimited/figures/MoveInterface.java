package com.example.chess_unlimited.figures;

import com.example.chess_unlimited.Figure;
import javafx.scene.image.ImageView;

public interface MoveInterface {
    default void move(MoveInterface moveInterface) {
    }
}
