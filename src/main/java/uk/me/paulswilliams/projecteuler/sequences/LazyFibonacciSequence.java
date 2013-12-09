package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyFibonacciSequence implements Sequence {
    private final long stopsAt;

    public LazyFibonacciSequence(long stopsAt) {
        this.stopsAt = stopsAt;
    }

    @Override
    public Iterator<Long> iterator() {
        return new FibonacciSequenceIterator(stopsAt);
    }

    public Long getStopsAt() {
        return stopsAt;
    }

    private class FibonacciSequenceIterator implements Iterator<Long> {


        private long previous;
        private long next;
        private final long stopsAt;

        public FibonacciSequenceIterator(long stopsAt) {
            this.previous = 0;
            this.next = 1;
            this.stopsAt = stopsAt;
        }

        @Override
        public boolean hasNext() {
            return next + previous <= stopsAt;
        }

        @Override
        public Long next() {
            long numberToReturn = previous + next;
            if (previous == 0)
            {
                previous = 1;
            }
            else
            {
                previous = next;
                next=numberToReturn;
            }
            return numberToReturn;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not valid for a FibonacciSequence");
        }
    }
}
