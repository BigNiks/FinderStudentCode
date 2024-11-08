import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.security.Key;

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
    private static String[] keys;
    private static String[] values;
    private int DEFAULT_TABLE_SIZE;
    private int tableSize;
    private int n;

    public Finder() {}

    public void buildTable(BufferedReader br, int keyCol, int valCol) throws IOException {
        // TODO: Complete the buildTable() function!
        String temp = "";
        String[] map = new String[tableSize];
        HashMap hashmap = new HashMap();
        int i = 0;

        while (br.readLine() != null) {
            String line = br.readLine();
            keys = line.split(",");
            values = line.split(",");
            hashmap.add(keys[i], values[i + 1]);
            hashmap.resize();
            i++;
        }
        br.close();
    }

    public String query(String key){
        int hash = key.hash(key);
        if(key.hash(key) != null) {
            return values[hash];
        }
        else {
            return INVALID;
        }
    }
}