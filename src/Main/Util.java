package Main;

import java.io.*;

public class Util {

    public static String getTextFile(String path) throws IOException {
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder buffer = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null)
            buffer.append(line + "\n");

        return buffer.toString();
    }
}
