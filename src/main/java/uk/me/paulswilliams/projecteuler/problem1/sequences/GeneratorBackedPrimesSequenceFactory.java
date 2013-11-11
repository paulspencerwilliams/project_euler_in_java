package uk.me.paulswilliams.projecteuler.problem1.sequences;

import uk.me.paulswilliams.projecteuler.problem1.Sequence;

public class GeneratorBackedPrimesSequenceFactory implements PrimesSequenceFactory {

    @Override
    public Sequence buildDecreasingPrimesSequence(long startsAt) {
        NumberGenerator generator = new PrimesNumberGenerator(startsAt);
        return new GeneratorBackedSequence(generator);
    }
}
