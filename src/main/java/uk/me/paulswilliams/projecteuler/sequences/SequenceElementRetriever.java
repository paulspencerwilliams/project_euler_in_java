package uk.me.paulswilliams.projecteuler.sequences;

import java.util.Iterator;

public class SequenceElementRetriever {
    public long retrieveNthElement(Sequence sequence, long n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be a whole number greater than 0");
        }
        Iterator<Long> iterator = sequence.iterator();
        long element= 0;
        for (int i = 1; i <= n; i++) {
            if (iterator.hasNext())
            {
                element = iterator.next();
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }


        }
        return element;
    }
}
