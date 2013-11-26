package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.WholeNumberGenerator;

public class GeneratorBackedWholeNumberSequenceFactory implements WholeNumberSequenceFactory {

    @Override
    public Sequence buildIncreasingWholeNumbersBelow(long below) {
        return new GeneratorBackedSequence(new WholeNumberGenerator(below));
    }
}
