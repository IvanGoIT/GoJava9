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

    void drawCircle(GraphicsContext gc, int x, int y, float radius) {
        gc.setStroke(RandomColor.getRandom());
        gc.setLineWidth(RandomColor.random(1, 10));
        gc.strokeOval(x + radius, y + radius, radius * 2, radius * 2);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(1000,800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for(int i = 0; i < 200; i++) {
            drawCircle(gc,
                    RandomColor.random(0, (int) canvas.getWidth()),
                    RandomColor.random(0, (int) canvas.getHeight()),
                    RandomColor.random(10, 100));
        }

        Pane root = new Pane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
