package question.question13;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.*;

public class HttpPostRequestExample {

    public static void main(String[] args) throws UnirestException, FileNotFoundException {
        String path = "files/question13/birds-of-paradise.jpg";
        File imageFile = new File(path);
        InputStream inputStream = new FileInputStream(imageFile);

        HttpResponse<String> response = Unirest.post("http://pictaculous.com/api/1.0/")
                .field("image", inputStream, "birds-of-paradise.jpg")
                .asString();

        System.out.println(response.getBody());
    }
}
