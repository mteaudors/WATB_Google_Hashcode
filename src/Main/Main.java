package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Photo> photos = new ArrayList<Photo>();

        String filename = "src/Main/b_lovely_landscapes.txt";
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
        slideshow.sortSlideShow();
        System.out.println(slideshow.getScore());

        FileParser.writeSlideshowOnFile(slideshow , "score");

    }



}
