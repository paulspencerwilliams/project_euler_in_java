package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.NumberGenerator;
import uk.me.paulswilliams.projecteuler.sequences.generators.PrimesNumberGenerator;

public class GeneratorBackedPrimesSequenceFactory implements PrimesSequenceFactory {

    @Override
    public Sequence buildDecreasingPrimesSequence(long startsAt) {
        NumberGenerator generator = new PrimesNumberGenerator(startsAt);
        return new GeneratorBackedSequence(generator);
    }
}
