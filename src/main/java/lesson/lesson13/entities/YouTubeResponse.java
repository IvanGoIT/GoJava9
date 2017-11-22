package lesson.lesson13.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeResponse {
    public ArrayList<YouTubeActivityItem> items = new ArrayList<>();
}
