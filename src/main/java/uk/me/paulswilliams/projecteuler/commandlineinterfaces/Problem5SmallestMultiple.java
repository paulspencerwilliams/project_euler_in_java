package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.filters.DivisibleByAllFrom1To20Filter;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;
import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public class Problem5SmallestMultiple {

    public static void main(String[] params) {
        Sequence sequence = new LazyWholeNumbersSequence();
        Filter filter = new DivisibleByAllFrom1To20Filter();
        SequenceAnalyserImpl sequenceAnalyser = new SequenceAnalyserImpl();
        System.out.println(sequenceAnalyser.findFirst(sequence, filter));
    }
}
