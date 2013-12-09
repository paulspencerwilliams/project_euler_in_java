package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.SequenceAnalyser;
import uk.me.paulswilliams.projecteuler.filters.MultipleOfThreeAndFiveFilter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;

public class Problem1MultiplesOf3And5Solver {

    public static void main(String[] args) {
        long below = Long.parseLong(args[0]);
        SequenceAnalyser analyser = new SequenceAnalyserImpl();
        System.out.println(analyser.sumAll(new LazyWholeNumbersSequence(below - 1), new MultipleOfThreeAndFiveFilter()));
    }
}
