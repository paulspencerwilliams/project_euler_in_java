package uk.me.paulswilliams.projecteuler.problem1.filters;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.problem1.filters.FactorOfFilter;

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
