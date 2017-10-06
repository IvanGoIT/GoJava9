package question.question6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;


public class FXMain extends Application {
    public static final int HEIGHT = 300;
    public static final int WIDTH = 300;

    public static void main(String[] args) {
        launch(args);
    }

    private void gradientDrawing(Pane root) {
        Stop[] stops = new Stop[] {
                new Stop(0, Color.CORAL),
                new Stop(0.5f, Color.YELLOW),
                new Stop(1, Color.WHITE)
        };
        LinearGradient gradient = new LinearGradient(
                0, 0,
                1, 1,
                true,
                CycleMethod.NO_CYCLE,
                stops);

        Rectangle rectangle = new Rectangle(0, 0, WIDTH, HEIGHT);
        rectangle.setFill(gradient);
        root.getChildren().add(rectangle);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        gradientDrawing(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(HEIGHT);
        primaryStage.setWidth(WIDTH);
        primaryStage.show();
    }
}
