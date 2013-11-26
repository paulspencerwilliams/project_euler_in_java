package uk.me.paulswilliams.projecteuler.sequences.generators;

import java.util.Iterator;

public class WholeNumberGenerator  implements NumberGenerator {
    private final long below;

    public WholeNumberGenerator(long below) {
        this.below = below;
    }

    @Override
    public Iterator<Long> iterator() {
        return new WholeNumberSequenceIterator (below);
    }

    public long getBelow() {
        return below;
    }

    private class WholeNumberSequenceIterator implements Iterator<Long> {
        private final long below;
        private long current = 0;

        public WholeNumberSequenceIterator(long below) {
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
