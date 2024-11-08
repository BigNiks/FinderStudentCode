public class HashMap extends Finder{
    private static String[] keys;
    private static String[] values;
    private int DEFAULT_TABLE_SIZE;
    private int tableSize;
    private int n;

    public HashMap() {
        keys = new String[tableSize];
        values = new String[tableSize];
    }

    public int hash(String key) {
        return (key.hashCode() & 0x7fffffff) % n;
    }

    public void resize() {
        double a = n/tableSize;
        if (n > 0 && n <= tableSize / 8) {
            tableSize = tableSize * 2;
        }
    }

    public void add(String key, String val) {
        int hash = key.hash(key);
        if (values[hash] == null) {
            values[hash] = val;
        }
        for (String k : keys) {
            if (k.equals(key)) {
                values[hash] = val;
                return;
            }
        }
    }
}
