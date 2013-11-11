package uk.me.paulswilliams.projecteuler.problem1.sequences;

import uk.me.paulswilliams.projecteuler.problem1.Sequence;

public interface PrimesSequenceFactory {
    Sequence buildDecreasingPrimesSequence(long startsAt);
}
