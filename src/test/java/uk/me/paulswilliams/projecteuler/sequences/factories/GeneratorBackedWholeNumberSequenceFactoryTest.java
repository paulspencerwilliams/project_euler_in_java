package uk.me.paulswilliams.projecteuler.sequences.factories;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Sequence;
import uk.me.paulswilliams.projecteuler.sequences.GeneratorBackedSequence;
import uk.me.paulswilliams.projecteuler.sequences.factories.GeneratorBackedWholeNumberSequenceFactory;
import uk.me.paulswilliams.projecteuler.sequences.generators.WholeNumberGenerator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratorBackedWholeNumberSequenceFactoryTest {
    @Test
    public void testReturnsAGeneratorBackedSequence() {
        Sequence actual = getSequence();
        assertThat(actual, is(instanceOf(GeneratorBackedSequence.class)));
    }

    @Test
    public void testReturnedSequenceHasAPrimesGeneratorWithSpecifiedBelow ()
    {
        GeneratorBackedSequence actual = (GeneratorBackedSequence) getSequence();
        WholeNumberGenerator generator = (WholeNumberGenerator) actual.getGenerator();
        assertThat(generator, is(instanceOf(WholeNumberGenerator.class)));
        assertThat((generator).getBelow(), is(equalTo(123L)));
    }

    private Sequence getSequence() {
        return new GeneratorBackedWholeNumberSequenceFactory().buildIncreasingWholeNumbersBelow(123);
    }
}
