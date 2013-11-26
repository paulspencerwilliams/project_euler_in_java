package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.FibonacciGenerator;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;

public class GeneratorBackedFibonacciSequenceFactory implements FibonacciSequenceFactory {

    @Override
    public Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt) {
        return new GeneratorBackedSequence(new FibonacciGenerator(stopAt));
    }
}
