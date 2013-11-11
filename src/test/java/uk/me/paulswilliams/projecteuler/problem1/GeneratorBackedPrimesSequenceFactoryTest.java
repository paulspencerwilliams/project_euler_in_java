package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratorBackedPrimesSequenceFactoryTest {
    @Test
    public void testReturnsAGeneratorBackedSequence() throws Exception {
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
