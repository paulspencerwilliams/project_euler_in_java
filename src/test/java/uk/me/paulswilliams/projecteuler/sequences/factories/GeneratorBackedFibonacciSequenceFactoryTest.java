package uk.me.paulswilliams.projecteuler.sequences.factories;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.factories.GeneratorBackedFibonacciSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.generators.FibonacciGenerator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratorBackedFibonacciSequenceFactoryTest {
    @Test
    public void testReturnsAGeneratorBackedSequence() {
        Sequence actual = getSequence();
        assertThat(actual, is(instanceOf(GeneratorBackedSequence.class)));
    }

    @Test
    public void testReturnedSequenceHasAFibonacciGeneratorWithSpecifiedStartsAt ()
    {
        GeneratorBackedSequence actual = (GeneratorBackedSequence) getSequence();
        FibonacciGenerator generator = (FibonacciGenerator) actual.getGenerator();
        assertThat(generator, is(instanceOf(FibonacciGenerator.class)));
        assertThat((generator).getStopsAt(), is(equalTo(123L)));
    }

    private Sequence getSequence() {
        return new GeneratorBackedFibonacciSequenceFactory().buildIncreasingFibonacciSequenceStoppingAt(123);
    }
}
