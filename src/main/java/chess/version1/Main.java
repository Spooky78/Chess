package chess.version1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private final Pane root = new Pane();
    private final Tile[][] board = new Tile[Defaults.GRID_DIMENSION][Defaults.GRID_DIMENSION];

    @Override
    public void start(Stage primaryStage){
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Parent createContent() {
        root.setPrefSize(Defaults.WINDOW_SIZE,Defaults.WINDOW_SIZE);
        int tileSize = Defaults.WINDOW_SIZE/Defaults.GRID_DIMENSION;
        System.out.println(tileSize);

        for (int i=0; i<Defaults.GRID_DIMENSION; i++) {
            for (int j=0; j<Defaults.GRID_DIMENSION; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j*tileSize);
                tile.setTranslateY(i*tileSize);

                root.getChildren().add(tile);
                board[j][i] = tile;
            }
        }

        return root;
    }
}