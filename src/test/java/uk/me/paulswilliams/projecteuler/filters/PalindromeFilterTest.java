package uk.me.paulswilliams.projecteuler.filters;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PalindromeFilterTest {

    @Test
    public void testMatchesReturnsFalseFor123 () {
        assertThat(new PalindromeFilter().matches(123L), is(equalTo(false)));
    }

    @Test
    public void testMatchesReturnsTrueFor121 () {
        assertThat(new PalindromeFilter().matches(121L), is(equalTo(true)));
    }

}
