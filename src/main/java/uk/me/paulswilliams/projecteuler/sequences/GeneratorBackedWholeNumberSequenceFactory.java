package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public class GeneratorBackedWholeNumberSequenceFactory implements WholeNumberSequenceFactory {

    @Override
    public Sequence buildIncreasingWholeNumbersBelow(long below) {
        return new GeneratorBackedSequence(new WholeNumberGenerator(below));
    }
}
