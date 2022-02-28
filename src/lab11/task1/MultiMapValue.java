package lab11.task1;

import java.util.*;

public class MultiMapValue<K, V> {
    private HashMap<K, List<V>> map;

    public MultiMapValue() {
        map = new HashMap<>();
    }

    public void add(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    public void addAll(K key, List<V> values) {
        for (V value : values) {
            add(key, value);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (K key : map.map.keySet()) {
            addAll(key, map.getValues(key));
        }
    }

    public V getFirst(K key) {
        return map.get(key).get(0);
    }

    public List<V> getValues(K key) {
        return map.get(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public List<V> remove(K key) {
        return map.remove(key);
    }

    public int size() {
        return map.size();
    }
}
