package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public class GeneratorBackedPrimesSequenceFactory implements PrimesSequenceFactory {

    @Override
    public Sequence buildDecreasingPrimesSequence(long startsAt) {
        NumberGenerator generator = new PrimesNumberGenerator(startsAt);
        return new GeneratorBackedSequence(generator);
    }
}
