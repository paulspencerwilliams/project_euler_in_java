package uk.me.paulswilliams.projecteuler.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.sequences.LazyWholeNumbersSequence;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LazyWholeNumbersGeneratorTest {

    @Test
    public void testReturns_empty_For_1 () {
        long[] expected = {};
        long[] actual = getWholeNumbers(1);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_For_2 () {
        long[] expected = {1};
        long[] actual = getWholeNumbers(2);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_For_3 () {
        long[] expected = {1,2};
        long[] actual = getWholeNumbers(3);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_For_4 () {
        long[] expected = {1,2,3};
        long[] actual = getWholeNumbers(4);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_99_whole_numbers_for_100 () {
        long[] actual = getWholeNumbers(100);
        assertThat(actual.length, is(equalTo(99)));
    }

    private long[] getWholeNumbers(int below) {

        ArrayList<Long> additiveList = new ArrayList<Long>();
        for (long l: new LazyWholeNumbersSequence(below))
        {
            additiveList.add(l);
        }
        return toLongArray(additiveList);
    }

    private long[] toLongArray(ArrayList<Long> arrayList) {
        long[] array = new long[arrayList.size()];
        for (int i =0; i < array.length; i++)
        {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
