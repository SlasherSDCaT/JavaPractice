package ru.muhametshin.prac1_8.pr3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class ThreadSafetySet<E> implements Set<E> {

    private static final Semaphore semaphore = new Semaphore(1);
    private final Set<E> set = new HashSet<>();
    @Override
    public int size() {
        try{
            semaphore.acquire();
            int size = set.size();
            semaphore.release();
            return size;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isEmpty() {
        try{
            semaphore.acquire();
            boolean isEmpty = set.isEmpty();
            semaphore.release();
            return isEmpty;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean contains(Object o) {
        try{
            semaphore.acquire();
            boolean contains = set.contains(o);
            semaphore.release();
            return contains;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<E> iterator() {
        try{
            semaphore.acquire();
            Iterator<E> iterator = set.iterator();
            semaphore.release();
            return iterator;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object[] toArray() {
        try{
            semaphore.acquire();
            Object[] toArray = set.toArray();
            semaphore.release();
            return toArray;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        try{
            semaphore.acquire();
            T[] toArray = set.toArray(a);
            semaphore.release();
            return toArray;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(E e) {
        try{
            semaphore.acquire();
            boolean add = set.add(e);
            semaphore.release();
            return add;
        }catch (InterruptedException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public boolean remove(Object o) {
        try{
            semaphore.acquire();
            boolean remove = set.remove(o);
            semaphore.release();
            return remove;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try{
            semaphore.acquire();
            boolean ContainsAll = set.containsAll(c);
            semaphore.release();
            return ContainsAll;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        try{
            semaphore.acquire();
            boolean addAll = set.addAll(c);
            semaphore.release();
            return addAll;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try{
            semaphore.acquire();
            boolean retainAll = set.retainAll(c);
            semaphore.release();
            return retainAll;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try{
            semaphore.acquire();
            boolean removeAll = set.removeAll(c);
            semaphore.release();
            return removeAll;
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clear() {
        try{
            semaphore.acquire();
            set.clear();
            semaphore.release();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
