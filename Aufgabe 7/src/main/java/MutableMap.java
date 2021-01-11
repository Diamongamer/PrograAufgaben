public class MutableMap<K,V> extends AbstractReadableMap<K,V> implements WritableMap<K,V>{
    @Override
    public void put(K key, V value) {
        for(int i =0; i<entries.length; i++) {
            if(entries[i] == null || entries[i].getKey().equals(key)) {
                entries[i] = new Entry(key, value);
                return;
            }
        }
        entries = GenericArrayHelper.copyArrayWithIncreasedSize(entries, entries.length*2);
        put(key, value);
    }
}
