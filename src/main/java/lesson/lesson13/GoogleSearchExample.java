package lesson.lesson13;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lesson.lesson8.files.MyFileWriter;

import java.util.Scanner;

public class GoogleSearchExample {

    public static void main(String[] args) throws UnirestException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value:");
        String value = scanner.nextLine();
        System.out.println("Input method:");
        String method = scanner.nextLine(); // search, maps

        HttpResponse<String> response = Unirest.get("https://www.google.com.ua/{method}")
                .routeParam("method", method)
                .queryString("q", value)
                .queryString("oq", value)
                .asString();

        int httpCode = response.getStatus();
        String result = response.getBody();

        System.out.println("Http code = " + httpCode);
        System.out.println();
        System.out.println(result);

        MyFileWriter writer = new MyFileWriter("files/lesson13/google_search.html");
        writer.write(result);
    }
}
