package lesson.lesson13.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnails {
    public ThumbnailImage medium;
    public ThumbnailImage high;
    public ThumbnailImage standard;
    public ThumbnailImage maxres;
}
