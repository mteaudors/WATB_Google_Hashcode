import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("\"youhou test\"");
        String s = new String();
        try {
            s = Util.getTextFile("data/data_test");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(s);
    }
}
