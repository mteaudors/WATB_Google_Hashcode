package Main;

import java.util.ArrayList;
import java.util.Random;

public class Slideshow {

    static final int NB_ITERATION = 50000;

	ArrayList<Slide> slides;

	public Slideshow() {
		slides = new ArrayList<>();
	}
	
	public Slideshow(ArrayList<Slide> l) {
		this.slides = l;
	}
	
	public int computeScore() {
	    int score = 0;
		for(int i = 0; i < slides.size()-1; ++i)
			score += slides.get(i).computeScore(slides.get(i+1));

		return score;
	}

    public void shuffle(int ind1, int ind2){
        Slide tempSlide = slides.get(ind1);
        slides.set(ind1, slides.get(ind2));
        slides.set(ind2, tempSlide);
    }

	public void sortSlideShow() {
		int score = computeScore() , newScore;

		int index1, index2;
		Random random = new Random();
		index1 = random.nextInt(slides.size());
		index2 = random.nextInt(slides.size());

		for(int i=0 ; i<NB_ITERATION ; i++) {

			shuffle(index1,index2);
			newScore = computeScore();

			if(newScore < score) {
			    shuffle(index1,index2);
            }
		}

	}

}
