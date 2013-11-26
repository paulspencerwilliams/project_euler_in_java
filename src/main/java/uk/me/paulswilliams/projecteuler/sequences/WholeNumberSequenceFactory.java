package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public interface WholeNumberSequenceFactory {
    public Sequence buildIncreasingWholeNumbersBelow(long below);
}
