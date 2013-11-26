package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;

public interface PrimesSequenceFactory {
    Sequence buildDecreasingPrimesSequence(long startsAt);
}
