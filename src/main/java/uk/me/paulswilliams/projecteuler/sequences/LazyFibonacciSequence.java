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


    private class FibonacciSequenceIterator implements Iterator<Long> {


        private long previous;
        private long current;
        private final long stopsAt;

        public FibonacciSequenceIterator(long stopsAt) {
            this.previous = 0;
            this.current = 1;
            this.stopsAt = stopsAt;
        }

        @Override
        public boolean hasNext() {
            return current + previous <= stopsAt;
        }

        @Override
        public Long next() {
            long numberToReturn = previous + current;
            if (previous == 0)
            {
                previous = 1;
            }
            else
            {
                previous = current;
                current =numberToReturn;
            }
            return numberToReturn;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not valid for a LazyFibonacciSequence");
        }
    }
}
