package pl.urbanik.task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Z publicznego API: https://jsonplaceholder.typicode.com pobierz wszystkie zapisane posty znajdujące się pod adresem
 * https://jsonplaceholder.typicode.com/posts tak by po wywołaniu metody getPosts() można było wypisać wszystkie elementy w konsoli,
 * podobnie jak wypisuje je przeglądarka po wejściu w link.
 *
 * Można skorzystać z dowolnych sposobów pobierania danych z API dostępnych dla języka Java.
 * */

public class ThirdTask {

    public static String getPosts() throws IOException {

        URL url = new URL("https://jsonplaceholder.typicode.com/posts");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();

        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {

            StringBuilder inline = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                inline.append(scanner.nextLine()).append("\n");
            }
            scanner.close();

            return inline.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPosts());
    }
}
