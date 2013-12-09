package uk.me.paulswilliams.projecteuler.filters;

import org.junit.Before;
import org.junit.Test;
import uk.me.paulswilliams.projecteuler.Filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DivisibleByAllFrom1To20FilterTest {
    private Filter sut;

    @Before
    public void SetUp ()
    {
        sut = new DivisibleByAllFrom1To20Filter();
    }

    @Test
    public void testDoesNotMatchUnder2520 () {
        for (int i = 1; i < 2520; i++)
        {
            assertThat(String.format("Trying %n" + i, i), sut.matches(i), is(false));
        }
    }


    @Test
    public void testMatches2520 () {
        assertThat(sut.matches(232792560), is(true));
    }
}
