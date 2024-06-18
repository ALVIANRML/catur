package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My Chess Game");

        // Create Board and TimerPanel
        Board board = new Board();
        TimerPanel timerPanel = new TimerPanel();

        // Set the TimerPanel in the TOP and Board in the CENTER
        BorderPane root = new BorderPane();
        root.setTop(timerPanel);
        root.setCenter(board);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 690, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Link the timerPanel to the board so it can update the timers
        board.setTimerPanel(timerPanel);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
