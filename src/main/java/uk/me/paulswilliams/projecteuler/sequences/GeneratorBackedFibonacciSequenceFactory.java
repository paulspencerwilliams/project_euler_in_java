package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public class GeneratorBackedFibonacciSequenceFactory implements FibonacciSequenceFactory {

    @Override
    public Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt) {
        return new GeneratorBackedSequence(new FibonacciGenerator(stopAt));
    }
}
