package io.codeforall.javatars;

import java.util.Iterator;

public class FirstIterator implements Iterator<Integer> {

    private Range range;

    public FirstIterator(Range range) {
        this.range = range;
    }

    @Override
    public boolean hasNext() {
        return range.getFirst() <= range.getLast();
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            return null;
        }
        Integer current = range.getFirst();
        range.setFirst(range.getFirst()+1);
        return current;
    }

}
