package lesson.lesson13;

import com.mashape.unirest.http.HttpResponse;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lesson.lesson13.entities.ThumbnailImage;
import lesson.lesson13.entities.Thumbnails;
import lesson.lesson13.entities.YouTubeActivityItem;
import lesson.lesson13.entities.YouTubeResponse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YouTubeFrame extends Application {
    private static final int WINDOW_HEIGHT = 900;
    private static final int WINDOW_WIDTH = 1350;

    private static final int VERTICAL_OFFSET = 50;

    private final ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Pane content = new Pane();
        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setTranslateX(0);
        scrollPane.setTranslateY(VERTICAL_OFFSET);
        scrollPane.setPannable(true);
        scrollPane.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT - VERTICAL_OFFSET);

        // авто обновление размеров для scrollPane при ресайзе окна
        root.heightProperty().addListener((arg0, arg1, arg2) -> {
            scrollPane.setPrefHeight(arg2.doubleValue() - VERTICAL_OFFSET);
        });
        root.widthProperty().addListener((arg0, arg1, arg2) -> {
            scrollPane.setPrefWidth(arg2.doubleValue());
        });

        TextField textChannelId = new TextField("UCT1d4QydLziQUmp_lqQirMQ");
        textChannelId.setTranslateX(10);
        textChannelId.setTranslateY(10);
        Button btnSendRequest = new Button("Request");
        btnSendRequest.setTranslateX(180);
        btnSendRequest.setTranslateY(10);

        root.getChildren().addAll(scrollPane, textChannelId, btnSendRequest);

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
        primaryStage.setHeight(WINDOW_HEIGHT);
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.show();
    }

    private void printResult(Pane content, YouTubeResponse response) {
        content.getChildren().clear();

        int yOffset = 0;
        for(int i = 0; i < response.items.size(); i++) {
            YouTubeActivityItem item = response.items.get(i);

            TextField textTitle = new TextField(item.snippet.title);
            textTitle.setTranslateX(10);
            textTitle.setTranslateY(getMaxHeight(item.snippet.thumbnails) / 2);
            content.getChildren().addAll(textTitle);

            int width = 0;
            if (item.snippet.thumbnails._default != null) {
                generateImage(content, yOffset, width, item.snippet.thumbnails._default);
                width += item.snippet.thumbnails._default.width;
            }
            if (item.snippet.thumbnails.medium != null) {
                generateImage(content, yOffset, width, item.snippet.thumbnails.medium);
                width += item.snippet.thumbnails.medium.width;
            }
            if (item.snippet.thumbnails.high != null) {
                generateImage(content, yOffset, width, item.snippet.thumbnails.high);
                width += item.snippet.thumbnails.high.width;
            }
            if (item.snippet.thumbnails.standard != null) {
                generateImage(content, yOffset, width, item.snippet.thumbnails.standard);
                width += item.snippet.thumbnails.standard.width;
            }
            if (item.snippet.thumbnails.maxres != null) {
                generateImage(content, yOffset, width, item.snippet.thumbnails.maxres);
            }

            yOffset += getMaxHeight(item.snippet.thumbnails);
        }
    }

    private int getMaxHeight(Thumbnails thumbnails) {
        if (thumbnails.maxres != null) return thumbnails.maxres.height;
        if (thumbnails.standard != null) return thumbnails.standard.height;
        if (thumbnails.high != null) return thumbnails.high.height;
        if (thumbnails.medium != null) return thumbnails.medium.height;
        if (thumbnails._default != null) return thumbnails._default.height;
        return 30;
    }

    private void generateImage(Pane content, int y, int width, ThumbnailImage image) {
        if (image == null) return;

        ImageView imageView = new ImageView(new Image(image.url));
        imageView.setTranslateX(width);
        imageView.setTranslateY(y);
        imageView.setFitHeight(image.height);
        imageView.setFitWidth(image.width);

        content.getChildren().addAll(imageView);
        content.setPrefHeight(y + image.height);
        content.setPrefWidth(width + image.width);
    }
}
