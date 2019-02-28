package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Photo> photos = new ArrayList<Photo>();

        String filename = "src/Main/b_lovely_landscapes.txt";
        photos = FileParser.parse(filename);

        for(Photo photo : photos) {
            System.out.println(photo.getId() + " " + photo.isHorizontal() + " " + photo.getTags());
        }
    }



}
