package lesson.lesson12;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpDownloading extends Application {

    ExecutorService pool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        ImageView imageView = new ImageView();
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        root.getChildren().add(imageView);

        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();

        pool.submit(() -> {
            try {
                URL url = new URL("http://www.technocrazed.com/wp-content/uploads/2015/12/beautiful-wallpaper-download-13.jpg");
                Image image = new Image(url.openStream());
                Platform.runLater(() -> {imageView.setImage(image);});
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        pool.shutdown();
    }
}
