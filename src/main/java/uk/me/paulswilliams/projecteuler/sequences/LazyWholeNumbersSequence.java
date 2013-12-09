package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyWholeNumbersSequence implements Sequence {
    private final long stopsAt;

    public LazyWholeNumbersSequence(long stopsAt) {
        this.stopsAt = stopsAt;
    }

    @Override
    public Iterator<Long> iterator() {
        return new WholeNumbersSequenceIterator (stopsAt);
    }

    public long getStopsAt() {
        return stopsAt;
    }

    private class WholeNumbersSequenceIterator implements Iterator<Long> {
        private final long stopsAt;
        private long current = 0;

        public WholeNumbersSequenceIterator(long stopsAt) {
            this.stopsAt = stopsAt;
        }

        @Override
        public boolean hasNext() {
            return (current + 1 <= stopsAt);
        }

        @Override
        public Long next() {
            current++;
            return current;
        }

        @Override
        public void remove() {

        }
    }
}
