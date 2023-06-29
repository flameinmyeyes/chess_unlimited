module com.example.chess_unlimited {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;


    opens com.example.chess_unlimited to javafx.fxml;
    exports com.example.chess_unlimited;
}