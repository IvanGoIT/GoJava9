package lesson.lesson13.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnails {
    @JsonProperty("default")
    public ThumbnailImage _default;
    public ThumbnailImage medium;
    public ThumbnailImage high;
    public ThumbnailImage standard;
    public ThumbnailImage maxres;
}
