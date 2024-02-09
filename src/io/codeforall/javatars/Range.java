package io.codeforall.javatars;

import java.util.Iterator;

public class Range implements Iterable<Integer>{

    private Integer first;
    private Integer last;

    public Range(Integer first, Integer last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FirstIterator(this);
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }
}
