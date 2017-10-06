package question.question6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class FXMain extends Application {
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;

    public static void main(String[] args) {
        launch(args);
    }

    private void gradientDrawing(Pane root) {
        Stop[] stops = new Stop[] {
                new Stop(0, RandomColor.getRandom()),
                new Stop(0.5f, RandomColor.getRandom()),
                new Stop(1, RandomColor.getRandom())
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
