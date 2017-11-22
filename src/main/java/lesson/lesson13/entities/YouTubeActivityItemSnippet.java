package lesson.lesson13.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeActivityItemSnippet {
    public String channelId;
    public String title;

    public Thumbnails thumbnails;
}
