package ru.muhametshin.prac1_8.pr3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafetyMap<E, V> implements Map<E, V>{
    private final Map<E,V> map = new HashMap<>();
    static final Lock lock = new ReentrantLock();
    @Override
    public int size() {
        lock.lock();
        int size = map.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean size = map.isEmpty();
        lock.unlock();
        return size;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean contain = map.containsKey(key);
        lock.unlock();
        return contain;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean contain = map.containsValue(value);
        lock.unlock();
        return contain;
    }

    @Override
    public V get(Object key) {
        lock.lock();
        V value = map.get(key);
        lock.unlock();
        return value;
    }

    @Override
    public V put(E key, V value) {
        lock.lock();
        map.put(key, value);
        lock.unlock();
        return null;
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        map.remove(key);
        lock.unlock();
        return null;
    }

    @Override
    public void putAll(Map<? extends E, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<E> keySet() {
        lock.lock();
        Set<E> keySet = map.keySet();
        lock.unlock();
        return keySet;
    }

    @Override
    public Collection<V> values() {
        lock.lock();
        Collection<V> values = map.values();
        lock.unlock();
        return values;
    }

    @Override
    public Set<Entry<E, V>> entrySet() {
        lock.lock();
        Set<Entry<E, V>> entrySet = map.entrySet();
        lock.unlock();
        return entrySet;
    }
}
