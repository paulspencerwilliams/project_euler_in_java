package uk.me.paulswilliams.projecteuler.problem1;

public interface FibonacciSequenceFactory {
    Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt);
}
