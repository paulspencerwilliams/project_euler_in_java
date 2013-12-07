package uk.me.paulswilliams.projecteuler.sequences.factories;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratorBackedProductsOfThreeDigitsSequenceFactoryTest {
    @Test
    public void testReturnsAGeneratorBackedSequence() {
        Sequence actual = getSequence();
        assertThat(actual, is(instanceOf(GeneratorBackedSequence.class)));
    }


    private Sequence getSequence() {
        return new GeneratorBackedProductsOfThreeDigitsSequenceFactory().buildProductsInDecreasingOrder();
    }
}
