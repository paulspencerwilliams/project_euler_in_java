package uk.me.paulswilliams.projecteuler;

import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public interface SequenceAnalyser {

    long findFirst(Sequence sequence, Filter filter);

    long sumAll(Sequence sequence, Filter filter);
}
