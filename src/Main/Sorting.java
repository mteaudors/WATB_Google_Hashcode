package Main;

import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void sort(Slideshow s)
    {
        int bestj;
        int bestScore;
        int current;
        for(int i= 1; i< s.slides.size(); i++)
        {
            bestj = i;
            bestScore = 0;
            for(int j=i; j< s.slides.size(); j++)
            {
                current = s.slides.get(i-1).computeScore(s.slides.get(j));
                if( current > bestScore)
                {
                    bestj = j;
                    bestScore = current;
                }

            }
            Collections.swap(s.slides, bestj, i);
        }
    }
}
