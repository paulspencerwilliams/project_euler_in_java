package uk.me.paulswilliams.projecteuler.problem1;

import java.util.Iterator;

public class FibonacciSequence implements Iterable<Integer> {
    private Integer stopsAt;

    public FibonacciSequence(Integer stopsAt) {
        this.stopsAt = stopsAt;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciSequenceIterator();
    }

    private class FibonacciSequenceIterator implements Iterator<Integer> {

        private int currentValue;
        private int lastValue;

        @Override
        public boolean hasNext() {
            return currentValue + lastValue <    stopsAt;
        }

        @Override
        public Integer next() {

            int nextValue;
            if (currentValue == 0)
            {
                nextValue = 1;
                currentValue = 1;
            }
            else if (currentValue == 1)
            {
                nextValue = 2;
                currentValue = 2;
                lastValue = 1;
            }
            else
            {
                nextValue = currentValue + lastValue;
                lastValue = currentValue;
                currentValue = nextValue;
            }
            return nextValue;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not valid for a FibonacciSequence");
        }
    }
}
