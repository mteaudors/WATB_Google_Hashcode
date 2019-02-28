import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Slideshow slides = new ArrayList<>();

        String filename = "b_lovely_landscapes.txt";
        slides = FileParser.parse(filename);

    }



}
