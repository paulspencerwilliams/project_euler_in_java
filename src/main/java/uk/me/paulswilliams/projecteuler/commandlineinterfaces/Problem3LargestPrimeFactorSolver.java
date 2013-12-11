package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.SequenceAnalyser;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.filters.FactorOfFilter;
import uk.me.paulswilliams.projecteuler.sequences.LazyReversePrimesSequence;

public class Problem3LargestPrimeFactorSolver {

    public static void main(String[] args) {
        Long startsAt = Long.valueOf(args[0]);
        SequenceAnalyser analyser = new SequenceAnalyserImpl();
        LazyReversePrimesSequence sequence = new LazyReversePrimesSequence((long) Math.sqrt(startsAt));
        System.out.println(analyser.findFirst(sequence, new FactorOfFilter(startsAt)));
    }

}
