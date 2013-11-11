package uk.me.paulswilliams.projecteuler.problem1.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.problem1.Sequence;
import uk.me.paulswilliams.projecteuler.problem1.sequences.FibonacciGenerator;
import uk.me.paulswilliams.projecteuler.problem1.sequences.GeneratorBackedFibonacciSequenceFactory;
import uk.me.paulswilliams.projecteuler.problem1.sequences.GeneratorBackedSequence;

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
