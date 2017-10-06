package question.question6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class DrawingCircleExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    void drawCircle(GraphicsContext gc, float radius) {
        gc.setStroke(RandomColor.getRandom());
        gc.setLineWidth(RandomColor.random(1, 10));
        gc.strokeOval(50, 50, radius * 2, radius * 2);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(250,250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        drawCircle(gc, 30);
        drawCircle(gc, 10);
        drawCircle(gc, 60);

        Pane root = new Pane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
