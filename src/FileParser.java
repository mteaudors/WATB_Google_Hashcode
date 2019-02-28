import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {
    static ArrayList<Photo> parse(String filename)
    {
        ArrayList<Photo> photos = new ArrayList<>();
        try {
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder buffer = new StringBuilder();
            String line;
            String[] values;
            line = br.readLine();
            int id=0;
            boolean isHorizontal;
            ArrayList<String> tags;
            if(line != null)
            {
                while ((line = br.readLine()) != null)
                {
                    values = line.split(" ");
                    isHorizontal = values[0].equals("H");
                    tags=new ArrayList<>();
                    for(int i=2; i < values.length; i++)
                    {
                        tags.add(values[i]);
                    }
                    photos.add(new Photo(id, isHorizontal, tags));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return photos;
    }
}
