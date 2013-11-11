package uk.me.paulswilliams.projecteuler.problem1.sequences;

import org.junit.Test;
import uk.me.paulswilliams.projecteuler.problem1.sequences.FibonacciGenerator;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciGeneratorTest {

    @Test
    public void testReturns_1_For_1 () {
        long[] expected = {1};
        long[] actual = getPrimes(1);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_For_2 () {
        long[] expected = {1,2};
        long[] actual = getPrimes(2);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_For_3 () {
        long[] expected = {1,2,3};
        long[] actual = getPrimes(3);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_For_4 () {
        long[] expected = {1,2,3};
        long[] actual = getPrimes(4);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_5_For_5 () {
        long[] expected = {1,2,3,5};
        long[] actual = getPrimes(5);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturns_1_2_3_5_8_For_10 () {
        long[] expected = {1,2,3,5,8};
        long[] actual = getPrimes(10);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testReturnsCurrentValuesFor_For_100 () {
        long[] expected = {1,2,3,5,8,13,21,34,55,89};
        long[] actual = getPrimes(100);
        assertThat(actual, is(equalTo(expected)));
    }


    private long[] getPrimes(int stopsAt) {

        ArrayList<Long> additiveList = new ArrayList<Long>();
        for (long l: new FibonacciGenerator(stopsAt))
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
