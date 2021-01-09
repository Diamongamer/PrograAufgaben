public abstract class AbstractReadableMap<K, V> implements ReadableMap{
    protected Entry<K,V>[] entries;
    public AbstractReadableMap() { this.entries=GenericArrayHelper.newEntryArrayOfSize(10); }
    public AbstractReadableMap(Entry<K,V>[] entries) {
        this.entries=GenericArrayHelper.copyArray(entries);
    }

    @Override
    public Object getOrThrow(Object key) throws UnknownKeyException {
        if(key == null) {
            throw new UnknownKeyException("No key was given");
        }
        for (Entry entry : entries) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        throw new UnknownKeyException("Key not found");
    }
}
