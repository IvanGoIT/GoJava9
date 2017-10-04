package lesson.lesson6.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lesson.lesson4.Recursion;

public class AdvancedFXMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void initViews(Pane root) {
        for(int i = 0; i < 10; i++) {
            int x = i + 1;
            int fact = Recursion.fact(x);

            Text textArea = new Text("Факториал от " + x + " = " + fact);
            textArea.setTranslateX(10);
            textArea.setTranslateY(100 + 30 * i);
            root.getChildren().addAll(textArea);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // our code

        Pane root = new Pane(); // создаем пустую панель
        initViews(root);

        Scene scene = new Scene(root); // создаем сцену и кладем внутрь root (пустую панельку)
        primaryStage.setScene(scene); // привязываем окно программы к нашей сцене

        primaryStage.show(); // отображаем окно
    }
}