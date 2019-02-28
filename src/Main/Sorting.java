package Main;

import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void sort(Slideshow s)
    {
        int bestj;
        int bestScore;
        int current;
        int sc = 0;
        for(int i= 1; i< s.slides.size(); i++)
        {
            bestj = i;
            bestScore = 0;
            int size = s.slides.get(i-1).slideTags.size()/3;
            for(int j=i; j< s.slides.size(); j++)
            {
                current = s.slides.get(i-1).computeScore(s.slides.get(j));
                if( current > bestScore)
                {
                    bestj = j;
                    bestScore = current;
                    if(current >= size)
                    {
                        break;
                    }
                }

            }
            sc += bestScore;
            Slide tempSlide = s.slides.get(bestj);
            s.slides.set(bestj, s.slides.get(i));
            s.slides.set(i, tempSlide);

        }
        System.out.println(sc);
    }
}
