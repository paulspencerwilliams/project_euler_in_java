package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyWholeNumbersSequence implements Sequence {
    private final long below;

    public LazyWholeNumbersSequence(long below) {
        this.below = below;
    }

    @Override
    public Iterator<Long> iterator() {
        return new WholeNumbersSequenceIterator (below);
    }

    public long getBelow() {
        return below;
    }

    private class WholeNumbersSequenceIterator implements Iterator<Long> {
        private final long below;
        private long current = 0;

        public WholeNumbersSequenceIterator(long below) {
            this.below = below;
        }

        @Override
        public boolean hasNext() {
            return (current + 1 < below);
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
