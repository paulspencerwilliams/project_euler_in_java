package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public interface FibonacciSequenceFactory {
    Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt);
}
