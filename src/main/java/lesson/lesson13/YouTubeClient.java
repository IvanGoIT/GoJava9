package lesson.lesson13;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lesson.lesson13.entities.YouTubeResponse;

import java.io.IOException;

public class YouTubeClient {
    private static final String YOU_TUBE = "https://www.googleapis.com/youtube/v3/{method}";
    private static final String API_KEY = "AIzaSyAkEQ6jAjNgLhO4QZFjb6qgiE4ZUZhyQDY";

    static {
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private YouTubeClient(){}

    public static HttpResponse<String> getActivitiesString(String channelId, int maxResults) {
        try {
            return Unirest.get(YOU_TUBE)
                    .routeParam("method", "activities")
                    .queryString("channelId", channelId)
                    .queryString("maxResults", maxResults)
                    .queryString("part", "snippet")
                    .queryString("key", API_KEY)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HttpResponse<YouTubeResponse> getActivities(String channelId, int maxResults) {
        try {
            return Unirest.get(YOU_TUBE)
                    .routeParam("method", "activities")
                    .queryString("channelId", channelId)
                    .queryString("maxResults", maxResults)
                    .queryString("part", "snippet")
                    .queryString("key", API_KEY)
                    .asObject(YouTubeResponse.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }
}
