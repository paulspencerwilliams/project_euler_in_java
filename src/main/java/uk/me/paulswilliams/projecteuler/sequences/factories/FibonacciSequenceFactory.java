package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;

public interface FibonacciSequenceFactory {
    Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt);
}
