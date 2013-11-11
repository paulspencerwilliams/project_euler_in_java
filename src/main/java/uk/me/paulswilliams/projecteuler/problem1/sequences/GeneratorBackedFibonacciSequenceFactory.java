package uk.me.paulswilliams.projecteuler.problem1.sequences;

import uk.me.paulswilliams.projecteuler.problem1.Sequence;

public class GeneratorBackedFibonacciSequenceFactory implements FibonacciSequenceFactory {

    @Override
    public Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt) {
        return new GeneratorBackedSequence(new FibonacciGenerator(stopAt));
    }
}
