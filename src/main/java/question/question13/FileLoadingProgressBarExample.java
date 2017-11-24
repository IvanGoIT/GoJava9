package question.question13;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileLoadingProgressBarExample extends Application {
    private static final String LINK = "http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_10mb.mp4";
    private static final String FILE_SAVE_TO = "files/question13/downloaded video.mp4";

    private final ExecutorService pool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();


        ProgressBar progressBar = new ProgressBar();
        progressBar.setTranslateX(200);

        Text progressText = new Text();
        progressText.setTranslateX(progressBar.getTranslateX());
        progressText.setTranslateY(progressBar.getTranslateY());

        Button btnLoad = new Button("Load");
        btnLoad.setOnMouseClicked((event) -> {
            pool.submit(() -> {
                try {
                    URL url = new URL(LINK);

                    URLConnection conn = url.openConnection();
                    int fileLength = conn.getContentLength();
                    int downloadedLength = 0;
                    System.out.println("fileLength = " + fileLength);

                    BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
                    FileOutputStream fis = new FileOutputStream(FILE_SAVE_TO);
                    byte[] buffer = new byte[1024 * 64];
                    int count = 0;
                    while((count = bis.read(buffer,0, buffer.length)) != -1) {
                        fis.write(buffer, 0, count);
                        downloadedLength += count;
                        double percent = (double)downloadedLength / fileLength;
                        Platform.runLater(() -> {
                            progressBar.setProgress(percent);
                            progressText.setText(Integer.toString((int) (percent * 100)) + "%");
                        });
                    }
                    fis.close();
                    bis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });

        root.getChildren().addAll(progressBar, btnLoad, progressText);

        Scene scene = new Scene(root, 1024, 768);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
