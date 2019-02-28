import java.util.ArrayList;

public class Photo {

    private int id;

    // photo orientation : true = horizontal , false = vertical
    private boolean isHorizontal;

    private ArrayList<String> tags;

    public Photo(int id , boolean isHorizontal , ArrayList<String> tags) {
        this.id = id;
        this.isHorizontal = isHorizontal;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
    



}
