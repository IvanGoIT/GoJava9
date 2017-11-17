package question.question12;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class JavaFXMultiThreadsExample extends Application {
    ExecutorService pool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        TextField inputArrayLength = new TextField("10");
        inputArrayLength.setTranslateX(10);
        inputArrayLength.setTranslateY(10);

        TextArea textArea = new TextArea();
        textArea.setTranslateX(10);
        textArea.setTranslateY(70);

        Button btnGenerateArray = new Button("Generate");
        btnGenerateArray.setTranslateX(250);
        btnGenerateArray.setTranslateY(10);
        btnGenerateArray.setOnMouseClicked((event) -> {
            int length = Integer.parseInt(inputArrayLength.getText());

            FutureTask<String> task = new FutureTask<>(() -> {
                ArrayList<Integer> result = new ArrayList<Integer>(length);

                for(int i = 0; i < length; i++) {
                    result.add(i+1);
                }

                String strResult = result.toString();
                Platform.runLater(() -> {
                    textArea.setText(strResult);
                });

                return strResult;
            });
            pool.execute(task);
        });

        root.getChildren().addAll(inputArrayLength, btnGenerateArray, textArea);

        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();
    }
}
