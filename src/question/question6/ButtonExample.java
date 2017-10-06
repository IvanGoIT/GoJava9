package question.question6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;

    public static void main(String[] args) {
        launch(args);
    }

    private int clickCounter = 0;

    private void initButtons(Pane root) {
        Button button = new Button("Click me!");
        button.setTranslateX(100);
        button.setTranslateY(10);

        // lambda
        button.setOnMouseEntered(event -> button.setText("Oh NO!"));
        button.setOnMouseExited(event -> button.setText("Thx :)"));

        // lambda
        button.setOnMouseClicked(event -> {
            button.setText("Click me! " + ++clickCounter);
        });
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                button.setText("Click me! " + ++clickCounter);
            }
        });

        root.getChildren().add(button);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        initButtons(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(HEIGHT);
        primaryStage.setWidth(WIDTH);
        primaryStage.show();
    }
}
