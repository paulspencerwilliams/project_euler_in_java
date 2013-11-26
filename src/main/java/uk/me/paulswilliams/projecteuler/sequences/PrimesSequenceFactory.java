package uk.me.paulswilliams.projecteuler.sequences;

import uk.me.paulswilliams.projecteuler.Sequence;

public interface PrimesSequenceFactory {
    Sequence buildDecreasingPrimesSequence(long startsAt);
}
