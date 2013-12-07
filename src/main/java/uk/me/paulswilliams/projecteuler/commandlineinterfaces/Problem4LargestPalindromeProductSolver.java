package uk.me.paulswilliams.projecteuler.commandlineinterfaces;

import uk.me.paulswilliams.projecteuler.filters.FilterFactory;
import uk.me.paulswilliams.projecteuler.filters.FilterFactoryImpl;
import uk.me.paulswilliams.projecteuler.sequences.factories.GeneratorBackedProductsOfThreeDigitsSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.factories.ProductsOfThreeDigitsSequenceFactory;

public class Problem4LargestPalindromeProductSolver {
    private final ProductsOfThreeDigitsSequenceFactory sequenceFactory;
    private final FilterFactory filterFactory;

    public Problem4LargestPalindromeProductSolver(ProductsOfThreeDigitsSequenceFactory sequenceFactory, FilterFactory filterFactory) {

        this.sequenceFactory = sequenceFactory;
        this.filterFactory = filterFactory;
    }

    public long solve() {
        return sequenceFactory.buildProductsInDecreasingOrder().findFirst(filterFactory.buildPalindromesFilter());
    }

    public static void main(String[] args) {
        ProductsOfThreeDigitsSequenceFactory sequenceFactory = new GeneratorBackedProductsOfThreeDigitsSequenceFactory();
        FilterFactory filterFactory = new FilterFactoryImpl();
        System.out.println(new Problem4LargestPalindromeProductSolver(sequenceFactory, filterFactory).solve());
    }
}
