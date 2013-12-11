package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class LazyReversePrimesSequence implements Sequence {
    private final long startsAt;

    public LazyReversePrimesSequence(long startsAt) {
        this.startsAt = startsAt;
    }

    @Override
    public Iterator<Long> iterator() {
        return new PrimesSequenceIterator(startsAt);
    }

    private class PrimesSequenceIterator implements Iterator<Long> {

        private long next;
        private boolean hasNext;

        public PrimesSequenceIterator(long startsAt) {
            if (startsAt == 2 || startsAt == 3)
            {
                hasNext = true;
                next = startsAt;
            }
            else if (startsAt > 3 )
            {
                hasNext = true;
                if (isPrime(startsAt))
                {
                    next = startsAt;
                }
                else
                {
                    next = findNext(startsAt);
                }

            }
        }

        @Override
        public boolean hasNext() {
            return hasNext;
        }

        @Override
        public Long next() {
            long numberToReturn = next;
            if (numberToReturn == 2)
            {
                hasNext = false;
            }
            next = findNext(next);
            return numberToReturn;
        }

        private long findNext(long basedOn) {
            for (long i = basedOn -1; i > 2; i--)
            {
                if (isPrime(i)) { return i;}
            }
            return 2L;
        }

        private boolean isPrime(long possiblePrime) {
            if (possiblePrime == 2) { return true; }
            for (long i = 2; i <= Math.sqrt(possiblePrime); i++)
            {
                if (possiblePrime % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not valid for a LazyReversePrimesSequence");
        }
    }
}
