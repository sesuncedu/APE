package ch.uzh.ifi.attempto.ape.drs;

import java.util.*;

/**
* Created with IntelliJ IDEA.
* User: ses
* Date: 3/6/13
* Time: 9:28 PM
* To change this template use File | Settings | File Templates.
*/
public class DRSItemList extends DRSItem implements List<DRSItem> {
     ArrayList<DRSItem> delegate = new ArrayList<DRSItem>();

    public void ensureCapacity(int i) {
        delegate.ensureCapacity(i);
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return delegate.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return delegate.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return delegate.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return delegate.clone();
    }

    @Override
    public Object[] toArray() {
        return delegate.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return delegate.toArray(ts);
    }

    @Override
    public DRSItem get(int i) {
        return delegate.get(i);
    }

    @Override
    public DRSItem set(int i, DRSItem drsItem) {
        return delegate.set(i, drsItem);
    }

    @Override
    public boolean add(DRSItem drsItem) {
        return delegate.add(drsItem);
    }

    @Override
    public void add(int i, DRSItem drsItem) {
        delegate.add(i, drsItem);
    }

    @Override
    public DRSItem remove(int i) {
        return delegate.remove(i);
    }

    @Override
    public boolean remove(Object o) {
        return delegate.remove(o);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public boolean addAll(Collection<? extends DRSItem> drsItems) {
        return delegate.addAll(drsItems);
    }

    @Override
    public boolean addAll(int i, Collection<? extends DRSItem> drsItems) {
        return delegate.addAll(i, drsItems);
    }

    @Override
    public Iterator<DRSItem> iterator() {
        return delegate.iterator();
    }

    @Override
    public ListIterator<DRSItem> listIterator() {
        return delegate.listIterator();
    }

    @Override
    public ListIterator<DRSItem> listIterator(int i) {
        return delegate.listIterator(i);
    }

    @Override
    public List<DRSItem> subList(int i, int i2) {
        return delegate.subList(i, i2);
    }

    @Override
    public boolean equals(Object o) {
        return delegate.equals(o);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }

    @Override
    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }

    @Override
    public boolean removeAll(Collection<?> objects) {
        return delegate.removeAll(objects);
    }

    @Override
    public boolean retainAll(Collection<?> objects) {
        return delegate.retainAll(objects);
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    public void trimToSize() {
        delegate.trimToSize();
    }
}
