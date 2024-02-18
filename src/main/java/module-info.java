module chess.version1{
    requires javafx.controls;
    requires javafx.fxml;


    opens chess.version1 to javafx.fxml;
    exports chess.version1;
}