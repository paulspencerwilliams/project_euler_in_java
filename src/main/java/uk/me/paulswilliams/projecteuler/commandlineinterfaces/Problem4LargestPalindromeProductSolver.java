package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyser;
import uk.me.paulswilliams.projecteuler.filters.PalindromeFilter;
import uk.me.paulswilliams.projecteuler.SequenceAnalyserImpl;
import uk.me.paulswilliams.projecteuler.sequences.LazyReverseProductsOfThreeDigitsSequence;

public class Problem4LargestPalindromeProductSolver {




    public static void main(String[] args) {
        LazyReverseProductsOfThreeDigitsSequence sequence = new LazyReverseProductsOfThreeDigitsSequence();
        Filter filter = new PalindromeFilter();
        SequenceAnalyser sequenceAnalyser = new SequenceAnalyserImpl();
        System.out.println(sequenceAnalyser.findFirst(sequence, filter));
    }
}
