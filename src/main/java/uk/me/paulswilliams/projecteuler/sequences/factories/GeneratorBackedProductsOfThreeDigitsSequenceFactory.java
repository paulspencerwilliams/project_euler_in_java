package uk.me.paulswilliams.projecteuler.sequences.factories;

import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.generators.ReverseProductsOfThreeDigitsGenerator;

public class GeneratorBackedProductsOfThreeDigitsSequenceFactory implements ProductsOfThreeDigitsSequenceFactory {

    @Override
    public Sequence buildProductsInDecreasingOrder() {
        return new GeneratorBackedSequence(new ReverseProductsOfThreeDigitsGenerator());
    }
}
