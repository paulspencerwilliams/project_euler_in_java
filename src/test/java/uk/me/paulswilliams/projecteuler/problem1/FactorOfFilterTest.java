package uk.me.paulswilliams.projecteuler.problem1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactorOfFilterTest {

    @Test
    public void testMatchesForFactorOf() {
        assertThat(new FactorOfFilter(100).matches(10), is(true));
    }

    @Test
    public void testDoesNotMatchForNonFactorOf() {
        assertThat(new FactorOfFilter(100).matches(9), is(false));
    }
}
