package uk.me.paulswilliams.projecteuler.problem1.filters;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.problem1.filters.EvenFilter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EvenFilterTest {

    @Test
    public void testMatchesReturnsTrueForEvenNumbers() {
        assertThat(new EvenFilter().matches(2), is(true));
    }

    @Test
    public void testMatchesReturnsFalseForOddNumbers() {
        assertThat(new EvenFilter().matches(1), is(false));
    }
}
