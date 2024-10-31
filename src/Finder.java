import java.io.BufferedReader;
import java.io.IOException;
/**
 * Finder
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Niko Madriz
 **/

public class Finder {

    private static final String INVALID = "INVALID KEY";
    private static final int R = 256;
    private static final

    public Finder() {}

    public void buildTable(BufferedReader br, int keyCol, int valCol) throws IOException {
        // TODO: Complete the buildTable() function!
        String temp = "";
        String[] map = new String[100];

        while (br.readLine() != null) {
            String line = br.readLine();
             = line.split(",");
        }
        br.close();
    }

    public String query(String key){
        // TODO: Complete the query() function!

        return INVALID;
    }

    private static long hash(String key, int m, int start) {
        long h = 0;
        for (int i = start; i < start + m; i++) {
            h = (R * h + key.charAt(i)) % ;
        }
        return h;
    }
}