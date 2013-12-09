package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.filters.DivisibleByAllFrom1To20Filter;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;
import uk.me.paulswilliams.projecteuler.sequences.Sequence;

public class Problem5SmallestMultiple {

    public static void main(String[] params) {
        Sequence infiniteWholeNumbersSequence = new LazyWholeNumbersSequence();
        Filter divisibleByAllFrom1To20Filter = new DivisibleByAllFrom1To20Filter();
        System.out.println(new SequenceAnalyserImpl().findFirst(infiniteWholeNumbersSequence, divisibleByAllFrom1To20Filter));
    }
}
