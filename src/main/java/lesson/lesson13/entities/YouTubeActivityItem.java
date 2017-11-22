package lesson.lesson13.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeActivityItem {

    public YouTubeActivityItemSnippet snippet;
}
