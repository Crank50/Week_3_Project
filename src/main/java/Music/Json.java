package Music;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Justin on 7/29/16.
 */
public class Json {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Music music = new Music();

        Path myFilePath = Paths.get("Music.json");
        ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
        // instantiate and populate person object to write
        PlayJson playJson = new PlayJson();
        System.out.println("thanks for coming=)");
        playJson.setName();
        playJson.setfavoriteBand();
        playJson.setfavoriteVenue();

        PlayJson playJson1 = new PlayJson();

        // instantiate an empty person object for the read
        // write from Person object to JSON file
        mapper.writeValue(Files.newOutputStream(myFilePath), playJson);
        // from JSON file to Person object
        playJson1 = mapper.readValue(Files.newInputStream(myFilePath), PlayJson.class);


        System.out.println(playJson1.getName());
        System.out.println(playJson1.getfavoriteBand());
        System.out.println(playJson1.getfavoriteVenue());
    }
}
