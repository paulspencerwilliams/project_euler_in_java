package uk.me.paulswilliams.projecteuler.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratorBackedPrimesSequenceFactoryTest {
    @Test
    public void testReturnsAGeneratorBackedSequence() {
        Sequence actual = getSequence();
        assertThat(actual, is(instanceOf(GeneratorBackedSequence.class)));
    }

    @Test
    public void testReturnedSequenceHasAPrimesGeneratorWithSpecifiedStartsAt ()
    {
        GeneratorBackedSequence actual = (GeneratorBackedSequence) getSequence();
        PrimesNumberGenerator generator = (PrimesNumberGenerator) actual.getGenerator();
        assertThat(generator, is(instanceOf(PrimesNumberGenerator.class)));
        assertThat((generator).getStartsAt(), is(equalTo(123L)));
    }

    private Sequence getSequence() {
        return new GeneratorBackedPrimesSequenceFactory().buildDecreasingPrimesSequence(123);
    }


}
