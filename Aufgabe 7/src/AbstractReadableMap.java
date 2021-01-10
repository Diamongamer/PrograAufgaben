import java.util.HashSet;
import java.util.Set;

public abstract class AbstractReadableMap<K, V> implements ReadableMap<K,V>{
    protected Entry<K,V>[] entries;
    public AbstractReadableMap() {
        this.entries=GenericArrayHelper.newEntryArrayOfSize(10);
    }
    public AbstractReadableMap(Entry<K,V>[] entries) {
        this.entries=GenericArrayHelper.copyArray(entries);
    }

    @Override
    public V getOrThrow(K key) throws UnknownKeyException {
        if(key != null) {
            for (Entry<K,V> entry : entries) {
                if (entry!=null && key.equals(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        throw new UnknownKeyException();
    }

    @Override
    public ImmutableMap asImmutableMap() {
        ImmutableMap immutablemap = new ImmutableMap(entries);
        return immutablemap;
    }

    @Override
    public Set<K> keysAsSet() {
        HashSet<K> hashSet = new HashSet<K>();
        for(Entry<K,V> entry:entries) {
            if(entry!=null) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }
}
