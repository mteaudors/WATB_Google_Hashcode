package Main;

import java.util.ArrayList;

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
}
