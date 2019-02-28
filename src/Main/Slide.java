package Main;

import java.util.ArrayList;

public class Slide {
	Photo horizontal;
	Photo[] vertical;
	ArrayList<String> slideTags;
	
	public Slide() {
		horizontal = null;
		vertical = null;
	}
	
	public Slide(Photo hori) {
		this.horizontal = hori;
		slideTags = horizontal.getTags();
		vertical = null;
	}
	
	public Slide(Photo v1, Photo v2) {
		vertical = new Photo[2];
		vertical[0] = v1;
		vertical[1] = v2;
		slideTags = vertical[0].getTags();
		for(String s : vertical[1].getTags())
			if(!slideTags.contains(s))
				slideTags.add(s);
		horizontal = null;
	}

	
	public int computeScore(Slide suivant) {
		ArrayList<String> l1 = slideTags;
		ArrayList<String> l2 = suivant.slideTags;
		
		int commonSize = 0;
		int sizeL1 = 0;
		int sizeL2 = l2.size();
		for(String s : l1) {
			if(l2.contains(s)) {
				commonSize++;
				sizeL2--;
			}else
				sizeL1++;
		}
		
		return Math.min(sizeL1, Math.min(commonSize, sizeL2));
	}

	public String toString() {
	    StringBuilder s = new StringBuilder();
	    if(horizontal != null) {
	        s.append(horizontal.getId());
        }
	    else if(vertical != null) {
	        s.append(vertical[0] + "," + vertical[1]);
        }

	    return s.toString();
    }
}
