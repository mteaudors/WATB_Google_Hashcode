package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Slideshow slides = new ArrayList<>();

        String filename = "b_lovely_landscapes.txt";
        slides = FileParser.parse(filename);

    }



}
