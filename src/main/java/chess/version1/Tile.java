package chess.version1;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends StackPane {
    public Tile() {
        int tileSize = Defaults.WINDOW_SIZE/Defaults.GRID_DIMENSION;
        Rectangle border = new Rectangle(tileSize,tileSize);
        border.setFill(null);
        border.setStroke(Color.BLACK);

        setAlignment(Pos.CENTER);
        getChildren().addAll(border);
    }
}
