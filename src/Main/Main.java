package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Photo> photos = new ArrayList<Photo>();

        String filename = args[1] != null ? args[1] : "e_shiny_selfies.txt";
        photos = FileParser.parse(filename);

        ArrayList<Slide> slides = new ArrayList<Slide>();
        Photo tempPhoto = null;

        for(Photo photo : photos) {
            if(photo.isHorizontal())
                slides.add(new Slide(photo));
            else {
                if (tempPhoto == null) tempPhoto = photo;
                else {
                    slides.add(new Slide(tempPhoto , photo));
                    tempPhoto = null;
                }
            }
        }

        Slideshow slideshow = new Slideshow(slides);

        //for(int i=0 ; i<slides.size() ; i++) System.out.println(slides.get(i));


        System.out.println(slideshow.getScore());
        //slideshow.sortSlideShow();
        Sorting.sort(slideshow);
        System.out.println(slideshow.computeScore());

        FileParser.writeSlideshowOnFile(slideshow , "score");

    }



}
