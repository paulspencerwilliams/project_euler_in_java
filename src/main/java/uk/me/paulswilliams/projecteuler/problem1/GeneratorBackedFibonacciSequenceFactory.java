package uk.me.paulswilliams.projecteuler.problem1;

public class GeneratorBackedFibonacciSequenceFactory implements FibonacciSequenceFactory {
    @Override
    public Sequence buildIncreasingFibonacciSequenceStoppingAt(long stopAt) {
        return new GeneratorBackedSequence(new FibonacciGenerator(stopAt));
    }
}
