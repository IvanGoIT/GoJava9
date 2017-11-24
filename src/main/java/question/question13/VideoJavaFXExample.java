package question.question13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class VideoJavaFXExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();

        String path = "http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_1mb.mp4";
        Media media = new Media(path);
        MediaPlayer player = new MediaPlayer(media);

        MediaView mediaView = new MediaView(player);
        root.getChildren().add(mediaView);

        Scene scene = new Scene(root, 1024, 768);

        primaryStage.setScene(scene);
        primaryStage.show();


        player.play();
    }
}
