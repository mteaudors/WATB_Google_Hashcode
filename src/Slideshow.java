
import java.util.ArrayList;
import java.util.Random;

public class Slideshow {
	ArrayList<Photo> l;
	int score;
	
	public Slideshow() {
		l = new ArrayList<>();
		score = 0;
	}
	
	public Slideshow(ArrayList<Photo> l) {
		this.l = l;
		score = score();
	}
	
	public int computeScore() {
		for(int i = 0; i < l.size()-1; ++i)
			score += l.get(i).computeScore(l.get(i+1));
	}


	public void shuffle(int ind1, int ind2){
		//Calculate score before swapping
		Slide tempSlide = l.get(ind1);
		l.set(ind1, l.get(ind2));
		l.set(ind2, tempSlide);
	}
}
