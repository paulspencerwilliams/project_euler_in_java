package uk.me.paulswilliams.projecteuler.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;

import java.util.ArrayList;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LazyWholeNumbersGeneratorTest {

    @Test
    public void testReturns_empty_For_0 () {
        long[] expected = {};
        long[] actual = getWholeNumbers(0);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_For_1 () {
        long[] expected = {1};
        long[] actual = getWholeNumbers(1);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_For_2 () {
        long[] expected = {1,2};
        long[] actual = getWholeNumbers(2);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_For_3 () {
        long[] expected = {1,2,3};
        long[] actual = getWholeNumbers(3);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_100_whole_numbers_for_100 () {
        long[] actual = getWholeNumbers(100);
        assertThat(actual.length, is(equalTo(100)));
    }

    @Test
    public void testReturns_1000_whole_numbers_for_null() {
        Iterator<Long> iterator = new LazyWholeNumbersSequence().iterator();
        for (int i = 0; i < 999; i++) {
            iterator.next();
        }
        assertThat(iterator.next(), is(equalTo(1000L)));
    }

    private long[] getWholeNumbers(int stopsAt) {
        return SequenceToArrayConverter.getArray(new LazyWholeNumbersSequence(stopsAt));
    }

}
