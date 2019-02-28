package Main;

import java.util.ArrayList;
import java.util.Random;

public class Slideshow {

    static final int NB_ITERATION = 50000;

	ArrayList<Photo> photoList;
	int score;
	
	public Slideshow() {
		photoList = new ArrayList<>();
		score = 0;
	}
	
	public Slideshow(ArrayList<Photo> l) {
		this.photoList = l;
		score = computeScore();
	}
	
	public int computeScore() {
		for(int i = 0; i < photoList.size()-1; ++i)
			score += photoList.get(i).computeScore(photoList.get(i+1));
	}

	public void sortSlideShow() {
		int score = computeScore() , newScore;

		int index1, index2;
		Random random = new Random();
		index1 = random.nextInt();
		index2 = random.nextInt();

		for(int i=0 ; i<NB_ITERATION ; i++) {

			shuffle();
			newScore = computeScore();

		}


	}


	public void shuffle(int ind1, int ind2){
		//Calculate score before swapping
		Slide tempSlide = l.get(ind1);
		l.set(ind1, l.get(ind2));
		l.set(ind2, tempSlide);
	}
}
