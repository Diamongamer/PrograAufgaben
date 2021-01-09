import java.util.HashSet;

public class Launcher {
    public static void main(String[] args) {
        MutableMap<String, Integer> map = new MutableMap<>();
        putEntries(map);
        printEntries(map);
        ImmutableMap immutableMap = map.asImmutableMap();
        printEntries(immutableMap);
    }

    public static void putEntries(WritableMap<String, Integer> writableMap) {
        writableMap.put("sizeInMB", 42);
        writableMap.put("version", 4);
        writableMap.put("yearOfRelease", 2015);
    }

    public static void printEntries(ReadableMap<String, Integer> readableMap) {
        for(String key : readableMap.keysAsSet()) {
            try {
                System.out.println(key + ": " +  readableMap.getOrThrow(key).toString());
            } catch (UnknownKeyException e) {
                e.printStackTrace();
            }
        }
    }
}
