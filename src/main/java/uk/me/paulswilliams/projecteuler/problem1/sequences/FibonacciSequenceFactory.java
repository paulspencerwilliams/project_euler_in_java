package uk.me.paulswilliams.projecteuler.problem1.sequences;

import uk.me.paulswilliams.projecteuler.problem1.Sequence;

public interface FibonacciSequenceFactory {
    Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt);
}
