package Main;

import java.util.ArrayList;
import java.util.Random;

public class Slideshow {

    static final int NB_ITERATION = 15000000;

	ArrayList<Slide> slides;
	private int score;

	public Slideshow() {
		slides = new ArrayList<>();
		score = computeScore();
	}
	
	public Slideshow(ArrayList<Slide> l) {
		this.slides = l;
		score = computeScore();
	}

	public int getScore() {
		return score;
	}
	
	public int computeScore() {
	    int score = 0;
		for(int i = 0; i < slides.size()-1; ++i)
			score += slides.get(i).computeScore(slides.get(i+1));

		return score;
	}

    public void shuffle(int ind1, int ind2){

		int newScore = score - slides.get(ind1).computeScore(slides.get(ind1-1))
							 - slides.get(ind1).computeScore(slides.get(ind1+1))
				 			 - slides.get(ind2).computeScore(slides.get(ind2-1))
							 - slides.get(ind2).computeScore(slides.get(ind2+1));
		newScore += slides.get(ind1).computeScore(slides.get(ind2-1))
				  + slides.get(ind1).computeScore(slides.get(ind2+1))
				  + slides.get(ind2).computeScore(slides.get(ind1-1))
				  + slides.get(ind2).computeScore(slides.get(ind1+1));


		if(newScore > score) {
			Slide tempSlide = slides.get(ind1);
			slides.set(ind1, slides.get(ind2));
			slides.set(ind2, tempSlide);
			score = newScore;
		}
    }

    public void swap(int ind1 , int ind2) {
		Slide tempSlide = slides.get(ind1);
		slides.set(ind1, slides.get(ind2));
		slides.set(ind2, tempSlide);
	}

	public void sortSlideShow() {
		int score = computeScore() , newScore;

		int index1, index2;
		Random random = new Random();

		for(int i=0 ; i<NB_ITERATION ; i++) {
			index1 = random.nextInt(slides.size() - 2) + 1;
			index2 = random.nextInt(slides.size() - 2) + 1;
			shuffle(index1,index2);
		}

	}

}
