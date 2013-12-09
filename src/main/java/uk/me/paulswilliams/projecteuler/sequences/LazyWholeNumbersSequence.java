package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyWholeNumbersSequence implements Sequence {
    private final Long stopsAt;

    public LazyWholeNumbersSequence(long stopsAt) {
        this.stopsAt = stopsAt;
    }

    public LazyWholeNumbersSequence() {
        this.stopsAt = Long.MAX_VALUE;
    }

    @Override
    public Iterator<Long> iterator() {
        return new WholeNumbersSequenceIterator (stopsAt);
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
            throw new UnsupportedOperationException("Remove is not valid for a LazyWholeNumbersSequence");
        }
    }
}
