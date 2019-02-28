import Main.Slide;

import java.util.ArrayList;
import java.util.Random;

public class Slideshow {
	ArrayList<Slide> slides;
	int score;

	public Slideshow() {
		slides = new ArrayList<>();
		score = 0;
	}

	public Slideshow(ArrayList<Slide> l) {
		this.slides = l;
		score = computeScore();
	}

	public int computeScore() {
		for(int i = 0; i < slides.size()-1; ++i)
			score += slides.get(i).computeScore(slides.get(i+1));
	}


	public void shuffle(int ind1, int ind2){
		//Calculate score before swapping
		Slide tempSlide = slides.get(ind1);
		slides.set(ind1, slides.get(ind2));
		slides.set(ind2, tempSlide);
	}
}
