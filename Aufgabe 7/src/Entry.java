public class Entry<K, V> {
    private final K key;
    private final V value;

    /**
     * Kontruktor fuer eine entry
     * @param k
     * @param v
     */
    Entry(K k, V v) {
        this.key=k;
        this.value=v;
    }

    /**
     * Getter fuer key
     * @return key
     */
    public K getKey() {
        return key;
    }

    /**
     * Getter fuer value
     * @return value
     */
    public V getValue() {
        return value;
    }

    /**
     * toString Methode der Klasse Entry.
     * @return
     */
    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}