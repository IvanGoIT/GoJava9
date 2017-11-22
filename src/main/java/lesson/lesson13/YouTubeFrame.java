package lesson.lesson13;

import com.mashape.unirest.http.HttpResponse;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lesson.lesson13.entities.YouTubeActivityItem;
import lesson.lesson13.entities.YouTubeResponse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YouTubeFrame extends Application {
    private static final int HEIGHT = 300;

    ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Pane content = new Pane();
        content.setTranslateX(0);
        content.setTranslateY(50);

        TextField textChannelId = new TextField("UCT1d4QydLziQUmp_lqQirMQ");
        textChannelId.setTranslateX(10);
        textChannelId.setTranslateY(10);
        Button btnSendRequest = new Button("Request");
        btnSendRequest.setTranslateX(180);
        btnSendRequest.setTranslateY(10);

        root.getChildren().addAll(content, textChannelId, btnSendRequest);

        btnSendRequest.setOnMouseClicked((event) -> {
            String channelId = textChannelId.getText();
            pool.submit(() -> {
                HttpResponse<YouTubeResponse> response = YouTubeClient.getActivities(channelId, 5);
                System.out.println("Response Code: " + response.getStatus());
                YouTubeResponse body = response.getBody();
                Platform.runLater(() -> {
                    printResult(content, body);
                });
            });
        });

        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();
    }

    private void printResult(Pane content, YouTubeResponse response) {
        content.getChildren().clear();

        for(int i = 0; i < response.items.size(); i++) {
            YouTubeActivityItem item = response.items.get(i);

            TextField textTitle = new TextField(item.snippet.title);
            textTitle.setTranslateX(10);
            textTitle.setTranslateY(HEIGHT * i);
            content.getChildren().addAll(textTitle);

            int width = 10;
            int y = 0;
            if (item.snippet.thumbnails.medium != null) {
                ImageView imageMedium = new ImageView(new Image(item.snippet.thumbnails.medium.url));
                imageMedium.setTranslateX(width);
                imageMedium.setTranslateY(y);
                imageMedium.setFitHeight(calcPictureSize(item.snippet.thumbnails.medium.height));
                imageMedium.setFitWidth(calcPictureSize(item.snippet.thumbnails.medium.width));
                content.getChildren().addAll(imageMedium);
            }

            if (item.snippet.thumbnails.high != null) {
                ImageView imageHigh = new ImageView(new Image(item.snippet.thumbnails.high.url));
                imageHigh.setTranslateX(width += item.snippet.thumbnails.medium.width);
                imageHigh.setTranslateY(y);
                imageHigh.setFitHeight(calcPictureSize(item.snippet.thumbnails.high.height));
                imageHigh.setFitWidth(calcPictureSize(item.snippet.thumbnails.high.width));
                content.getChildren().addAll(imageHigh);
            }

            if (item.snippet.thumbnails.standard != null) {
                ImageView imageStandard = new ImageView(new Image(item.snippet.thumbnails.standard.url));
                imageStandard.setTranslateX(width += item.snippet.thumbnails.high.width);
                imageStandard.setTranslateY(y);
                imageStandard.setFitHeight(calcPictureSize(item.snippet.thumbnails.standard.height));
                imageStandard.setFitWidth(calcPictureSize(item.snippet.thumbnails.standard.width));
                content.getChildren().addAll(imageStandard);
            }

            if (item.snippet.thumbnails.maxres != null) {
                ImageView imageMaxres = new ImageView(new Image(item.snippet.thumbnails.maxres.url));
                imageMaxres.setTranslateX(width += item.snippet.thumbnails.standard.width);
                imageMaxres.setTranslateY(y);
                imageMaxres.setFitHeight(calcPictureSize(item.snippet.thumbnails.maxres.height));
                imageMaxres.setFitWidth(calcPictureSize(item.snippet.thumbnails.maxres.width));
                content.getChildren().addAll(imageMaxres);
            }
        }
    }

    private double calcPictureSize(int originalSize) {
        return Math.min(HEIGHT, originalSize);
    }
}
