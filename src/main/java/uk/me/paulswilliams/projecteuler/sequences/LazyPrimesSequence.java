package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyPrimesSequence implements Sequence{
    public LazyPrimesSequence() {
    }

    @Override
    public Iterator<Long> iterator() {
        return new LazyPrimesIterator();
    }

    private class LazyPrimesIterator implements Iterator<Long> {
        private long previousPrime = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Long next() {

            Long possiblePrime;
            if (previousPrime == 0)
            {
                previousPrime = 2L;
                return 2L;
            }

            possiblePrime = previousPrime + 1;
            while (isNotPrime(possiblePrime))
            {
                possiblePrime++;
            }
            previousPrime = possiblePrime;
            return possiblePrime;
        }

        private boolean isNotPrime(Long possiblePrime) {
            for (int i=2; i<possiblePrime; i++){
                if (possiblePrime%i == 0)
                    return true;
            }
            return false;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not valid for a LazyPrimesSequence");
        }
    }
}
