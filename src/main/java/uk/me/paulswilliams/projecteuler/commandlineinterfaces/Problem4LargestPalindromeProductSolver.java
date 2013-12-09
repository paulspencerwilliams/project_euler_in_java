package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.Filter;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.filters.PalindromeFilter;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.ReverseProductsOfThreeDigitsGenerator;

public class Problem4LargestPalindromeProductSolver {


    private final Sequence sequence;
    private final Filter filter;

    public Problem4LargestPalindromeProductSolver(Sequence sequence, Filter filter) {
        this.sequence = sequence;
        this.filter = filter;
    }

    public long solve() {
        return sequence.findFirst(filter);
    }

    public static void main(String[] args) {
        Sequence sequence = new GeneratorBackedSequence(new ReverseProductsOfThreeDigitsGenerator());
        Filter filter = new PalindromeFilter();
        System.out.println(new Problem4LargestPalindromeProductSolver(sequence, filter).solve());
    }
}
